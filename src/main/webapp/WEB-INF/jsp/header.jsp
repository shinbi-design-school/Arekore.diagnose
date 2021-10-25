<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="cc.shinbi.bts.model.entity.User" %>

<%
   User user = (user)session.getAttribute("user";)
%>

<header>
<%
   if(user != null){
%>
        <jsp:include page="menu.jsp" />
<%
   }
%>
    <div id="title">
         <h1 id="subtitle">診断システム</h1>
         <h1 id="systemName">あれこれ診断</h1>
    </div>
<%
    if(user != null){
%>
         <div id="welcome">
                   <%= user.getName() %> さん。ようこそ。
        </div>
<%
    }
%>
</header>
