<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link  type="text/css" rel="stylesheet" href="../Css/Trikot.css"/>
<link href="https://fonts.googleapis.com/css?family=Quicksand:400,700&display=swap" rel="stylesheet">
<title>TrikotSeiteView</title>
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
    
   <div class="a5"><a  href="./anmeldenView.jsp">Anmelden</a> </div>
   <div class="a6"><a  href="./RegView.jsp">Registrieren</a></div>
   </div>


<jsp:getProperty property="htmlFromTrikotseite" name="fsb"/>





</body>
</html>