<%@ page import="java.util.List, dev.sgp.entite.*, dev.sgp.service.*"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.4-2.1-dist/css/bootstrap.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/lister.css">
<script src="<%=request.getContextPath()%>/js/listerCollaborateur.js"></script>
</head>
<body>
	
	<div class="container">
		<div class=row">
			<h1>Les collaborateurs</h1>
			<a href="/sgp/">Accueil</a>
			</br>
		</div>

		<div class="row">
			<form action="lister" method="post">
				<label for="recherche">Rechercher un nom ou un prenom qui commence par : </label> 
				<input type="text" id="recherche" name="recherche"/>
				<input type="submit" value="Rechercher" />
			</form>
			<div class="ml-auto mr-auto center-block">
				<form method="post" action="lister" id="formdesactive">
					<% Object desactiveactif = request.getAttribute("desactiveactif"); 
					if (desactiveactif != null){%>
						<input type="checkbox" id="desactive" name="desactive" checked onclick="DoSubmit()"/> 
					<%}else{ %>
						<input type="checkbox" id="desactive" name="desactive" onclick="DoSubmit()"/> 
					<%} %>
					<label for="desactive">Voir les collaborateurs désactivés</label>
				</form>
			</div>
		</div>
		<div class="row">
			<div>
			<%String filtrer = (String) request.getAttribute("filtrer"); %>
				<form id="filtrer" method="post" action="lister">
				<label for="departement">Filtrer par département : </label>
					<select name="departement" id="departement" onchange="filtrer()">
						<option value="">Tous</option>
						<%if (("comptabilite").equals(filtrer)){ %>
						<option value="comptabilite" selected>Comptabilité</option>
						<%}else{ %>
						<option value="comptabilite">Comptabilité</option>
						<%} if (("ressources humaines").equals(filtrer)){%>
						<option value="ressources humaines" selected>Ressources Humaines</option>
						<%}else{ %>
						<option value="ressources humaines">Ressources Humaines</option>
						<%} if (("informatique").equals(filtrer)){%>
						<option value="informatique" selected>Informatique</option>
						<%}else{ %>
						<option value="informatique">Informatique</option>
						<%} if (("administratif").equals(filtrer)){%>
						<option value="administratif" selected>Administratif</option>
						<%}else{ %>
						<option value="administratif">Administratif</option>
						<%} %>
					</select>
				</form>
			</div>
		</div>
		</br>
		
		<div class="row">
			<%
				List<Collaborateur> collaborateurs = (List<Collaborateur>) request.getAttribute("collaborateurs");
				for (Collaborateur collaborateur : collaborateurs) {
			%>
			<div class="element m-2 col-sm-8 col-md-6 col-lg-5">
				<div>
					<%=collaborateur.getNom()%>
					<%=collaborateur.getPrenom()%>
				</div>
				<hr>
				<div>
					<img src="<%=request.getContextPath()%>/photo.png" alt="photo"/>
					<div class="table-responsive">
						<table class="table table-sm">
							<tbody>
								<tr>
									<td>Fonction</td>
									<td><%=collaborateur.getIntitulePoste()%></td>
								</tr>
								<tr>
									<td>Département</td>
									<td><%=collaborateur.getDepartement()%></td>
								</tr>
								<tr>
									<td>Email</td>
									<td><%=collaborateur.getEmailPro()%></td>
								</tr>
								<tr>
									<td>Téléphone</td>
									<td></td>
								</tr>
								<tr>
									<td></td><td><form action="editer?matricule=<%= collaborateur.getMatricule() %>" method="post"><input id="editer" type="submit" value="Editer"/></form></td>
								</tr>
							</tbody>	
						</table>
					</div>
				</div>
			</div>
			<%
				}
			%>
		</div>
	</div>
</body>
</html>