<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
		<style type="text/css">
			#showData{
				width:200px;
				height:80px;
				border: solid 1px red ;
			}
		</style>
		
		<script type="text/javascript" >
			function getData(){
				var username=document.getElementById("username").value;
				var password=document.getElementById("password").value;
				
				var ajax=null;
				//创建ajax引擎对象
				//复写onreadystatechange对象
					//判断ajax状态码
						//获取响应状态码
							//获取和响应内容
					//发送请求
				if(window.XMLHttpRequest){
					ajax=new XMLHttpRequest();
				}else {
					alert("当前浏览器不支持本网站!;
					return;
				}
				ajax.onreadystatechange=function(){
					
					if(ajax.readyState==4){
						if(ajax.status==200){
							var result=ajax.responseText;
							
							document.getElementById("showData").innerHTML=result;
							
						}
					}
				}
				//get方式:请求实体拼接在url后面
					//ajax.open("get","ajax2?username="+username+"&password="+password);
					//	ajax.send(null);
				//post方式:请求实体单独发送
					ajax.open("post","ajax2");
						ajax.setRequestHeader("Content-Type",
								"application/x-www-form-urlencoded");
						//如果不写这句会导致post传不上参数,这句话代表按照 键值对 解析
					ajax.send("username="+username+"&password="+password);
				
				
			}
		
		</script>
	
	
	</head>
	<body>
		
		<input type="text" name="username" id="username"/><br/>
		<input type="password" name="password" id="password"/><br/>
		<input type="button" value="login" onclick="getData()"/><br/>
			
		<div id="showData">未登录</div>
		
	</body>
</html>
