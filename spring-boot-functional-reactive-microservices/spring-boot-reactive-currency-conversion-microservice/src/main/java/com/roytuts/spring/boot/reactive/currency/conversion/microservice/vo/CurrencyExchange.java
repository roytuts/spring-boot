package com.roytuts.spring.boot.reactive.currency.conversion.microservice.vo;

public class CurrencyExchange {

	private String id;
	private String fromCur;
	private String toCur;
	private Double rateCur;
	private Integer quantity;
	private Double totalAmount;

	public CurrencyExchange() {
	}

	public CurrencyExchange(String id, String fromCur, String toCur, Double rateCur, Integer quantity,
			Double totalAmount) {
		this.id = id;
		this.fromCur = fromCur;
		this.toCur = toCur;
		this.rateCur = rateCur;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFromCur() {
		return fromCur;
	}

	public void setFromCur(String fromCur) {
		this.fromCur = fromCur;
	}

	public String getToCur() {
		return toCur;
	}

	public void setToCur(String toCur) {
		this.toCur = toCur;
	}

	public Double getRateCur() {
		return rateCur;
	}

	public void setRateCur(Double rateCur) {
		this.rateCur = rateCur;
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
