<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>手机验证码</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css" type="text/css" />
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/bootstrap.min.js"></script>
  	<style type="text/css">
  		*{
  			margin:10px;
  		}
  	</style>
  	
  	<script type="text/javascript">
  		
  		$(function(){
  		
  			var result ="";
  			
  			
  			$("#btnIF").click(function(){
  				var phone=$("#phone").val();
  				$.post(
  					"getMess.html",{phone:phone},function(e){
  						alert(e);
  		   				result=e;
  					}
  				);
  			});
  			
  			$("#submit").click(function(){
  				var mess=$("#mess").val();
  				if(mess==result){
  					alert("验证码正确");
  					return true;
  				}else{
  					alert("验证码不对");
  					return false;
  				}
  			});
  			
  		});

  	</script>
  </head>
  
  <body>
    <h3>点击注册</h3>
    <form action="GetNote.html" method="post">
    	手机号：<input type="text" name="phone" id="phone" /><p/>
    	验证码：<input type="text" name="mess" id="mess" />&nbsp;&nbsp;<span id="btnIF" class="btn btn-primary">获取验证码</span><p />
    	<input type="submit" id="submit" value="注册" />
    	
    </form>
    
    <!-- <div class="form-group clearfix">
        <label class="col-xs-3 control-label" for="uMobile">手机号码</label>
        <div class="col-xs-3 control-col">
        	<input type="text" class="form-control" placeholder="请输入手机号码" id="uMobile" name="phone" maxlength="11" datatype="m" nullmsg="请输入您的手机号码" errormsg="请输入正确的手机号码" ajaxurl="/reg/check-phone">
    	</div>
    </div>
    
    <div class="form-group clearfix">
    	<label class="col-xs-3 control-label">手机验证码</label>
    	<div class="col-xs-3 control-col">
 			<input type="text" class="form-control" placeholder="请输入手机号码" id="uMobile" name="mess" maxlength="11" datatype="m" nullmsg="请输入您的手机号码" errormsg="请输入正确的手机号码" ajaxurl="/reg/check-phone">
 		</div>
    </div>
    
    <div class="col-xs-9 col-xs-offset-3 control-col code-mode" data-email="#uEmail" data-mobile="#uMobile" data-imgcode="#imgCode">
        <button class="btn btn-primary " type="button" style="width:15%;margin-right:2%;margin-top:0;" data-type="sms" onclick="codeVerification(this)" disabled="true">获取短信验证码</button>
    	<button class="btn btn-primary " type="button" style="width:15%;margin-left:2%;margin-top:0;" data-type="voice" onclick="codeVerification(this)" disabled="true">获取语音验证码</button>
   	</div> -->
   	
  </body>
</html>
