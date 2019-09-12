package com.roytuts.cc.model;

public class CurrencyConversion {

	private Integer id;
	private String from;
	private String to;
	private Double rate;
	private Integer quantity;
	private Double totalAmount;

	public CurrencyConversion() {
	}

	public CurrencyConversion(Integer id, String from, String to, Double rate, Integer quantity,
			Double totalAmount) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.rate = rate;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
