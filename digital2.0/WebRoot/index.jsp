<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页</title>
<link rel="stylesheet" href="css/sheet1.css">
<title>Insert title here</title>
</head>
<body>
	<s:action name="Time"></s:action>
	<div id="bkgd"></div>
	<div id="bkgdCover"></div>
	<div id="titleBar" class="Bars">
    	<div class="Tittle"><s:text name="ElectronicMarket"/></div>
        <div style="position:absolute;right:10px;top:15px;">
        	<%if(session!=null){%>
        	<span style="color:#000;text-decoration:none;font-family:微软雅黑;font-size:15px;">
        	<sx:div updateFreq="10000" href="Time" cssStyle="display:inline-block;"></sx:div>
        	${session.TimeMessage}
       		</span>
       		<a style="color:blue;" href="#">[${sessionScope.userName}]</a>
        	<%}else{ %>
        	<a href="login.jsp"><s:text name="unLogin"/></a>
        	<%} %>
            <a href="#">[<s:text name="switchAc"/>]</a>
            <a href="#">[<s:text name="logout"/>]</a>
        </div>
    </div>
     
     <div id="mainBox" style="
    width:1505px;height:1280px;
    top:55px;left:5px;
    position:absolute;">
    	 <div class="ContentSquare"
    	style="width:80%;height:100%;
    	border-radius:2px;
    	top:0;left:10%;">
        	<!--分类栏-->
    		<p class="Tittle" style="font-size:25px;">
           	<s:text name="AllSort"/>
            </p>
            <hr/>
            
            <!--需要iterator-->
            
            <s:iterator id="TypeIte" value="#request.Typelist">
            
            <p class="GoodsType">${TypeIte.type.name}</p>
            
            	<!--需要内iterator-->
            	<s:iterator id="BrandIte" value="#TypeIte.brandList">
            
            <p class="BrandsType">${BrandIte}</p>
            
            	</s:iterator>
            	<!--内iterator结束-->
            
            <hr/>
            
            </s:iterator>
            
            <!--iterator结束-->
            
            <!--分类栏结束-->
            
            <div style="height:30px;"></div>
            
            
			
            <div style="width:100%;text-align:center;">
            <!--商品信息iterator-->
            
            	<s:iterator id="productIte" value="#request.Productlist">
            	<div class="GoodsFrame">
                   <img src="images/${productIte.pic}"
                   	class="GoodsImg"/>
                    <table class="GoodsInfoTable"
              		>
                    	<tr>
                        	<td class="InfoCol">${productIte.code}</td>
                            <td rowspan="3">
                            	<img class="CartSymbol" src="pics/addToCart.jpg"/>
                            </td>
                        </tr>	
                        <tr>
                        	<td class="InfoCol" style="color:blue;">${productIte.name}</td>
                        </tr>
                        <tr>
                        	<td class="InfoCol">￥${productIte.price}</td>
                        </tr>
                    </table>
            	</div>
            	</s:iterator>            
            
            <!--商品信息iterator结束-->         
            	<!-- 商品展示样例 
            	<div class="GoodsFrame">
                   <img src="pics/productImages/1.jpg"
                   	class="GoodsImg"/>
                    <table class="GoodsInfoTable"
              		>
                    	<tr>
                        	<td class="InfoCol">1378538</td>
                            <td rowspan="3">
                            	<img class="CartSymbol" src="pics/addToCart.jpg"/>
                            </td>
                        </tr>	
                        <tr>
                        	<td class="InfoCol" style="color:blue;">AppleMJVE2CH/A</td>
                        </tr>
                        <tr>
                        	<td class="InfoCol">¥6488</td>
                        </tr>	
                    </table>
            	</div>
                <div class="GoodsFrame">
                   <img src="pics/productImages/1.jpg"
                   	class="GoodsImg"/>
                    <table class="GoodsInfoTable"
              		>
                    	<tr>
                        	<td class="InfoCol">1378538</td>
                            <td rowspan="3">
                            	<img class="CartSymbol" src="pics/addToCart.jpg"/>
                            </td>
                        </tr>	
                        <tr>
                        	<td class="InfoCol" style="color:blue;">AppleMJVE2CH/A</td>
                        </tr>
                        <tr>
                        	<td class="InfoCol">¥6488</td>
                        </tr>	
                    </table>
            	</div>
                <div class="GoodsFrame">
                   <img src="pics/productImages/1.jpg"
                   	class="GoodsImg"/>
                    <table class="GoodsInfoTable"
              		>
                    	<tr>
                        	<td class="InfoCol">1378538</td>
                            <td rowspan="3">
                            	<img class="CartSymbol" src="pics/addToCart.jpg"/>
                            </td>
                        </tr>	
                        <tr>
                        	<td class="InfoCol" style="color:blue;">AppleMJVE2CH/A</td>
                        </tr>
                        <tr>
                        	<td class="InfoCol">¥6488</td>
                        </tr>	
                    </table>
            	</div>
                <div class="GoodsFrame">
                   <img src="pics/productImages/1.jpg"
                   	class="GoodsImg"/>
                    <table class="GoodsInfoTable"
              		>
                    	<tr>
                        	<td class="InfoCol">1378538</td>
                            <td rowspan="3">
                            	<img class="CartSymbol" src="pics/addToCart.jpg"/>
                            </td>
                        </tr>	
                        <tr>
                        	<td class="InfoCol" style="color:blue;">AppleMJVE2CH/A</td>
                        </tr>
                        <tr>
                        	<td class="InfoCol">¥6488</td>
                        </tr>	
                    </table>
            	</div>
            	-->

            </div>
    	</div>
    </div>
   	<!--商品列表结束-->
    
    
    <div id="bottomBar" class="Bars" style="top:1300px;">Copyright © 2019 by Huang Yuxiao. All rights reserved</div>
</body>
</html>