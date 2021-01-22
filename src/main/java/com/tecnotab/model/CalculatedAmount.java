package com.tecnotab.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CalculatedAmount {

	@Id
	private Long id;
	@Column(name = "from_conversion")
	private String from;
	@Column(name = "to_conversion")
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;
	private BigDecimal amount;
	private int port;
	public CalculatedAmount() {
		super();
	}
	public CalculatedAmount(long id,String from, String to, BigDecimal quantity, BigDecimal conversionMultiple, BigDecimal amount) {
		super();
		this.id=id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple=conversionMultiple;
		this.amount = amount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionFactor) {
		this.conversionMultiple = conversionFactor;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
