package aforo255.ms.test.invoice.service;

import java.util.List;

import aforo255.ms.test.invoice.entity.Invoice;

public interface InvoiceService {
	public void save(Invoice invoice);

	public List<Invoice> findAll();
	
	Invoice findById(Integer id);
}
