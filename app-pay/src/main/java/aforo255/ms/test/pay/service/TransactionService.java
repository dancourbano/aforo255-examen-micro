package aforo255.ms.test.pay.service;


import java.util.List;

import aforo255.ms.test.pay.entity.Transaction;



public interface TransactionService {
	public List<Transaction> findAll();
	public void save(Transaction transaction);
	public void updateTransactionMQ(Transaction transaction);
}
