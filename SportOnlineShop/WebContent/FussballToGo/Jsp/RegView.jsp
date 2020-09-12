<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegView</title>
<link  type="text/css" rel="stylesheet" href="../Css/reg.css"/>
</head>
<body>
<div class="menu">
<div class="header">
<div class="hed">
<div > <a class="a0" href="./StartseiteView.jsp">Home</a> </div>
<div > <a class="a1" href="./DamenView.jsp">Damen</a> </div>
  <div > <a class="a2" href="./HerrenView.jsp">Herren</a> </div>
  <div > <a class="a3" href="./KinderView.jsp">Kinder</a> </div>
   
  </div>
</div>

<div class="titel"><h1>Account erstellen</h1></div>
   <div class="u"> Username<input class="name" type="text" name="name" value="" /> </div>
   <div class="m"> E-Mail<input class="mail" type="email" name="name" value="" /> </div>
<div class="pa"> Passwort<input class="pass" type="text" name="Passwort" value="" /> </div>
<div class="b"><input class="check" type="checkbox" name="check" value="" />
 <p class="p">Ja ich m&ouml;chte ein Mitglied des FussballToGo werden und Zugang zu produkten und Erlebnissen sowie News von FussballToGo per E-Mail erhalten.
 Für die Mitgliedschaft ben&ouml;tigst du ein FussballToGo-Kontoprofil. Ich akzeptiere, dass FussballToGo ein Profil für mich erstellt. Ich habe die 
 Bedingungen und Zustimmungen f&uuml;r die Behandlung meiner pers&ouml;nlichen Daten gelesen und gebeben. <br> <a class="agb" href=""> AGB lesen</a> | <br> 
 <a class="agb" href="">Datenschutzbedingungen  einsehen</a>
 </p>
 </div>
<div class="r"> <input class="reg" type="submit" name="Reg" value="Registrieren" /></div>
<div class="d"><div class="left"> Hast du bereits einen Account? </div><a  class="right" href="./anmeldenView.jsp">Einloggen</a></div>
</div>
</body>
</html>