<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ItalView</title>
<link  type="text/css" rel="stylesheet" href="../Css/Itrikot.css"/>
<link href="https://fonts.googleapis.com/css?family=Quicksand:400,700&display=swap" rel="stylesheet">
</head>
<body>

<jsp:useBean id="fsb" class="FussballShop.bean.FussballToGoBean" scope="session" />

<div class="header">
<div class="hed">
<div > <a class="a0" href="./StartseiteView.jsp">Home</a> </div>
<div > <a class="a1" href="./DamenView.jsp">Damen</a> </div>
  <div > <a class="a2" href="./HerrenView.jsp">Herren</a> </div>
  <div > <a class="a3" href="./KinderView.jsp">Kinder</a> </div>
  </div>
    
   <div class="header-mitte"><input  type="submit" name="anmelden" value="anmelden"/></div>
   <div class="header-links"><input  type="submit" name="reg" value="registrieren"/></div>
   </div>
   
   
   
<jsp:getProperty property="htmlFromItal" name="fsb"/>




</body>
</html>