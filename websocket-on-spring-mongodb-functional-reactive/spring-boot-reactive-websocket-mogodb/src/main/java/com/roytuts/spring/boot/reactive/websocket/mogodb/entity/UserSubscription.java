package com.roytuts.spring.boot.reactive.websocket.mogodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserSubscription")
public class UserSubscription {

	@Id
	private String id;
	private String email;

	public UserSubscription() {
	}

	public UserSubscription(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
