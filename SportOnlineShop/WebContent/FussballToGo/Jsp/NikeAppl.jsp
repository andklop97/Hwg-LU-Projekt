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
String ware = request.getParameter("ware") ; 
String artikelnummer = request.getParameter("artikelnummer") ; 
String artikelname = request.getParameter("artikelname") ; 
String artikelpreis= request.getParameter("artikelpreis") ; 



if(bestellung==null) bestellung= "" ; 
if(ware==null) ware=""  ;  


int anr = Integer.parseInt(artikelnummer) ; 

BigDecimal preis= new BigDecimal(artikelpreis) ; 



if(bestellung.equals("bestellen")) {
	if(fsb.addBestellung(anr, artikelname, preis)){
		msg.setBestellt() ;
	} 
	response.sendRedirect("NikeView.jsp") ; 
}else if(ware.equals("in den Warenkorb")){
	if(fsb.addWarenkorb(anr, artikelname, preis)){
		msg.setWarenkorb() ; 
	}
	response.sendRedirect("NikeView.jsp") ; 
}

else{
	response.sendRedirect("NikeView.jsp") ; 
}
%>


</body>
</html>