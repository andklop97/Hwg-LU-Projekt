<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HschuheView</title>
<link  type="text/css" rel="stylesheet" href="../Css/HSchuhe.css"/>
<link href="https://fonts.googleapis.com/css?family=Quicksand:400,700&display=swap" rel="stylesheet">
</head>
<body>
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

   <div class="body">
   <form action="./HSchuheApp.jsp" method="get">
   <div  ><input class="button1" type="submit" name="nik" value="Nike"></div>
     <div  ><input class="button2" type="submit" name="adid" value= "Adidas"></div>
      <div  ><input class="button3" type="submit" name="pum" value="Puma"></div>
       </form>
</div>
</body>
</html>