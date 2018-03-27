<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	request.setAttribute("domain", "http://localhost:8080/my-SSM/");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>查询界面</title>
<link rel="stylesheet" type="text/css" href="${domain }css/myfirst.css">
</head>
<body>
	<svg xmlns="http://www.w3.org/2000/svg" version="1.1" height="190">
	   <polygon points="100,10 40,180 190,60 10,60 160,180"
	   		style="fill:blue;stroke:red;stroke-width:3;fill-rule:evenodd;" />
	</svg>
	<header>
		<h1>总览</h1>
	</header>
	<nav>
		<br/>
		<br/>
		<br/>
		功能<br>
		大全<br>
	</nav>
	<section>
		<h1>这里提供多种查询方式</h1>
		<ul>
		<li>查询所有的信息</li>
		<li>通过名字查询对应的信息</li>
		<li>通过statu(订单状态)查询对应的信息</li>
		</ul>
	</section>
	<footer>
		查询页面
	</footer>
	<br/>
   	<p2>查询所有的信息：</p2><br/>
	   	<form action="getOrders.action" method="post">  
	    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="查询"/><br/>  
	    </form>
	 <br/>
	<p2>通过名字查询：</p2><br/>
	<form action="getOrdersBycustName.action" method="post">
		custName：<input type="text" name="custName"/>  
	    <input type="submit" value="查询"/><br/>  
	    </form>
	    <br/>
	<p2>通过statu查询：</p2><br/>
	<form action="getOrdersBystatu.action" method="post">
	statu：<input type="text" name="statu"/>   
	    &nbsp&nbsp&nbsp<input type="submit" value="查询"/><br/>  
	    </form>
</body>
</html>