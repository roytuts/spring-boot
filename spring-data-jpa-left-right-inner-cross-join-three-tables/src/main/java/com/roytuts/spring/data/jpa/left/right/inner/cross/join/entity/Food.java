package com.roytuts.spring.data.jpa.left.right.inner.cross.join.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "food")
public class Food implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name")
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Company company;

	@OneToMany(targetEntity = Sale.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
	private Set<Sale> sales;

	// getters and setters

}
