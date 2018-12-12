<%-- 
    Document   : registro
    Created on : 26/10/2018, 09:59:25 AM
    Author     : Knokin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        	<meta charset="utf-8">
	<meta name="viewport" content="width=device−width, initial−scale=1.0" />
	<title>PetApp</title>
	<link rel="stylesheet" href="Estilos.css">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
    </head>
    <body>
<html>
<body>
       <form action="login.jsp">
  <input type="submit" name="volver" value="Inicio" class="btn btn-outline-dark" id="vol">
</form>

	<div id=contenedor>
	<header class="titulo">
		<center>
		<h1>PetApp</h1>
		</center>
            
	</header>
	<div id="Ingreso" src="Imagenes/user">
		<form action="../ServletLogin" method="Post"  id="Login">
			<center>
			<h1>Ingresar</h1>
			<input type="text" name="Usuario" value="" placeholder="Usuario" required="">
			<input type="password" name="Clave" value="" placeholder="Clave" required="">
			<br>
			<br>
			<input type="submit" name="Entrar" value="Iniciar Sesion" class="btn btn-primary" >
			</center>
		</form>
		
	</div>
	<div>
		
	</div>
		<div><br>
			<center>
			<a href="Registrarse.jsp" target="cargar" name="" class="btn btn-outline-success">Registrarse </a>
			<br><br>
			</div>
				<center>
				<iframe name="cargar" id="Registrar">
				</iframe>
				</center>
		<footer >
			Todos los derechos reservados
		</footer>
		</center>
	</div>
	
</body>
</html>

