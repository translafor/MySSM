package com.fendo.dao;

import java.util.List;

import com.fendo.entity.Order;



public interface OrderDao {
	public List<Order> getOrders();

	public void addOrder(Order order);

	public List<Order> getOrdersBycustName(Order order);

	public List<Order> getOrdersBystatu(Order order);

	
}
