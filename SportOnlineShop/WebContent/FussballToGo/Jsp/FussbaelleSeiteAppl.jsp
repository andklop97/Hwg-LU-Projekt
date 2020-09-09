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
<jsp:useBean id="bestWb" class=FussballShop.bean.BestellungWarenkorb scope="session" />


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

//NumberFormat nf = NumberFormat.getInstance();
//double preis = nf.parse(artikelpreis).doubleValue();

int anr = Integer.parseInt(artikelnummer) ; 

BigDecimal preis= new BigDecimal(artikelpreis) ; 

//float preis = Float.parseFloat(artikelpreis) ; 
//if(ball1.equals("ball")){
//	response.sendRedirect("./bestellenAppl.jsp");
//}

if(bestellung.equals("bestellen")) {
	bestWb.addBestellung(anr, artikelname, preis ); 
	response.sendRedirect("FussbaelleSeiteView.jsp") ; 
}


else{
	response.sendRedirect("./FussbaelleSeiteAppl.jsp") ; 
}
%>
</body>
</html>