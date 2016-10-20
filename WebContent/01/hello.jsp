<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%! int a = 1; %>
<% int b = 1; %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello Word</title>
</head>
<%!public int add(int i){
	return i+1;
}
%>
<body>
<% String str="hello word";%>
<%=add(2)%>
<%--this is jsp comments --%>
</body>
</html>