package aforo255.ms.test.invoice.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import aforo255.ms.test.invoice.service.InvoiceEvents;

@Component
public class ConsumerListener {
	@Autowired
	private InvoiceEvents _invoiceEvents;
	private Logger log = LoggerFactory.getLogger(ConsumerListener.class);
	@KafkaListener(topics = {"invoice-events"})
	public void OnMessage(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		log.info("*************** MICROSERVICE Invoice *******************");
		log.info("ConsumerRecord : {}", consumerRecord.value());
		
		_invoiceEvents.processTransactionEvent(consumerRecord);
	}
}