<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HTrikotApp</title>
</head>
<body>
<%
String Deutsch=request.getParameter("Deutsch");
String Ital=request.getParameter("Ital");
String Frank=request.getParameter("Frank");
String Eng=request.getParameter("Eng");
String Span=request.getParameter("Span");

if(Deutsch==null)Deutsch="";
if(Ital==null) Ital="";
if(Frank==null) Frank="";
if(Eng==null) Eng="";
if(Span==null) Span="";

if(Deutsch.equals("Deutschland")){
	response.sendRedirect("./DeutschView.jsp");
}
else if(Ital.equals("Italien")){
	response.sendRedirect("ItalView.jsp");
}
else if(Frank.equals("Frankreich")){
	response.sendRedirect("./FrankView.jsp");
}
else if(Eng.equals("England")){
	response.sendRedirect("./EngView.jsp");
}
else if(Span.equals("Spanien")){
	response.sendRedirect("./SpanView.jsp");
} 

else{
	response.sendRedirect("./HTrikotView.jsp");
}
%>
</body>
</html>