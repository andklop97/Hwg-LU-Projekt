<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HerrenApp</title>
</head>
<body>
<%
String Trik=request.getParameter("Trik");
String Schuhe=request.getParameter("Schuhe");
String ball=request.getParameter("ball");
String Stutzen=request.getParameter("Stutzen");

if(Trik==null)Trik="";
if(Schuhe==null) Schuhe="";
if(ball==null) ball="";
if(Stutzen==null) Stutzen="";

if(Trik.equals("Trikots")){
	response.sendRedirect("./HTrikotApp.jsp");
}
else if(Schuhe.equals("Fussballschuhe")){
	response.sendRedirect("HSchuheApp.jsp");
}
else if(ball.equals("Fussball")){
	response.sendRedirect("./HFussballView.jsp");
}
else if(Stutzen.equals("Fussball Stutzen")){
	response.sendRedirect("./HStutzenView.jsp");
} 

else{
	response.sendRedirect("./HerrenView.jsp");
}
%>
</body>
</html>