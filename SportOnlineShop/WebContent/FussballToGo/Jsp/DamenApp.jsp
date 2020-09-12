<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String Trik=request.getParameter("Trik");
String Schuhe=request.getParameter("Schuhe");
String Train=request.getParameter("Train");


if(Trik==null)Trik="";
if(Schuhe==null) Schuhe="";
if(Train==null) Train="";


if(Trik.equals("Trikots")){
	response.sendRedirect("./DTrikotView.jsp");
}
else if(Schuhe.equals("Fussballschuhe")){
	response.sendRedirect("DschuheView.jsp");
}
else if(Train.equals("Trainingskleidung")){
	response.sendRedirect("./DtrainView.jsp");
}


else{
	response.sendRedirect("./DamenView.jsp");
}
%>
</body>
</html>