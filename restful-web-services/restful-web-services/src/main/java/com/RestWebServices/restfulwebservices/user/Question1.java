package com.RestWebServices.restfulwebservices.user;

import java.util.Date;

public class Question1 {
	
	private int productid;
	private String productname;
	private String unitofMeasure;
	private String status;
	
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getUnitofMeasure() {
		return unitofMeasure;
	}
	public void setUnitofMeasure(String unitofMeasure) {
		this.unitofMeasure = unitofMeasure;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Question1(int productid, String productname, String unitofMeasure, String status) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.unitofMeasure = unitofMeasure;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Question1 [productid=" + productid + ", productname=" + productname + ", unitofMeasure=" + unitofMeasure
				+ ", status=" + status + "]";
	}
	
	
	
}
	
	


