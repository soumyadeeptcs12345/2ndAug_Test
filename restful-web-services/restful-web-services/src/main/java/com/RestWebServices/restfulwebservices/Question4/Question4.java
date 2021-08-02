package com.RestWebServices.restfulwebservices.Question4;

import java.util.Date;

public class Question4 {
	
	private Integer productid;
	private String Timestamp;
	private Integer quantity;
	private String status;
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(String timestamp) {
		Timestamp = timestamp;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Question4 [productid=" + productid + ", Timestamp=" + Timestamp + ", quantity=" + quantity + ", status="
				+ status + ", getProductid()=" + getProductid() + ", getTimestamp()=" + getTimestamp()
				+ ", getQuantity()=" + getQuantity() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Question4(Integer productid, String timestamp, Integer quantity, String status) {
		super();
		this.productid = productid;
		Timestamp = timestamp;
		this.quantity = quantity;
		this.status = status;
	}



	

}
