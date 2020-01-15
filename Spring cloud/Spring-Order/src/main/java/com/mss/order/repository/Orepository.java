package com.mss.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.order.model.Order;

public interface Orepository extends JpaRepository<Order, Long>{

}
