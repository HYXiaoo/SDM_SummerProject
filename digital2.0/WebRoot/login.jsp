<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录</title>
<link rel="stylesheet" href="css/sheet1.css">
</head>
<body>
<div id="bkgdCover"></div>
<div id="bkgd"></div>
<div id="titleBar" class="Bars">
 	<div class="Tittle"><s:text name="ElectronicMarket"/></div>
</div>
<div class="ContentSquare"
style="height:300px;width:300px;top:30%;left:40%;">
  	<form action="Login" method="post">
    	<div>
        	<h1 class="TitleText"><s:text name="UserLogin"/></h1>
        </div>
        <p class="ErrorMessage">${loginMessage}</p>
        <div>
        
            <s:textfield class="OpText" placeholder="%{getText('PlzInputAc')}"
            type="text" name="user.userName"/>
    
            <s:textfield class="OpText" placeholder="%{getText('PlzInputPw')}"
            type="password" name="user.PASSWORD"/>
            
        </div>
        
        	<button class="UiButton" type="submit"
            style="margin-top:5px;margin-bottom:10px;">
            <s:text name="LoginText"/>
            </button>
            
        <div>
        	<a href="reg.jsp" style="float:left;margin-left:5%;"><s:text name="RegisterText"/></a>
            <a href="#" style="float:right;margin-right:5%;"><s:text name="ForgotPw"/></a>
            <% if(session!=null){%>
            <p class="ErrorMessage" style="color:blue;">${sessionScope.regInfo}</p>
            <%} %>
        </div>
    </form>
</div>
<div id="bottomBar" class="Bars" style="bottom:0;">Copyright © 2019 by Huang Yuxiao. All rights reserved</div>
</body>
</html>