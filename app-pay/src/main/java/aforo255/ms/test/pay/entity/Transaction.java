package aforo255.ms.test.pay.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction  implements Serializable{

	
	private static final long serialVersionUID = 1L;	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTransaction;
	@Column(name = "id_invoice")
    private Integer idInvoice;
	@Column(name = "amount")
	private Double amount ;	 
	@Column(name = "date_transaction")
    private Date dateTransaction;
	public Integer getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(Integer idTransaction) {
		this.idTransaction = idTransaction;
	}
	public Integer getIdInvoice() {
		return idInvoice;
	}
	public void setIdInvoice(Integer idInvoice) {
		this.idInvoice = idInvoice;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	
	
}
