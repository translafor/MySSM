package com.fendo.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fendo.entity.Order;
import com.fendo.service.OrderService;



@Controller
public class OrderController {
	
	
	@Autowired
	private OrderService orderService;
      
	/**
	 * ��ȡȫ���ͻ���Ϣ�߼�
	 */
    @RequestMapping("/getOrders")  
    public ModelAndView getOrders(@RequestParam(value = "adminName", required = true) String adminName,
    		  @RequestParam(value = "adminPwd", required = true) String adminPwd,HttpSession session){  
    	/*��@RequestParamע�����httpservlet��get..����*/
    	ModelAndView modelAndView=new ModelAndView(); 
    	
    	session.setAttribute("adminName", adminName);
    	modelAndView=orderService.getOrdersService(adminName,adminPwd);
    	  
            
            return modelAndView; 
          
    }  
    
    /**
	 *  ͨ�����ֻ�ȡ�ͻ���Ϣ�߼�
	 */
    @RequestMapping("/getOrdersBycustName")  
    public ModelAndView getOrdersBycustName(@RequestParam(value = "custName", required = false) String custName){  
    	ModelAndView modelAndView=new ModelAndView(); 
    	
    	
    	
    	modelAndView=orderService.getOrdersBycustNameService(custName);
    	  
            
            return modelAndView; 
          
    }
    
    /**
	 * ͨ��statu(����״̬)��ȡ�ͻ���Ϣ�߼�
	 */
    @RequestMapping("/getOrdersBystatu")  
    public ModelAndView getOrdersBystatu(@RequestParam(value = "statu", required = true) String s,HttpSession session){  
    	ModelAndView modelAndView=new ModelAndView(); 
    	
    	int statu=Integer.parseInt(s);
    	modelAndView=orderService.getOrdersBystatuService(statu);
    	
    	return modelAndView;
          
    }
    
    /**
     * ����Ա��¼�����߼�
     */
    @RequestMapping("/login")
    public ModelAndView Login(@RequestParam(value = "adminName", required = false) String adminName,@RequestParam(value = "adminPwd", required = false) String adminPwd,HttpSession session){
    	ModelAndView modelAndView=new ModelAndView(); 
    	
    	session.setAttribute("adminName", adminName);
    	modelAndView=orderService.handleLoginService(adminName,adminPwd,session);
    	
    	return modelAndView;
    	
    	
    }
    
    
    /**
     * ����û���Ϣ�߼�
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
     * ɾ���û���Ϣ�߼�
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
