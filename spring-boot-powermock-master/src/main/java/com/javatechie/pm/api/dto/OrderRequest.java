package com.javatechie.pm.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

	private int id;
	private String name;
	private int quantity;
	private int price;
	private String emailId;
	private boolean isDiscountable;
	public OrderRequest(int i, String string, int j, int k, String string2, boolean b) {
		// TODO Auto-generated constructor stub
		id=i;
		name=string;
		quantity=j;
		price=k;
		emailId=string2;
		isDiscountable=b;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public boolean isDiscountable() {
		return isDiscountable;
	}
	public void setDiscountable(boolean isDiscountable) {
		this.isDiscountable = isDiscountable;
	}
	

}
