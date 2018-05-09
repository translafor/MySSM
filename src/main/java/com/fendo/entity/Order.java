package com.fendo.entity;

import java.util.Date;

import javax.validation.constraints.Pattern;

public class Order {
	
	private int orderId;
	private String custName;
	private String prodName;
	private double orderCount;
	private Date orderDate;
	@Pattern(regexp = "[1-2]{1}", message = "reason的类型值为1-2中的一个类型")
	private int statu;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(double orderCount) {
		this.orderCount = orderCount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getStatu() {
		return statu;
	}
	public void setStatu(int statu) {
		this.statu = statu;
	}
	
	public Order(int orderId, String custName, String prodName, double orderCount, Date orderDate, int statu) {
		super();
		this.orderId = orderId;
		this.custName = custName;
		this.prodName = prodName;
		this.orderCount = orderCount;
		this.orderDate = orderDate;
		this.statu = statu;
	}
	
	
	public Order(String custName, String prodName, int statu) {
		super();
		this.custName = custName;
		this.prodName = prodName;
		this.statu = statu;
	}
	public Order(String custName, String prodName, double orderCount, Date orderDate, int statu) {
		super();
		this.custName = custName;
		this.prodName = prodName;
		this.orderCount = orderCount;
		this.orderDate = orderDate;
		this.statu = statu;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", custName=" + custName + ", prodName=" + prodName + ", orderCount="
				+ orderCount + ", orderDate=" + orderDate + ", statu=" + statu + "]";
	}
	

}
