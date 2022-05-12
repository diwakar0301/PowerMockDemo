package com.javatechie.pm.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponse {
	private OrderRequest response;
	private String message;
	private int statusCode;
	public OrderResponse(OrderRequest order, String message2, int value) {
		// TODO Auto-generated constructor stub
		response=order;
		message=message2;
		statusCode=value;
	}
	public OrderRequest getResponse() {
		return response;
	}
	public void setResponse(OrderRequest response) {
		this.response = response;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
