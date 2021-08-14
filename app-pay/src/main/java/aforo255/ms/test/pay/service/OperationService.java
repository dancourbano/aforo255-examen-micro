package aforo255.ms.test.pay.service;

import java.util.List;

import aforo255.ms.test.pay.entity.Operation;

public interface OperationService {
	public List<Operation> findAll();
	public void payInvoice (Operation operation);
}
