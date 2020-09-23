<%@page import="FussballShop.bean.MessageBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>anmeldenView</title>
<link  type="text/css" rel="stylesheet" href="../Css/anmelden.css"/>
</head>
<body>
<jsp:useBean id="anMsg" class="FussballShop.bean.anmeldenMessageBean" scope="session" />
<div class="header">
<div class="hed">
<div > <a class="a0" href="./StartseiteView.jsp">Home</a> </div>
<div > <a class="a1" href="./DamenView.jsp">Damen</a> </div>
  <div > <a class="a2" href="./HerrenView.jsp">Herren</a> </div>
  <div > <a class="a3" href="./KinderView.jsp">Kinder</a> </div>
   
  </div>
    
  
  
   </div>
   <form action="./anmeldenAppl.jsp">
  <div class="anMsg"> <jsp:getProperty property="anMessageHtml" name="anMsg"/> </div>
   <div class="titel"> <h2>Einloggen</h2> </div>
<div class="a"> Username<input class="name" type="text" name="name" value="" /> </div>
<div class="b"> Passwort<input class="pass" type="text" name="Password" value="" /> </div>
<div class="c"> <input class="anm" type="submit" name="Ein" value="Einloggen" /></div>
<div class="d"><div class="left"> Hast du keinen Account? </div><a  class="right" href="./RegView.jsp">Dann erstelle dir jetzt einen!</a></div>
</form>
</body>
</html>