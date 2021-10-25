<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String message = (String)request.getAttribute("message");
	Shindan shindan = (Shindan)request.getAttribute("shindan");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>マメな人診断</title>
	</head>
	<body>
		<h1>マメな人診断</h1>
		<p>ようこそ。あなたのタイプを診断します。</p>
<% 
	if(message != null) {
%>
	<div id="error"><%= message %></div>
<% 
	}
%>
	
<% 
	for(Question question : shindan.getQuestion()) {
%>
		<h3><%= question.getQuestion() %></h3>
		<div>
<% 
	String option = "checked";
	for(Item item : question.getItems()) {
%>
		<div>
			<input type="radio"
				name="<%= question.getKey() %>"
				value="<%= item.getId() %>"
				<%= option %>
			>
			<%= item.getText() %>
		</div>
<% 
	option = "";
	}
%>
		</div>
<% 
	}
%>
		<div id="buttons">
			<input type="submit" value="次の問題へ">
		</div>

	</body>
</html>