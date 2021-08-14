package aforo255.ms.test.pay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aforo255.ms.test.pay.entity.Operation;
import aforo255.ms.test.pay.repository.OperationRepository;

@Service
public class OperationServiceImpl implements OperationService{
	
	@Autowired
	OperationRepository operationRepository;
	
	@Override
	public List<Operation> findAll() {
		// TODO Auto-generated method stub
		return operationRepository.findAll();
	}

	@Override
	public void payInvoice(Operation operation) {
		operationRepository.save(operation);
		
	}

}
