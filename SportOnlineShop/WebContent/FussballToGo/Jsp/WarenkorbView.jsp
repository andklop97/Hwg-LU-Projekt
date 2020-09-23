<%@page import="FussballShop.bean.MessageBean"%>
<%@page import="FussballShop.bean.FussballToGoBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Warenkorb</title>
<link  type="text/css" rel="stylesheet" href="../Css/Warenkorb.css"/>
</head>
<body>

<jsp:useBean id="fsb" class="FussballShop.bean.FussballToGoBean" scope="session" />
<jsp:useBean id="msg" class="FussballShop.bean.MessageBean" scope="session" />



<jsp:getProperty property="htmlFromWarenkorb" name="fsb"/>


</body>
</html>