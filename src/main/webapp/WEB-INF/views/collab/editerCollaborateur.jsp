<%@ page import="dev.sgp.entite.*"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.4-2.1-dist/css/bootstrap.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/editer.css">
</head>
<body>
	<%
		Collaborateur collaborateur = (Collaborateur) request.getAttribute("collaborateur");
	%>
	<div class="container">
		<div class="row">
			<div class="col-sm-12 col-md-5">
				<img src="<%=request.getContextPath()%>/photo.png" alt="photo" />
			</div>
			<div class="col-sm-12 col-md-7">
				<h1><%=collaborateur.getNom()%>
					<%=collaborateur.getPrenom()%>
					-
					<%=collaborateur.getMatricule()%></h1>
				
				<div class="border form-group">
					<form action="edition" method="post">
					<input type="checkbox" id="desactive" name="desactive" /> 
					<label for="desactive">Désactiver</label>
					<input type="hidden" id="matricule" name="matricule" value="<%=collaborateur.getMatricule() %>"/>
					<fieldset>
					<legend>Identité</legend>
					<label for="civilite">Civilité</label> 
					<select class="form-control" id="civilite" name="civilite">
						<option value="mr">Mr</option>
						<option value="mme">Mme</option>
					</select> </br> 
					<label for="nom">Nom</label> 
					<input type="text" id="nom" name="nom" value="<%=collaborateur.getNom()%>" disabled /> </br> 
					<label for="prenom">Prénom</label> 
					<input type="text" id="prenom" name="prenom" value="<%=collaborateur.getPrenom()%>" disabled /> </br> 
					<label for="datenaissance">Date de naissance</label> 
					<input type="date" id="datenaissance" name="datenaissance" value="<%=collaborateur.getDateNaissance()%>"disabled /> </br> 
					<label for="adresse">Adresse</label>
					<textarea class="form-control" rows="3" cols="20" id="adresse" name="adresse" required><%=collaborateur.getAdresse()%></textarea>
					</br> 
					<label for="numerosecuritesociale">Numéro de sécurité sociale</label> 
					<input class="form-control" type="text" id="numerosecuritesociale" name="numerosecuritesociale" value="<%=collaborateur.getNumeroSecuriteSociale()%>"disabled /> 
					<label for="telephone">Téléphone</label>
					<input class="form-control" type="text" id="telephone" name="telephone" /> </br>
					</fieldset>
					<hr>
					<fieldset>
						<legend>Poste</legend>
						<label for="intituleposte">Intitulé du poste</label> 
						<input class="form-control" type="text" id="intituleposte" name="intituleposte" value="<%=collaborateur.getIntitulePoste()%>"/> </br> 
						<label for="departement">Département</label> 
						<input class="form-control" type="text" id="departement" name="departement" value="<%=collaborateur.getDepartement()%>"/> </br>
					</fieldset>
					<hr>
					<fieldset>
						<legend>Coordonnées bancaires</legend>
						<label for="banque">Banque</label> 
						<input class="form-control" type="text" id="banque" name="banque" value="<%=collaborateur.getBanque()%>"/> </br> 
						<label for="bic">Bic</label> 
						<input class="form-control" type="text" id="bic" name="bic" value="<%=collaborateur.getBic()%>"/> </br> 
						<label for="iban">Iban</label> 
						<input class="form-control" type="text" id="iban" name="iban" value="<%=collaborateur.getIban()%>"/> </br>
					</fieldset>
					<input type="submit" value="Sauvegarder"/>
					</form>
					<a href="lister">Retour</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>