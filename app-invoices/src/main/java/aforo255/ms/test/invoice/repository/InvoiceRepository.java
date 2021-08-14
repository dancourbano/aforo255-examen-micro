package aforo255.ms.test.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aforo255.ms.test.invoice.entity.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Integer>{

}
