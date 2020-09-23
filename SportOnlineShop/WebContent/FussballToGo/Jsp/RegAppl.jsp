<%@page import="java.sql.SQLException"%>
<%@page import="FussballShop.bean.MessageBean"%>
<%@page import="FussballShop.bean.RegBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegAppl</title>
</head>
<body>
<jsp:useBean id="account" class="FussballShop.bean.RegBean" scope="session" />
<jsp:useBean id="regMsg" class="FussballShop.bean.RegMessageBean" scope="session" />
<%
String name=request.getParameter("name");
String mail=request.getParameter("mail");
String password=request.getParameter("password");
String check=request.getParameter("check");
String Reg=request.getParameter("Reg");

if(check==null)check="";
if(Reg==null)Reg="";

if(Reg.equals("Registrieren") && check!=null){
	
	account.setUserid(name);
	account.setEmail(mail);
	account.setPassword(password);
	//account.insertAccountNoCheck();
	
	try{
		boolean userAngelegt = account.insertAccountIfNotExists();
		if(userAngelegt) {
			regMsg.setRegistrierenSuccesful(name);
		}
		else regMsg.setAlreadExists(name);
	}
	catch(SQLException se){
		se.printStackTrace();
		regMsg.setAnError();
	}
	
	response.sendRedirect("./RegView.jsp");
}
%>


</body>
</html>