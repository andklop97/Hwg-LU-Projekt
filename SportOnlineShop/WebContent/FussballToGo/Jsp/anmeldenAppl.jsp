<%@page import="FussballShop.bean.MessageBean"%>
<%@page import="java.sql.SQLException"%>
<%@page import="FussballShop.bean.anmeldenBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="anmld" class="FussballShop.bean.anmeldenBean" scope="session" />
<jsp:useBean id="Msg" class="FussballShop.bean.MessageBean" scope="session" />
<%
String name=request.getParameter("name");
String password=request.getParameter("password");
String Ein=request.getParameter("Ein");

if(Ein=="null") Ein="";

if(Ein.equals("Einloggen")){
	
	anmld.setUserid(name);
	anmld.setPassword(password);
	
	try{
		boolean log=anmld.checkUseridPassword();
		if(log){
			anmld.setLoggedIn(true);
			//Msg.setLoginSuccessful();
			response.sendRedirect("./anmeldenView.jsp");
		}
		else{
			
		//	Msg.setLoginFailed();
			response.sendRedirect("./anmeldenView.jsp");
			
		}
	}
	catch(SQLException se){
		se.printStackTrace();
		
//	Msg.setAnError();
		response.sendRedirect("./anmeldenView.jsp");
		
	}
	
	
	response.sendRedirect("./StartseiteView.jsp");
	
	
	
}





















%>
</body>
</html>