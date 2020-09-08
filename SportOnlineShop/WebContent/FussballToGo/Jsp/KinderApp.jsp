<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KinderApp</title>
</head>
<body>
<%
String Fuss=request.getParameter("Fuss");
String Schuhe=request.getParameter("Schuhe");
String Fan=request.getParameter("Fan");
String Life=request.getParameter("Life");

if(Fuss==null) Fuss="";
if(Fan==null) Fan="";
if(Schuhe==null) Schuhe="";
if(Life==null) Life="";

if(Fuss.equals("Fussball")){
	response.sendRedirect("./KFussbaelleView.jsp");
}
else if(Schuhe.equals("Fussballschuhe")){
	response.sendRedirect("KSchuheView.jsp");
}
else if(Fan.equals("Trikots")){
	response.sendRedirect("./KFanView.jsp");
}
else if(Life.equals("Torwarthandschuhe")){
	response.sendRedirect("./KTorwartView.jsp");
} 

else{
	response.sendRedirect("./KinderView.jsp");
}
%>
</body>
</html>