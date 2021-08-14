package aforo255.ms.test.transaction.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import aforo255.ms.test.transaction.entity.Operation;
import aforo255.ms.test.transaction.entity.Transaction;


@Service
public class TransactionEvents {
	@Autowired
	private TransactionService transactionService;
	private Logger log = LoggerFactory.getLogger(TransactionEvents.class);
	@Autowired
	private ObjectMapper objectMapper ;	
	
	
	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		Operation  object=objectMapper.readValue (consumerRecord.value(), Operation.class);
		Transaction transaction=convertirToTransaction(object);
		transactionService.save(transaction);
		log.info("Se ha guardado la transaction del pago");
	}


	private Transaction convertirToTransaction(Operation object) {
		Transaction  transaction=new Transaction();
		transaction.setAmount(object.getAmount());
		transaction.setIdInvoice(object.getIdInvoice());
		transaction.setDateTransaction(object.getDatetime());
		return transaction;
	}
}
