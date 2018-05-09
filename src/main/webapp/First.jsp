<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("domain", "http://localhost:8080/my-SSM/");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>首页</title>

<link rel="stylesheet" type="text/css" href="${domain }css/myfirst.css">

</head>
<body>

	<svg xmlns="http://www.w3.org/2000/svg" version="1.1" height="190">
	   <polygon points="100,10 40,180 190,60 10,60 160,180"
	   		style="fill:blue;stroke:red;stroke-width:3;fill-rule:evenodd;" />
	</svg>
	<header>
		<h1>Welcome!!</h1>
</header>

	<nav>
		<br>
		<br>
		<br>
		<br>
		引导<br/>
	</nav>

	<section>
		<h1>简介</h1>
		<p>
			这是一个用户购买信息的管理服务，你可以在这里对用户的信息按照多种
			方式进行查询。
		</p>
		<p>
			当然，如果你是管理员，你可以登录管理员账号，从而对账户信息进行增加。
		</p>
	</section>

	<footer>
		功能
	</footer>
	
	<article>
		<h2>总览</h2>
		<p>事务操作首页</p> 
		<p>你可以在此处进行登录 </p>
		<p>你可以在此处查询数据</p>
		<p>你可以在此处插入数据（但是需要先登录）</p>
	</article>
	
	<br/><!-- 换行及横线 -->
	<hr/>
	${info02 }
	<br/>
	快速登录小窗口：
	<br/>
	<iframe src="index.jsp" width="200" height="200"></iframe><br/>
	
	购买链接：&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
	<a href="getAllItems.action" >
	<p1>购买</p1>
	</a>
	<br/>
	
	登录链接：&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
	<a href="index.jsp" >
	<p1>管理员登录</p1>
	</a>
	<br/>
	
	<hr/>
	普通客户查询数据界面：
	<a href="search.jsp" target="_blank">
	<p3>查询</p3>
	</a>
	<br/>
	<hr/>
	管理员界面：&emsp;&emsp;&emsp;&emsp;&emsp;
	<a href="add.jsp" target="_blank">
	<p4>管理员</p4>
	</a>
	<hr/>
	<br/>
	<body>

	<div onmouseover="mOver(this)" onmouseout="mOut(this)" style="background-color:blue;width:120px;height:20px;padding:40px;color:#ffffff;">轻触查看时间</div>
	
	<script>
	function mOver(obj)
	{
	obj.innerHTML=Date();
	}
	
	function mOut(obj)
	{
	obj.innerHTML="轻触查看时间"
	}
	</script>
	
</body>
</html>