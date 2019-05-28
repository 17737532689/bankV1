<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 引入jstl的核心标签库 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

	<head>
	
	
		<meta charset="utf-8" />
		<title>修改信息</title>
		<style type="text/css">
		
		
			table {
				width: 300px;
				border-collapse: collapse;
			}
			
			h3 {
				text-align: center;
			}
			
			div {
				margin: 0 auto;
				width: 300px;
			}
		</style>
		<script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>
	</head>
	
	<body>
		<div>
			<h3>修改员工信息</h3>
			<form action="update.do?id=${emp.id}" method="post" onsubmit="return false;">
				<table border="1">
					<tr>
						<th>姓名</th>
						<td><input type="text" name="name" value="" /></td>
					</tr>
					<tr>
						<th>性别</th>
						<td>
							<input type="radio" name="sex" value="男"  checked="checked"> 男
							
						<input type="radio" name="sex" value="女" checked="checked">女
							
						</td>
					</tr>
					<tr>
						<th>年龄</th>
						<td><input type="text" name="age" value=" " /></td>
					</tr>
					<tr>
						<th>手机</th>
						<td><input type="text" name="phone" value=" " /></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="修改" />&nbsp;
							<input type="reset" value="重置" /></td>
					</tr>
				</table>
			</form>
		</div>
	</body>
	
	<script type="text/javascript">
	
	$(function(){
		$.ajax({
			type:"get",
			url:"findOne.do"+window.location.search,
			dataType:"json",
			success:function(data){
				if(data.code==1){
				
				var info = data.info;
				$(info).each(function(){
				
					$("input[name='name']").val(info.name);
					if(info.sex=="男"){
						$("input[name='男']").attr("checked","checked");
					}else{
						$("input[name='女']").attr("checked","checked");
					}
					
					$("input[name='age']").val(info.age);
					$("input[name='phone']").val(info.phone);
				
					
					
					})
				} else {
					alter(data.info);
				}
			}
			
		});
	});
	
	
	
	
	
	
	
	</script>
	
	
	
	
	
	<script type="text/javascript">
		$("form").submit(function(){
			$.ajax({
				type:"get",
				url:"update.do"+window.location.search,
				data:$("form").serialize(),
				dataType:"json",
				success:function(data){
					if(data.code==1){
						window.location.href="list.jsp";
					}else{
						alert(data.info);
					}
					
				}
				
			});
			
			
		})
		
		
		
		
		
	</script>
	
	
	
	
	
	

</html>