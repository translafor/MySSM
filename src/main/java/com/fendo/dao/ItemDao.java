package com.fendo.dao;

import java.util.List;

import com.fendo.entity.Item;

public interface ItemDao {

	public List<Item> getItems();
	public List<Item> getSingleItems();
	public void updateItems(Item item);

}
