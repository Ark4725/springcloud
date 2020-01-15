package com.mss.order.controller;

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

import com.mss.order.model.Order;
import com.mss.order.repository.Orepository;


@RestController
public class Ocontroller {
	@Autowired
	Orepository ur;

	@PostMapping("/add")
	public Order addOrder(@RequestBody Order Or) {

		return ur.save(Or);
	}

	@GetMapping("/get")
	public List<Order> getAllOrderDetails() {
		return ur.findAll();
	}

	@GetMapping("/gt/{id}")
	public Optional<Order> getOrderDetailById(@PathVariable Long id) {
		return ur.findById(id);

	}

	@GetMapping("/count")
	public long list() {
		return ur.count();
	}

	@PutMapping("/update")
	public Order updateOrder(@RequestBody Order Or) {
		return ur.save(Or);
	}

	@DeleteMapping("/del/{id}")
	public void deleteOrderDetails(Order Or) {
		ur.delete(Or);

	}

}
