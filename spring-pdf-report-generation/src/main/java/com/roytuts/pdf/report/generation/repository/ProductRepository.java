package com.roytuts.pdf.report.generation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.pdf.report.generation.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
