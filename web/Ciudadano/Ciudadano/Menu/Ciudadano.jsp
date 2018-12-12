<%-- 
    Document   : Ciudadano
    Created on : 23/11/2018, 09:06:17 AM
    Author     : KnokinGm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="Estilo.css">
	<title>PetApp</title>
</head>
<body>
  
	<header id="encabezado">
    <form action="../../../Login/registro.jsp">
    <input type="submit" name="cerrar" value="Cerrar Sesion" class="btn btn-light" id="sal">
    </form>
		<h1>Ciudadano</h1>
		<img src="Imagenes/Mujer.png" height="300" width="300" id="Avatar" >
                <form action="../Consultar_Evento.jsp">
                    <input type="image" name="eventis" src="logos/eventis.png" height="100" width="100" id="eventis">
                </form>
	</header>

  <center>  
	<div id="pricing" class="container-fluid">
            
     <form action="../Consultar_Ciudadano.jsp">
<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center" id="divciudadano">
        <div class="panel-heading" id="Datos">
          <h1>Mis Datos</h1>
        </div>
        <div class="panel-body"><center>
          <input type="image" name="Eventos" src="logos/Postulacion.png" class="img-responsive slideanim" id="logoimagen"></center>
        </div>
      </div>      
    </div> 
  </form>

  <form action="../../Animal/Consultar_Animal.jsp">
<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center" id="divadoptar">
        <div class="panel-heading" id="Adoptar">
          <h1>Adoptar</h1>
        </div>
        <div class="panel-body"><center>
          <input type="image" name="Eventos" src="logos/Adopcion.png" class="img-responsive slideanim" id="logoimagen"></center>
        </div>
      </div>      
    </div> 
  </form>

      <form action="../../Denuncias/Ingresar_Denuncia.jsp">
<div class="col-sm-4 col-xs-12">
      <div class="panel panel-default text-center" id="divadoptar">
        <div class="panel-heading" id="Adoptar">
          <h1>Denunciar</h1>
        </div>
        <div class="panel-body"><center>
          <input type="image" name="Eventos" src="logos/Denuncias.png" class="img-responsive slideanim" id="logoimagen"></center>
        </div>
      </div>      
    </div> 
  </form>
  
</div>
</center> 

</body>
</html>