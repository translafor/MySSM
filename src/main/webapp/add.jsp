<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	request.setAttribute("domain", "http://localhost:8080/my-SSM/");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加页面</title>
<link rel="stylesheet" type="text/css" href="${domain }css/myfirst.css">
<script type="text/javascript">

function validate_required(field,alerttxt)
{
with (field)
  {
  if (value==null||value=="")
    {alert(alerttxt);return false}
  else {return true}
  }
}

function validate_form(thisform)
{
with (thisform)
  {
  if (validate_required(custName,"custName must be filled out!")==false)
    {custName.focus();return false}
  }
}
</script>
</head>
<body>
	<br/>
	<svg xmlns="http://www.w3.org/2000/svg" version="1.1" height="190">
	   <polygon points="100,10 40,180 190,60 10,60 160,180"
	   		style="fill:blue;stroke:red;stroke-width:3;fill-rule:evenodd;" />
	</svg>
	<br/>
	<form action="addOrder.action" onsubmit="return validate_form(this)" method="post">  
    	
        <p5>custName:</p5>&emsp;<input type="text" name="custName"/><br/>  
        <p5>prodName:</p5>&nbsp;&nbsp;<input type="text" name="prodName"/><br/>  
        <p5>orderCount:</p5>&nbsp;<input type="text" name="orderCount"/><br/>
        <p5>orderDate:</p5>&nbsp;&nbsp;&nbsp;<input type="date" name="orderDate"/><br/> 
        <p5>statu:</p5>&emsp;&emsp;&emsp;&emsp;<input type="text" name="statu"/><br/>
        <input type="submit" value=添加/><br/>  
    </form>
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