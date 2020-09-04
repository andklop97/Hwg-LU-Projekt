<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="FussballShop.bean.*" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FussbälleSeiteAppl</title>
</head>
<body>

<jsp:useBean id="fsb" class="FussballShop.bean.FussballToGoBean" scope="session" />
<jsp:useBean id="art" class= "FussballShop.bean.Artikel" scope="session" />
<%
String ball1=request.getParameter("ball1");
if(ball1==null) ball1="";
if(ball1.equals("ball")){
	response.sendRedirect("./bestellenAppl.jsp");
}
%>
</body>
</html>