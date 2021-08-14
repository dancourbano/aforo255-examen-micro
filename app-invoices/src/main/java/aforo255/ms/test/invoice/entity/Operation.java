package aforo255.ms.test.invoice.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="operation")
public class Operation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_operation")
	private Integer idOperation; 
	
	@Column(name="id_invoice")	
    private Integer idInvoice;
	@Column(name="amount")
    private double amount;
	@CreationTimestamp
	@Column(name="datetime")
	private Date datetime;
	public Integer getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(Integer idOperation) {
		this.idOperation = idOperation;
	}
	public Integer getIdInvoice() {
		return idInvoice;
	}
	public void setIdInvoice(Integer idInvoice) {
		this.idInvoice = idInvoice;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

}
