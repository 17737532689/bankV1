<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>

<style type="text/css">
	
		
		
	
	
	</style>


</head>

<body>

<div>

	<table >
	<tr>
	<td>卡号:${user.userid}</td>
	<td><a>退出登录</a></td>
	</tr>
	
	<tr>
	<td><button onclick="remainMoney()">查询余额</button></td>
	
	</tr>
	<tr>
	<td><a href="transfer.jsp" target="show">转账</a></td>
	</tr>
	<tr>
	<td><a href="record1.html" target="show">查询交易记录</a></td>
	</tr>
	<tr>
	<td>密码更改</td>
	</tr>
	
	</table>
	
</div>


<script type="text/javascript">

	function remainMoney(){
		
		$.ajax({
			
			type:"get",
			url:"remain.do",
			dataType:"json",
			success:function(data){
				if(data.code==1){
					alert("余额"+data.info.remainmoney);
				}else{
					
					alert(data.info);
				}
				
			}
			
		})
		
		
	}




</script>









</body>
</html>