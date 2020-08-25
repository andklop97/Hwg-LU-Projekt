<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FussbälleSeiteAppl</title>
</head>
<body>
<%
String ball1=request.getParameter("ball1");
if(ball1==null) ball1="";
if(ball1.equals("ball")){
	response.sendRedirect("./bestellenAppl.jsp");
}
%>
</body>
</html>