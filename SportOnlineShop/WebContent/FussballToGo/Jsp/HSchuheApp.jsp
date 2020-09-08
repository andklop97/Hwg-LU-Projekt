<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HSchuheApp</title>
</head>
<body>
<%
String nik=request.getParameter("nik");
String adid=request.getParameter("adid");
String pum=request.getParameter("pum");

if(nik==null)nik="";
if(adid==null) adid="";
if(pum==null) pum="";


if(nik.equals("Nike")){
	response.sendRedirect("./NikeView.jsp");
}
else if(adid.equals("Adidas")){
	response.sendRedirect("adidasView.jsp");
}
else if(pum.equals("Puma")){
	response.sendRedirect("./PumaView.jsp");
}

 

else{
	response.sendRedirect("./HSchuheView.jsp");
}
%>
</body>
</body>
</html>