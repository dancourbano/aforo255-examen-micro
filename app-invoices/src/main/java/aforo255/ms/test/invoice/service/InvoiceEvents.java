package aforo255.ms.test.invoice.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import aforo255.ms.test.invoice.entity.Invoice;
import aforo255.ms.test.invoice.entity.Operation;

@Service
public class InvoiceEvents {
	@Autowired
	private InvoiceService invoiceService;
	private Logger log = LoggerFactory.getLogger(InvoiceEvents.class);
	@Autowired
	private ObjectMapper objectMapper ;	
	
	
	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		Operation  object=objectMapper.readValue (consumerRecord.value(), Operation.class);
		Invoice invoice=invoiceService.findById(object.getIdInvoice());
		Double montoTemporal=invoice.getAmount()-object.getAmount();
		invoice.setAmount(montoTemporal);
		if(montoTemporal<=0 && invoice.getState()!=1) {
			//cancelado la deuda
			invoice.setState(1);		
		} 
		 
		invoiceService.save(invoice);
	}
}
