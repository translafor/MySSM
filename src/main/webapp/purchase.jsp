<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<!-- EL表达式生效 -->  
<%@ page isELIgnored="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购买界面</title>
<link rel="stylesheet" type="text/css" href="${domain }css/myfirst.css">
</head>
<body>
	<h4>物品信息表：</h4>
    <table border="1" bgcolor="yellow"> 
    <caption>物品信息</caption> 
        <tr>  
            <th>商品名称</th>  
            <th>商品价格</th>  
            <th>商品余量</th>    
        </tr>  
        <c:forEach items="${items}" var="p">  
            <tr>  
                <td>${p.itemName}</td>  
                <td>${p.itemPrice}</td>  
                <td>${p.itemCount}</td> 
            </tr>  
        </c:forEach>  
    </table>
    
    <p2>输入要购买的商品：</p2><br/>
	<form action="updateItemsByItemName.action" method="post">
		custName：<input type="text" name="itemName"/>  
	    <input type="submit" value="购买"/><br/>  
	    </form>
	    <br/> 
</body>
</html>