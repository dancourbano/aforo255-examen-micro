package aforo255.ms.test.transaction.service;


import java.util.List;

import aforo255.ms.test.transaction.entity.Transaction;


public interface TransactionService {
	public List<Transaction> findAll();
	public void save(Transaction transaction);
	public void updateTransactionMQ(Transaction transaction);
}
