<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="cc.shinbi.*" %>
    <%@ page import="cc.shinbi.*" %>
    <%@ page import="cc.shinbi.*" %>
    
    <%
    	String message = (String)request.getAttribute("");
    	Shindan shindan = (shindan)request.getAttribute("");
    %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>あれこれ診断</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
	</head>
	<body>
		<h1>あれこれ診断</h1>
		<p>あれこれ診断へようこそ！！<p>
		
	<%
		if(message != null) {
	%>
			<div id="error"><%= message %></div>
	<%
		}
	%>		
		 <form method="post" action="${pageContext.request.contextPath}/result">
			<h3>あなたのお名前は？</h3>
				<input type="text" name="name">
				
				<div id="buttons">
				<input type="submit" value="診断する診断する診断する診断する診断する診断する診断する診断する診断する診断する診断する">
			</div>
		</form>
	</body>
</html>