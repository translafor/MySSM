package com.fendo.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.fendo.dao.AdminDao;
import com.fendo.dao.OrderDao;
import com.fendo.entity.Admin;
import com.fendo.entity.Order;

@Service
public class OrderService {
	
	@Autowired  
    private OrderDao orderDao; 
	
	@Autowired
	AdminDao adminDao;

	public ModelAndView getOrdersService(String name, String password) {
		
		ModelAndView modelAndView=new ModelAndView();
		
    		//查数据  
            List<Order> orders=orderDao.getOrders();  
              
            //存起来  
             
            modelAndView.setViewName("success");  
            modelAndView.addObject("orders", orders);
            return modelAndView; 
          
    	
	}

	public ModelAndView addOrdersService(Order order) {
		
		ModelAndView modelAndView=new ModelAndView();
		//加入数据  
        orderDao.addOrder(order);  
          
        //查数据  
        List<Order> orders=orderDao.getOrders();  
          
        //存起来  
         
        modelAndView.setViewName("success");  
        modelAndView.addObject("orders", orders);  
          
        
    	return modelAndView;
		
	}

	public ModelAndView handleLoginService(String adminName, String adminPwd,HttpSession session) {
		
		ModelAndView modelAndView=new ModelAndView();
		Admin admin1=new Admin();
    	admin1.setAdminName(adminName);
    	admin1.setAdminPwd(adminPwd);
    	List<Admin> admins=adminDao.getAdmins(admin1);
    	if(admins.size()==0){
    		  
            //存起来   
            modelAndView.setViewName("index");  
            session.setAttribute("info01", "登录失败");
            return modelAndView; 
          
    	}
          
        session.setAttribute("info02", "登陆成功!请继续您的操作");
        modelAndView.setViewName("First");
		return modelAndView;
	}

	public ModelAndView getOrdersBycustNameService(String custName) {
		
		ModelAndView modelAndView=new ModelAndView();
		//查数据  
		Order order=new Order();
		order.setCustName(custName);
        List<Order> orders=orderDao.getOrdersBycustName(order);  
          
        //存起来  
         
        modelAndView.setViewName("success");  
        modelAndView.addObject("orders", orders);
        return modelAndView; 
	}

	
	public ModelAndView getOrdersBystatuService(int statu) {
		ModelAndView modelAndView=new ModelAndView();
		//查数据  
		Order order=new Order();
		order.setStatu(statu);
        List<Order> orders=orderDao.getOrdersBystatu(order);  
          
        //存起来  
         
        modelAndView.setViewName("success");  
        modelAndView.addObject("orders", orders);
        return modelAndView;
	}

	public ModelAndView deleteOrdersService(Order order) {
		
		ModelAndView modelAndView=new ModelAndView();
		//加入数据  
        orderDao.deleteOrder(order);  
          
        //查数据  
        List<Order> orders=orderDao.getOrders();  
          
        //存起来  
         
        modelAndView.setViewName("success");  
        modelAndView.addObject("orders", orders);  
          
        
    	return modelAndView;
	}

}
