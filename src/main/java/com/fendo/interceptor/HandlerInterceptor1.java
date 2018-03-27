package com.fendo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HandlerInterceptor1 implements HandlerInterceptor {

	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HttpSession session=request.getSession();
		  
        //��session��ȡ���û���Ϣ  
        String adminName=(String)session.getAttribute("adminName");  
          
        if(adminName!=null){  
            //��ݴ��ڣ�����  
            return true;  
        }  
          
        //ִ�������ʾ�û������Ҫ��֤����ת����¼����  
        session.setAttribute("error", "��Ҫ�ȵ�¼����");
        request.getRequestDispatcher("index.jsp").forward(request, response);
		return false;
	}
	
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO �Զ����ɵķ������

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO �Զ����ɵķ������

	}

	

}
