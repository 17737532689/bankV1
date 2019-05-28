<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 引入jstl的核心标签库 -->


<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>所有员工信息</title>
		<style type="text/css">
			table td {
				text-align: center;
			}
			/*合并表格的边框*/
			
			table {
				width: 700px;
				border-collapse: collapse;
			}
			
			h3 {
				text-align: center;
			}
			
			div {
				margin: 0 auto;
				width: 700px;
			}
		</style>
 <script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>
	
	</head>

	<body>


		<div>
			<h3>所有员工信息</h3>
			<a href="add.jsp">添加员工信息</a><br/>
			<table border="1">

				<tr>
					<th>序号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>年龄</th>
					<th>手机</th>
					<th>删除</th>
					<th>更新</th>
				</tr>
				
			<tbody id="tid"></tbody>

		</table>
		</div>
	
	<script type="text/javascript">
	$(function(){
		load();
		
	})
	
	</script>
	
	
		<script type="text/javascript">
	function load(){
			$("#tid").empty();
			$.ajax({
				type:"get",
				url:"list.do",
				dataType:"json",
				success:function(data){
					if(data.code==1){
					
					var infos = data.info;
					$(infos).each(function(){
						var html =	'<tr>';
						html+='<th>'+this.id+'</th>';
						html+='<th>'+this.name+'</th>';
						html+='<th>'+this.sex+'</th>';
						html+='<th>'+this.age+'</th>';
						html+='<th>'+this.phone+'</th>';
						html+='<th><a href="#" onclick="deleteInfo('+this.id+')">删除</a></th>';
						html+='<th><a href="update.jsp?id='+this.id+'">更新</a></th>';
						html+='</tr>';
						$("#tid").append($(html));
						})
					} 
				}
				
			});
		
	}
		</script>
		
	<script type="text/javascript">
		
		function deleteInfo(id){
		$.ajax({
			
			type:"get",
			url:"delete.do?id="+id,
			dataType:"json",
			success:function(data){
				if(data.code==1){
					load();
				}
				
				
			}
			
			
		});
		}
	</script>
		
			
	</body>

</html>
