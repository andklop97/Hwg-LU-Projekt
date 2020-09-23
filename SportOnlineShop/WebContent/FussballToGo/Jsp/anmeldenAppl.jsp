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
<<<<<<< HEAD
<jsp:useBean id="Msg" class="FussballShop.bean.MessageBean" scope="session" />
=======
<jsp:useBean id="anMsg" class="FussballShop.bean.anmeldenMessageBean" scope="session" />
>>>>>>> branch 'master' of https://github.com/andklop97/Hwg-LU-Projekt.git
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
<<<<<<< HEAD
			//Msg.setLoginSuccessful();
			response.sendRedirect("./anmeldenView.jsp");
=======
			//anMsg.setLoginSuccessful();
			response.sendRedirect("./StartseiteView2.jsp");
>>>>>>> branch 'master' of https://github.com/andklop97/Hwg-LU-Projekt.git
		}
		else{
			
<<<<<<< HEAD
		//	Msg.setLoginFailed();
=======
		    anMsg.setLoginFailed();
>>>>>>> branch 'master' of https://github.com/andklop97/Hwg-LU-Projekt.git
			response.sendRedirect("./anmeldenView.jsp");
			
		}
	}
	catch(SQLException se){
		se.printStackTrace();
		
<<<<<<< HEAD
//	Msg.setAnError();
=======
	    anMsg.setAnyError();
>>>>>>> branch 'master' of https://github.com/andklop97/Hwg-LU-Projekt.git
		response.sendRedirect("./anmeldenView.jsp");
		
	}
	
	} 





















%>
</body>
</html>