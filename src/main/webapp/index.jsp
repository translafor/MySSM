<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
<title>登录页面</title>  
</head>  
<body>  
	${error }
	<br/>
	<br/>
<button type="button" onclick="alert('输入正确的账号和密码才可登录!')">操作指南</button>
	<br/>
	<br/>
	<br/>
	${info01 }
	<br/>
	请登录:
	<br/>
	<br/>
	
    <form action="login.action" method="post">  
    	<fieldset>
		<legend>请输入账号和密码:</legend>
        adminName:<input type="text" name="adminName"/><br/>  
        adminPwd:&nbsp;&nbsp;&nbsp;<input id="demo" type="password" name="adminPwd"/><br/>  
        <script>
		function myFunction()
		{
		var x=document.getElementById("demo").value;
		if(x==""||isNaN(x))
			{
			alert("密码请输入数字！！");
			}
		}
		</script>
		
		<button type="submit" onclick="myFunction()">登录</button>
        </fieldset>  
    </form> 
    <br/>
    <p id="p1">账号为admin。</p>

	<input type="button" value="隐藏提示" onclick="document.getElementById('p1').style.visibility='hidden'" />
	<input type="button" value="显示提示" onclick="document.getElementById('p1').style.visibility='visible'" />
	<br/>
	<br/>
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