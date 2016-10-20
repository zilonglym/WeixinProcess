<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>思考乐学生成绩查询界面</title>
<style type="text/css">
body{
	color:#000
	font-size: 14px;
	margin: 20px auto;
	
}
</style>
<script type="text/javascript">
	function check(){
		if(document.forms.loginForm.uname.value=""){
			alter("请输入老师姓名");
			document.forms.loginForm.uname.foucs();
		}
		
		if(document.forms.loginForm.upwd.value=""){
			alter("请输入学生姓名");
			document.forms.loginForm.upwd.foucs();
		}
	}
</script>
	
</head>
<body>
	<form action="<%= request.getContextPath() %>/Loginservlet" method="post" name="loginForm">
		<table border="1" cellspacing="0" cellpadding="5" bordercolor="silver" align="center">
		<tr>
			<td colspan="2" align="center" bgcolor="#E8E8E8E">成绩查询</td>
		</tr>
		<tr>
			<td>老师姓名：</td>
			<td><input type="text" name="uname" /></td>
		</tr>
		<tr>
			<td>学生姓名：</td>
			<td><input type="password" name="upwd" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="查询" onclick="return check(this);"/>
				<input type="reset" value="重置" />
			</td>
		</tr>
			
		</table>
		<!-- userName:<input type="test" name="uname"/><br/>  -->
		<!-- password:<input type="password" name="upwd"/><br/> -->
		<!-- <input type ="submit" value="Login"/> -->
		<!-- <input type="reset" value="Reset"/> -->
	</form>
</body>
</html>