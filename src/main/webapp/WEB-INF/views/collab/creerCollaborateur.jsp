<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.4-2.1-dist/css/bootstrap.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/index.css">
</head>
<body>
	<h1 class="offset-1 offset-sm-1 offset-md-1 offset-lg-1">Nouveau Collaborateur</h1>
	</br>
	<form method="post" action="creation">
		<div class="form-group row">
		<label for="nom" class="offset-1 offset-sm-1 offset-md-1 offset-lg-1 col-sm-5 col-md-4 col-lg-3 col-form-label">Nom</label>
		<div class="offset-1 col-sm-5">
		<input type="text" name="nom" id="nom" required/>
		</div>
		</div>
		</br>
		<div class="form-group row">
		<label for="prenom" class="offset-1 offset-sm-1 offset-md-1 offset-lg-1 col-sm-5 col-md-4 col-lg-3 col-form-label">Prenom</label>
		<div class="offset-1 col-sm-5">
		<input type="text" name="prenom" id="prenom" required/>
		</div>
		</div>
		</br>
		<div class="form-group row">
		<label for="dateNaissance" class="offset-1 offset-sm-1 offset-md-1 offset-lg-1 col-sm-5 col-md-4 col-lg-3 col-form-label">Date de naissance</label>
		<div class="offset-1 col-sm-5">
		<input type="date" name="dateNaissance" id="dateNaissance" required/>
		</div>
		</div>
		</br>
		<div class="form-group row">
		<label for="adresse" class="offset-1 offset-sm-1 offset-md-1 offset-lg-1 col-sm-5 col-md-4 col-lg-3 col-form-label">Adresse</label>
		<div class="offset-1 col-sm-5">
		<textarea name="adresse" id="adresse" rows="3" cols="19" required></textarea>
		</div>
		</div>
		</br>
		<div class="form-group row">
		<label for="numeroSecuriteSociale" class="offset-1 offset-sm-1 offset-md-1 offset-lg-1 col-sm-5 col-md-4 col-lg-3 col-form-label">Numero de securite sociale</label>
		<div class="offset-1 col-sm-5">
		<input type="number" name="numeroSecuriteSociale" id="numeroSecuriteSociale" required/>
		</div>
		</div>
		</br>
		<input class="offset-4 offset-sm-9 offset-md-7 offset-lg-7 col-2 col-sm-2 col-lg-1" type="submit" value="Creer"/>
	</form>
</body>
</html>