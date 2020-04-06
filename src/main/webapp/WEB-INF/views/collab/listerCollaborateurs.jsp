<%@ page import="java.util.List, dev.sgp.entite.*, dev.sgp.service.*"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.4-2.1-dist/css/bootstrap.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/lister.css">
</head>
<body>
	
	<div class="container">
		<div class=row">
			<h1>Les collaborateurs</h1>
			<a href="/sgp/">Accueil</a>
			</br>
		</div>

		<div class="row">
			<form action="rechercher" method="post">
				<label for="recherche">Rechercher un nom ou un prenom qui
					commence par : </label> <input type="text" id="recherche" name="recherche" />
				<input type="submit" value="Rechercher" />
			</form>
			<div class="ml-auto mr-auto center-block">
				<input type="checkbox" id="desactive" name="desactive" /> <label
					for="desactive">Voir les collaborateurs désactivés</label>
			</div>
		</div>
		<div class="row">
			<div>
				<label for="departement">Filtrer par département : </label> <select
					name="departement" id="departement">
					<option value="">Tous</option>
					<option value="comptabilite">Comptabilité</option>
					<option value="ressourceshumaines">Ressources Humaines</option>
					<option value="informatique">Informatique</option>
					<option value="administratif">Administratif</option>
				</select>
			</div>
		</div>
		</br>
		
		<div class="row">
			<%
				List<Collaborateur> collaborateurs = (List<Collaborateur>) request.getAttribute("collaborateurs");
				PhotoLoader photoLoader = new PhotoLoader();
				for (Collaborateur collaborateur : collaborateurs) {
					String photo = photoLoader.loadPhoto(collaborateur.getPhoto());
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