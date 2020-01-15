package com.mss.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mss.product.model.Products;
import com.mss.product.repository.Prepository;

@RestController
public class Pcontroller {
	@Autowired
	Prepository ur;

	@PostMapping("/add")
	public Products addProduct(@RequestBody Products Pr) {

		return ur.save(Pr);
	}

	@GetMapping("/get")
	public List<Products> getAllProductDetails() {
		return ur.findAll();
	}

	@GetMapping("/gt/{id}")
	public Optional<Products> getProductDetailById(@PathVariable Long product_id) {
		return ur.findById(product_id);

	}

	@GetMapping("/count")
	public long list() {
		return ur.count();
	}

	@DeleteMapping("/del/{id}")
	public void deleteProductDetails(Products Pr) {
		ur.delete(Pr);

	}

	@PutMapping("/update")
	public Products updateProduct(@RequestBody Products Pr) {
		return ur.save(Pr);
	}

}
