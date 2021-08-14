package aforo255.ms.test.transaction.entity;

import java.io.Serializable;
import java.sql.Date;



public class Operation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer idOperation; 
    private Integer idInvoice;
    private double amount;
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
