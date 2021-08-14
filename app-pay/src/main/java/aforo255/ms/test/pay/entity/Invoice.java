package aforo255.ms.test.pay.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_invoice")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdInvoice; 
	@Column(name="amount")
	private double amount;
	@Column(name="state")
	private Integer state;
	public Integer getIdInvoice() {
		return IdInvoice;
	}
	public void setIdInvoice(Integer idInvoice) {
		IdInvoice = idInvoice;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	} 
	
	
}

