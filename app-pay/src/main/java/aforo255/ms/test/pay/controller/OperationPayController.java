package aforo255.ms.test.pay.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import aforo255.ms.test.pay.entity.Operation;
import aforo255.ms.test.pay.producer.InvoiceEventProducer;
import aforo255.ms.test.pay.producer.TransactionEventProducer;
import aforo255.ms.test.pay.service.OperationService;

@RestController
public class OperationPayController {
	private Logger log = LoggerFactory.getLogger(OperationPayController.class);
	@Autowired
	private OperationService operationService;
	@Autowired
	private TransactionEventProducer transactionEventProducer;
	
	@Autowired
	private InvoiceEventProducer invoiceEventProducer;
	
	@GetMapping("/all")
	public List<Operation> listar() {
		return operationService.findAll();
	}
	
	@PostMapping("/pay")
	public ResponseEntity<Object> pagarFactura(@RequestBody Operation operation)  throws JsonProcessingException{
		operation.setDatetime(new Date());
		operationService.payInvoice(operation);
		invoiceEventProducer.sendInvoiceEvent(operation);
		transactionEventProducer.sendTransactionEvent(operation);
		log.info("despues de realizar pago");
		return ResponseEntity.status(HttpStatus.CREATED).body(operation);
	}
}
