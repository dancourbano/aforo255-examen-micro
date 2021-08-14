package aforo255.ms.test.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aforo255.ms.test.invoice.entity.Invoice;
import aforo255.ms.test.invoice.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements  InvoiceService{
	
	@Autowired
	private InvoiceRepository invoiceRepository; 
	
	@Override
	public void save(Invoice invoice) {
		invoiceRepository.save(invoice);
		
	}

	@Override
	public List<Invoice> findAll() {
		return invoiceRepository.findAll();
	}
	
	@Override
	public Invoice findById(Integer id) {
		return invoiceRepository.findById(id).get();
	}

}
