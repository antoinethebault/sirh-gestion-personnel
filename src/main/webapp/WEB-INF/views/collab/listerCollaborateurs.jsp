<%@ page import="java.util.List, dev.sgp.entite.*"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.4-2.1-dist/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
		<%
			List<Collaborateur> collaborateurs = (List<Collaborateur>) request.getAttribute("collaborateurs");
			for (Collaborateur collaborateur : collaborateurs) {
		%>
		<li><%=collaborateur.getNom()%> <%=collaborateur.getPrenom() %></li>
		<%
			}
		%>
	</ul>
</body>
</html>