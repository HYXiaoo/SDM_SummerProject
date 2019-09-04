<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册</title>
<link rel="stylesheet" href="css/sheet1.css">
</head>
<body>
<div id="titleBar" class="Bars">
	<div class="Tittle"><s:text name="ElectronicMarket"/></div>
</div>
<div id="bkgdCover"></div>
<div id="bkgd"></div>
<div class="ContentSquare"
style="height:525px;width:500px;top:15%;left:35%;">
  	<s:form action="Register">
  		<h1 class="TitleText" style="padding-bottom:20px;"><s:text name="RegTittle"/></h1>
  		     	
        <!-- 信息框 -->
        	
      	<div style="position:relative;">
        	<s:label class="InputLabel" theme="simple" value="%{getText('Name')}:"></s:label>
            <s:textfield name="user.userName" class="OpText_narrow" theme="simple" type="text"/>
            <label class="ErrorLabel" style="color:black;"><s:text name="requisite"/></label>
            <s:fielderror fieldName="user.userName" class="ErrorLabel"/>
      	</div>
      	
      	<div style="position:relative;">
        	<s:label class="InputLabel" theme="simple" value="%{getText('Pw')}:"></s:label>
            <s:password name="user.PASSWORD" class="OpText_narrow" theme="simple" type="text"/>
            <label class="ErrorLabel" style="color:black;"><s:text name="requisite"/></label>
            <s:fielderror fieldName="user.PASSWORD" class="ErrorLabel" /> 
      	</div>
      	
      	<div style="position:relative;">
        	<s:label class="InputLabel" theme="simple" value="%{getText('rePw')}:"></s:label>
            <s:password name="repassword" class="OpText_narrow" theme="simple" type="text"/>
            <label class="ErrorLabel" style="color:black;"><s:text name="requisite"/></label>
            <s:fielderror fieldName="repassword" class="ErrorLabel"/>
      	</div>
      	
      	<div style="position:relative;">
        	<s:label class="InputLabel" theme="simple" value="%{getText('Realname')}:"></s:label>
            <s:textfield name="user.realname" class="OpText_narrow" theme="simple" type="text"/>
            <label class="ErrorLabel" style="color:black;"><s:text name="requisite"/></label>
            <s:fielderror fieldName="user.realname" class="ErrorLabel"/>
      	</div>
      	
      	<div style="position:relative;">
        	<s:label class="InputLabel" theme="simple" value="%{getText('Sex')}:"></s:label>
        	<div class="OpText_narrow" style="text-align:right;">
            	<s:radio style="margin:8px 5px;"
            	name="user.sex" list="{'男','女'}" theme="simple"/>
            	<label class="ErrorLabel" style="text-align:left;color:black;"><s:text name="requisite"/></label>
            	<s:fielderror fieldName="user.sex" class="ErrorLabel" style="text-align:left;"/>
            </div>
      	</div>
      	
      	<div style="position:relative;">
        	<s:label class="InputLabel" theme="simple" value="%{getText('Address')}:"></s:label>
            <s:textfield name="user.address" class="OpText_narrow" theme="simple" type="text"/>
            <label class="ErrorLabel" style="color:black;"><s:text name="requisite"/></label>
            <s:fielderror fieldName="user.address" class="ErrorLabel"/>
      	</div>
      	
      	<div style="position:relative;">
        	<s:label class="InputLabel" theme="simple" value="%{getText('Question')}:"></s:label>
            <s:textfield name="user.question" class="OpText_narrow" theme="simple" type="text"
            style="width:69%;border-radius:2px;"/>
      	</div>
      	
      	<div style="position:relative;">
        	<s:label class="InputLabel" theme="simple" value="%{getText('Answer')}:"></s:label>
            <s:textfield name="user.answer" class="OpText_narrow" theme="simple" type="text"
            style="width:69%;border-radius:2px;"/>
      	</div>
      	
      	<div style="position:relative;">
        	<s:label class="InputLabel" theme="simple" value="%{getText('Email')}:"></s:label>
            <s:textfield name="user.email" class="OpText_narrow" theme="simple" type="text"/>
            <label class="ErrorLabel" style="color:black;"><s:text name="requisite"/></label>
            <s:fielderror fieldName="user.email" class="ErrorLabel"/>
      	</div>
      	
      	<div style="position:relative;">
        	<s:label class="InputLabel" theme="simple" value="%{getText('Fav')}:"></s:label>
            <s:textfield name="user.favorite" class="OpText_narrow" theme="simple" type="text"
            style="width:69%;border-radius:2px;"/>
      	</div>
            
            
        <!-- 信息框结束 -->
        
       	<div style="height:20px;"></div>
    	<div style="text-align:center">        
        	<s:submit Class="UiButton" 
            style="width:35%;margin-left:0;"
            value="%{getText('Regist')}" theme="simple"/>
            <s:reset class="UiButton" type="reset"
            style="width:35%;" value="%{getText('Reset')}" theme="simple"/>
       	</div>
    </s:form>
</div>
<div id="bottomBar" class="Bars" style="bottom:0;">Copyright © 2019 by Huang Yuxiao. All rights reserved</div>
</body>
</html>