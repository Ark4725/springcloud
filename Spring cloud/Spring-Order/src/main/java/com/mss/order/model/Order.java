package com.mss.order.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order_APAPPALA")

public class Order {
	@Id
	@GeneratedValue
	private long Order_id;
	private long user_id;;
	private String Order_name;

	public String getOrder_name() {
		return Order_name;
	}

	public void setOrder_name(String order_name) {
		Order_name = order_name;
	}

	private long Product_id;

	public long getOrder_id() {
		return Order_id;
	}

	public void setOrder_id(long order_id) {
		Order_id = order_id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(long product_id) {
		Product_id = product_id;
	}

}
