<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<!-- EL表达式生效 -->  
<%@ page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>显示页面</title>  
</head>  
<body>  
	
	<h4>数据表：</h4>
    <table border="1" bgcolor="yellow"> 
    <caption>客户信息</caption> 
        <tr>  
            <th>订单编号</th>  
            <th>客户姓名</th>  
            <th>商品名称</th>  
            <th>订单金额</th>  
            <th>下单日期</th>  
            <th>订单状态</th>  
        </tr>  
        <c:forEach items="${orders}" var="p">  
            <tr>  
                <td>${p.orderId}</td>  
                <td>${p.custName}</td>  
                <td>${p.prodName}</td>
                <td>${p.orderCount}</td>  
                <td>${p.orderDate}</td>  
                <td>${p.statu}</td>  
            </tr>  
        </c:forEach>  
    </table>  
</body>  
</html> 