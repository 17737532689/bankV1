<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>
</head>
<body>
<div>
<h1>当前操作转账</h1>
<form action=""  onsubmit="return false;">
转入账号<input type="text" name="userId">
转入金额<input type="text" name="inMoney">
	<input type="submit" value="转账">
</form>
</div>
<script type="text/javascript">

$("form").submit(function(){
	$.ajax({
		type:"post",
		url:"transfer.do",
		data:$("form").serialize(),
		dataType:"json",
		success:function(data){
			if(data.code==1){
				alert("转账成功！请查余额");
				
			/* 	window.location.href="fram.html"; */
			}else{
				alert("转账失败"+data.info);
			}
		}
				
	});
	
});



</script>

</body>
</html>