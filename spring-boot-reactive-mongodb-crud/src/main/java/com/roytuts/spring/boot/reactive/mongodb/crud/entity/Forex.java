package com.roytuts.spring.boot.reactive.mongodb.crud.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "forex")
public class Forex {

	@Id
	private String id;
	private String fromCur;
	private String toCur;
	private Double rateCur;

	public Forex() {
	}

	public Forex(String fromCur, String toCur, Double rateCur) {
		this.fromCur = fromCur;
		this.toCur = toCur;
		this.rateCur = rateCur;
	}

	public Forex(String id, String fromCur, String toCur, Double rateCur) {
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
