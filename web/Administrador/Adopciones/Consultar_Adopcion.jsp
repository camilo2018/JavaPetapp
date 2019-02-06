<%-- 
    Document   : Consultar_Adopcion
    Created on : 23/11/2018, 08:24:15 AM
    Author     : KnokinGm
--%>

<%@page import="Modelo.Administrador.Adopcion.Adopcion"%>
<%@page import="Modelo.Administrador.Adopcion.GSAdopcion"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   <title>Adopcion</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="CSS/EstiloIngresoAdopcion.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  	<script src="JQ/jquery-3.3.1.min.js"></script>
        <script src="JQ/main.js"></script>
        
</head>
    <body>
	<form action="../Menu/Administrador.jsp">
            <input type="submit" name="volver" value="Volver" class="btn btn-outline-dark" id="vol">
  	</form>
        
        
    <h3 class="display-4">Adopcion</h3>
    	        <%
                ArrayList<GSAdopcion> dat = new ArrayList<>();
                Adopcion co = new Adopcion();
                dat=co.Consultar();
                GSAdopcion cgsc= new GSAdopcion();
                for (int i = 0; i < dat.size() ; i++) {
                        cgsc=dat.get(i);
                %>
                <div id="centro">
                <div class="caja1">
                    <table class="table">
                    <tr>
                    <thead class='thead-dark'>
                    <th><%=cgsc.getCodap()%></th>
                    </thead>
                    </tr>
                    </table>
                </div>
                
                <div class="caja2">
                    <table class="table">
                        <tr>
                        <th>Animal</th>
                        <th><%=cgsc.getAni()%></th>
                        </tr>
                        <tr>
                        <th>Propietario</th>
                        <th><%=cgsc.getCed()%></th>
                        </tr>
                        <tr>
                        <th>Respuesta</th>
                        <th><%=cgsc.getMen()%></th>
                        </tr>
                        <tr>
                        
                        
               <form method='POST' action=''>
                    <input type='hidden' name='cod' value=''>
                    <th><input type='submit' name='modificar' value='Modificar' class='btn btn-info' ></th>
                </form>
            
                <form method='POST' action=''>
                    <input type='hidden' name='codfu' value=''>
                    <th><input type='submit' name='eliminar' value='Eliminar' class='btn btn-danger'></th>
                </form>
                
                
                </table>
            </div>
            </div>
            <%}%>
    </body>
</html>

