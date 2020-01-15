package com.mss.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.product.model.Products;



public interface Prepository extends JpaRepository<Products, Long> {

	

}
