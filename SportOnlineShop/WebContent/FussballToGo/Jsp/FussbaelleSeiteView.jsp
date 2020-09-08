<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
 
  <%@page import="FussballShop.bean.*" %>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FussbÃ¤lleSeiteView</title>
<link  type="text/css" rel="stylesheet" href="../Css/Fussball.css"/>
<link href="https://fonts.googleapis.com/css?family=Quicksand:400,700&display=swap" rel="stylesheet">
</head>
<body>



<jsp:useBean id="fsb" class="FussballShop.bean.FussballToGoBean" scope="session" />

<div class="header">
    <div > <input class="mex1"  type="submit" name="Damen"  value="Damen" /> </div>
  <div > <input class="mex2"  type="submit" name="Damen" value="Herren"/> </div>
  <div > <input class="mex3"  type="submit" name="Damen" value="Kinder"/> </div>
   <div class="header-mitte"><input  type="submit" name="anmelden" value="anmelden"/></div>
   <div class="header-links"><input  type="submit" name="reg" value="registrieren"/></div>
</div>




<br>
<br>



<%//=fsb.getHtmlFromArtikel()  %>



<jsp:getProperty property="htmlFromArtikel" name="fsb"/>







</body>
</html>