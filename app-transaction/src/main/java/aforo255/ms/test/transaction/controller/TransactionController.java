package aforo255.ms.test.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import aforo255.ms.test.transaction.entity.Transaction;
import aforo255.ms.test.transaction.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/all")
	public List<Transaction> getAll(){		
		return transactionService.findAll();
	}	
	
	@PostMapping("/create")
	public ResponseEntity<Object> create(@RequestBody Transaction transaction){		
		transactionService.save(transaction);
		return ResponseEntity.status(HttpStatus.CREATED).body(transaction);
	}	
}
