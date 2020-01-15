package com.mss.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_APAPPALA")

public class User {
	@Id
	@GeneratedValue
	private long  user_id;
	private String user_name;
	private String adress;
	private long Order_id;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public long getOrder_id() {
		return Order_id;
	}

	public void setOrder_id(long order_id) {
		Order_id = order_id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}



	

}
