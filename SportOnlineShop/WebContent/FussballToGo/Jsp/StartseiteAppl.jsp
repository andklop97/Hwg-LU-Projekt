 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StartseiteAppl</title>
</head>
<body>
<%
String Kontakt=request.getParameter("Kontakt");
if(Kontakt==null)Kontakt="";
if(Kontakt.equals("KONTAKT AUFNEHMEN")){
	response.sendRedirect("./KontaktView.jsp");
}else {
	response.sendRedirect("./StartseiteView.jsp");
}


%>
</body>
</html>