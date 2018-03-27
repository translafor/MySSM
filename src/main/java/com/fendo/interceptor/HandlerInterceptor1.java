package com.fendo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HandlerInterceptor1 implements HandlerInterceptor {

	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HttpSession session=request.getSession();
		  
        //从session中取出用户信息  
        String adminName=(String)session.getAttribute("adminName");  
          
        if(adminName!=null){  
            //身份存在，放行  
            return true;  
        }  
          
        //执行这里表示用户身份需要验证，跳转到登录界面  
        session.setAttribute("error", "需要先登录！！");
        request.getRequestDispatcher("index.jsp").forward(request, response);
		return false;
	}
	
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO 自动生成的方法存根

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO 自动生成的方法存根

	}

	

}
