package aforo255.ms.test.transaction.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import aforo255.ms.test.transaction.entity.Transaction;

@Repository
public interface TransactionRepository  extends MongoRepository<Transaction, Integer> {
}
