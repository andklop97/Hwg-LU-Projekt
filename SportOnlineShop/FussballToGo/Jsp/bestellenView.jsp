<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bestellenView</title>
<link  type="text/css" rel="stylesheet" href="../Css/bestellen.css"/>
<link href="https://fonts.googleapis.com/css?family=Quicksand:400,700&display=swap" rel="stylesheet">
</head>
<body>
<form action =".\bestellenAppl.jsp " method ="get">
<div class="header">
    <div > <input class="mex1"  type="submit" name="Damen"  value="Damen" /> </div>
  <div > <input class="mex2"  type="submit" name="Damen" value="Herren"/> </div>
  <div > <input class="mex3"  type="submit" name="Damen" value="Kinder"/> </div>
   <div class="header-mitte"><input  type="submit" name="anmelden" value="anmelden"/></div>
   <div class="header-links"><input  type="submit" name="reg" value="registrieren"/></div>
</div>
<div class="menge">
 <input class="minus" type="submit" name="minus" value="-"/>  
<input class="zahl" type="submit" name="zahl" value="1"/> 
<input class="plus" type="submit" name="plus" value="+"/> 
</div>
<div ><input class="bestellen" type="submit" name="bestellen" value="Bestellen"/></div>
<div class="link">sind Sie bereits Kunde? <a href=""> registrieren</a></div>









</form>
</body>
</html>