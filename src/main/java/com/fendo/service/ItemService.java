package com.fendo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.fendo.dao.ItemDao;
import com.fendo.entity.Item;

@Service
public class ItemService {

	@Autowired
	ItemDao itemDao;
	public ModelAndView getItemsService() {
		ModelAndView modelAndView=new ModelAndView();
		List<Item> items=itemDao.getItems();
		
		modelAndView.setViewName("purchase");
		modelAndView.addObject("items", items);
		return modelAndView;
	}
	
	
	public ModelAndView updateItemsByItemNameService(Item item) {
		ModelAndView modelAndView=new ModelAndView();
		itemDao.updateItems(item);
		List<Item> items=itemDao.getItems();
		modelAndView.setViewName("purchase");
		modelAndView.addObject("items", items);
		return modelAndView;
	}

// 不用
//	public ModelAndView getSingleItemsByNameService(Item item) {
//		
//		ModelAndView modelAndView=new ModelAndView();
//		List<Item> items=itemDao.getItems();
//		
//		modelAndView.setViewName("purchase");//这里不应该返回 明天具体设计
//		modelAndView.addObject("items", items);
//		return modelAndView;
//	}

}
