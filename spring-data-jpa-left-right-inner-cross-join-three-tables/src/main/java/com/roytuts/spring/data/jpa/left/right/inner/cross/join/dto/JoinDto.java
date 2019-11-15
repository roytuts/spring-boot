package com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto;

public class JoinDto {

	private long saleId;
	private String foodName;
	private String companyName;
	private double amount;

	public JoinDto(long saleId, String foodName, String companyName, double amount) {
		this.saleId = saleId;
		this.foodName = foodName;
		this.companyName = companyName;
		this.amount = amount;
	}

	public long getSaleId() {
		return saleId;
	}

	public void setSaleId(long saleId) {
		this.saleId = saleId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
