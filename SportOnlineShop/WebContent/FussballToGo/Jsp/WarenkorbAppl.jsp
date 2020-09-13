<%@page import="java.math.BigDecimal"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="fsb" class="FussballShop.bean.FussballToGoBean" scope="session" />
<jsp:useBean id="msg" class="FussballShop.bean.MessageBean" scope="session" />

<%

String bestellung = request.getParameter("bestellung")  ;
String wkid = request.getParameter("wkid"); 
String artikelnummer = request.getParameter("artikelnummer") ; 
String artikelname = request.getParameter("artikelname") ; 
String artikelpreis= request.getParameter("artikelpreis") ; 
String entf = request.getParameter("entf") ; 



if(bestellung==null) bestellung= "" ; 



int anr = Integer.parseInt(artikelnummer) ; 
int warenkorbid = Integer.parseInt(wkid) ; 

BigDecimal preis= new BigDecimal(artikelpreis) ; 



if(bestellung.equals("bestellen")) {
	if(fsb.addBestellung(anr, artikelname, preis)){
		msg.setBestellt() ;
		fsb.deleteFromWarenkorb(warenkorbid) ; 
	} 
	response.sendRedirect("WarenkorbView.jsp") ; 
}else if(entf.equals("entfernen")){
	fsb.deleteFromWarenkorb(warenkorbid) ;
	response.sendRedirect("WarenkorbView.jsp") ; 
}

else{
	response.sendRedirect("WarenkorbView.jsp") ; 
}
%>

</body>
</html>