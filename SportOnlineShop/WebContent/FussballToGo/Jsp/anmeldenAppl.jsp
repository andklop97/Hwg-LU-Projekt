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
<%
String name=request.getParameter("name");
String password=request.getParameter("Password");
String Ein=request.getParameter("Ein");

if(Ein=="null") Ein="";

if(Ein.equals("Einloggen")){
	
	anmld.setUserid(name);
	anmld.setPassword(password);
	
	try{
		boolean log=anmld.checkUseridPassword();
		if(log){
			anmld.setLoggedIn(true);
			//Msgaccount.setLoginSuccessful();
			response.sendRedirect("./StartseiteView.jsp");
		}
		else{
			
		//	Msgaccount.setLoginFailed();
			response.sendRedirect("./anmeldenView.jsp");
			
		}
	}
	catch(SQLException se){
		se.printStackTrace();
		
	//	Msgaccount.setAnyError();
		response.sendRedirect("./anmeldenView.jsp");
		
	}
	
	} 





















%>
</body>
</html>