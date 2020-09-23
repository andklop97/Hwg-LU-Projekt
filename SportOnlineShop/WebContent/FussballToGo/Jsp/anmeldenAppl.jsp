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
<jsp:useBean id="anMsg" class="FussballShop.bean.anmeldenMessageBean" scope="session" />
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
			//anMsg.setLoginSuccessful();
			response.sendRedirect("./StartseiteView2.jsp");
		}
		else{
			
		    anMsg.setLoginFailed();
			response.sendRedirect("./anmeldenView.jsp");
			
		}
	}
	catch(SQLException se){
		se.printStackTrace();
		
	    anMsg.setAnyError();
		response.sendRedirect("./anmeldenView.jsp");
		
	}
	
	} 





















%>
</body>
</html>