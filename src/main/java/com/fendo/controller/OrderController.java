package com.fendo.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fendo.entity.Order;
import com.fendo.service.OrderService;



@Controller
public class OrderController {
	
	
	@Autowired
	private OrderService orderService;
      
	/**
	 * 获取全部客户信息逻辑
	 */
    @RequestMapping("/getOrders")  
    public ModelAndView getOrders(HttpServletRequest request,HttpSession session){  
    	ModelAndView modelAndView=new ModelAndView(); 
    	
    	String adminName=request.getParameter("adminName");
    	String adminPwd=request.getParameter("adminPwd");
    	session.setAttribute("adminName", adminName);
    	modelAndView=orderService.getOrdersService(adminName,adminPwd);
    	  
            
            return modelAndView; 
          
    }  
    
    /**
	 *  通过名字获取客户信息逻辑
	 */
    @RequestMapping("/getOrdersBycustName")  
    public ModelAndView getOrdersBycustName(HttpServletRequest request){  
    	ModelAndView modelAndView=new ModelAndView(); 
    	
    	String custName=request.getParameter("custName");
    	
    	modelAndView=orderService.getOrdersBycustNameService(custName);
    	  
            
            return modelAndView; 
          
    }
    
    /**
	 * 通过statu(订单状态)获取客户信息逻辑
	 */
    @RequestMapping("/getOrdersBystatu")  
    public ModelAndView getOrdersBystatu(HttpServletRequest request,HttpSession session){  
    	ModelAndView modelAndView=new ModelAndView(); 
    	
    	String s=request.getParameter("statu");
    	int statu=Integer.parseInt(s);
    	modelAndView=orderService.getOrdersBystatuService(statu);
    	
    	return modelAndView;
          
    }
    
    /**
     * 管理员登录检验逻辑
     */
    @RequestMapping("/login")
    public ModelAndView Login(HttpServletRequest request,HttpSession session){
    	ModelAndView modelAndView=new ModelAndView(); 
    	
    	String adminName=request.getParameter("adminName");
    	String adminPwd=request.getParameter("adminPwd");
    	session.setAttribute("adminName", adminName);
    	modelAndView=orderService.handleLoginService(adminName,adminPwd,session);
    	
    	return modelAndView;
    	
    	
    }
    
    
    /**
     * 添加用户信息逻辑
     */
    @RequestMapping("/addOrder")
    public ModelAndView addOrders(HttpSession session,HttpServletRequest request){
    	Order order=new Order();
    	ModelAndView modelAndView=new ModelAndView();
    	SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-mm-dd");
    	String adminName=request.getParameter("adminName");
    	String custName=request.getParameter("custName");
    	String prodName=request.getParameter("prodName");
    	String orderCount01=request.getParameter("orderCount");
    	double orderCount=Double.parseDouble(orderCount01);
    	String orderDate01=request.getParameter("orderDate");
    	Date orderDate;
		try {
			orderDate = bartDateFormat.parse(orderDate01);
			order.setOrderDate(orderDate);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
    	String statu01=request.getParameter("statu");
    	int statu=Integer.parseInt(statu01);
    	order.setCustName(custName);
    	order.setProdName(prodName);
    	order.setOrderCount(orderCount);
    	order.setStatu(statu);
    	session.setAttribute("adminName", adminName);
    	modelAndView=orderService.addOrdersService(order);
    	return modelAndView;
    }
    
    /**
     * 删除用户信息逻辑
     */
    @RequestMapping("/deleteOrder")
    public ModelAndView deleteOrders(HttpSession session,HttpServletRequest request){
    	Order order=new Order();
    	ModelAndView modelAndView=new ModelAndView();
    	
    	String adminName=request.getParameter("adminName");
    	String custName=request.getParameter("custName");
    	String prodName=request.getParameter("prodName");
    	String statu01=request.getParameter("statu");
    	int statu=Integer.parseInt(statu01);
    	order.setCustName(custName);
    	order.setProdName(prodName);
    	order.setStatu(statu);
    	session.setAttribute("adminName", adminName);
    	modelAndView=orderService.deleteOrdersService(order);
    	return modelAndView;
    }
    

}
