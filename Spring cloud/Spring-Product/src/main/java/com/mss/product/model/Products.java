package com.mss.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product_APAPPALA")
public class Products {
	@Id
	@GeneratedValue
	private long Product_id;
	private String Product_name;
	private long Order_id;

	public long getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(long product_id) {
		Product_id = product_id;
	}

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public long getOrder_id() {
		return Order_id;
	}

	public void setOrder_id(long order_id) {
		Order_id = order_id;
	}

}
