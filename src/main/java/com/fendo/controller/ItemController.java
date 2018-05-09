package com.fendo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fendo.entity.Item;
import com.fendo.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	/**
	 * 获取全部物品信息逻辑
	 */
	@RequestMapping("/getAllItems")
	public ModelAndView getItems(){
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView=itemService.getItemsService();
		return modelAndView;
		
	}
	
	//直接在update中判断即可
//	/**
//	 * 获取单个物品信息逻辑
//	 */
//	@RequestMapping("/getAllItems")
//	public ModelAndView getSingleItemsByItemName(@RequestParam(value = "itemName", required = false) String itemName){
//		
//		ModelAndView modelAndView=new ModelAndView();
//		Item item=new Item();
//		item.setItemName(itemName);
//		modelAndView=itemService.getSingleItemsByNameService(item);
//		return modelAndView;
//		
//	}
	
	@RequestMapping("/updateItemsByItemName")
	public ModelAndView updateItems(@RequestParam(value = "itemName", required = false) String itemName){
		
		ModelAndView modelAndView=new ModelAndView();
		Item item=new Item();
		item.setItemName(itemName);
		modelAndView=itemService.updateItemsByItemNameService(item);
		return modelAndView;
		
	}

}
