<%@page import="java.math.BigDecimal"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="FussballShop.bean.*" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FussbälleSeiteAppl</title>
</head>
<body>

<jsp:useBean id="fsb" class="FussballShop.bean.FussballToGoBean" scope="session" />
<jsp:useBean id="msg" class="FussballShop.bean.MessageBean" scope="session" />


<%
String ball1=request.getParameter("ball1");
String bestellung = request.getParameter("bestellung")  ;
String ware = request.getParameter("ware") ; 
String artikelnummer = request.getParameter("artikelnummer") ; 
String artikelname = request.getParameter("artikelname") ; 
String artikelpreis= request.getParameter("artikelpreis") ; 


if(ball1==null) ball1="";
if(bestellung==null) bestellung= "" ; 
if(ware==null) ware=""  ;  


int anr = Integer.parseInt(artikelnummer) ; 

BigDecimal preis= new BigDecimal(artikelpreis) ; 

 



if(bestellung.equals("bestellen")) {
	if(fsb.addBestellung(anr, artikelname, preis)){
		msg.setBestellt(); 
	}
	response.sendRedirect("FussbaelleSeiteView.jsp") ; 
}

else if(ware.equals("in den Warenkorb")) {
	if(fsb.addWarenkorb(anr,artikelname ,preis)){
		msg.setWarenkorb(); 
	}
	response.sendRedirect("FussbaelleSeiteView.jsp") ; 
}

else{
	response.sendRedirect("./FussbaelleSeiteView.jsp") ; 
}
%>
</body>
</html>