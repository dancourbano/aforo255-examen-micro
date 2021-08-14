package aforo255.ms.test.pay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aforo255.ms.test.pay.entity.Operation;


@Repository
public interface OperationRepository  extends JpaRepository<Operation,Integer>{

}
