package com.roytuts.spring.boot.reactive.mongodb.crud.vo;

public class ForexVo {

	private String id;
	private String fromCur;
	private String toCur;
	private Double rateCur;

	public ForexVo() {
	}

	public ForexVo(String id, String fromCur, String toCur, Double rateCur) {
		this.id = id;
		this.fromCur = fromCur;
		this.toCur = toCur;
		this.rateCur = rateCur;
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

}
