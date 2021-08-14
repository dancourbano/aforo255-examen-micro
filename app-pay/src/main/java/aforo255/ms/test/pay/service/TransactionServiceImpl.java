package aforo255.ms.test.pay.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aforo255.ms.test.pay.entity.Transaction;
import aforo255.ms.test.pay.repository.TransactionRepository;


@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public List<Transaction> findAll() {
		return transactionRepository.findAll();
	}
	@Override
	public void save(Transaction transaction) {
		transaction.setDateTransaction(new Date());
		transactionRepository.save(transaction);
	}
	@Override
	public void updateTransactionMQ(Transaction transaction) {
		// TODO Auto-generated method stub
		
	}
	 
}
