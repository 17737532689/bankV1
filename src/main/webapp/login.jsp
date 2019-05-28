<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>
	<style type="text/css">
	
		table {
				width: 300px;
				border-collapse: collapse;
			}
		div {
				margin: 0 auto;
				width: 300px;
			}
	
	
	</style>
</head>
<body>
<div align="center">
<h1>个人网上银行</h1>
<form action="" method="get" onsubmit="return false;">

<table>
<tr>
	<td>卡号： <input type="text" name="userId"></input></td>
</tr>
<tr>
	<td>密码： <input type="text" name="password"></input></td>
</tr>
<tr>
	<td align="center"> <input type="submit" value="登录网上银行"></input></td>
</tr>

</table>

<script type="text/javascript">

$("form").submit(function(){
	$.ajax({
		type:"post",
		url:"login.do",
		data:$("form").serialize(),
		dataType:"json",
		success:function(data){
			if(data.code==1){
				window.location.href="fram.html?user1="+data.info;
			}else{
				alert(data.info);
			}
		}
				
	});
	
});



</script>

</form>
</div>
</body>
</html>