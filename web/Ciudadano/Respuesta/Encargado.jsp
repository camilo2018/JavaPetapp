<%-- 
    Document   : Encargado
    Created on : 15/02/2019, 08:52:11 AM
    Author     : KnokinGm
--%>

<%@page import="Modelo.Administrador.ResPositiva.Rpositiva"%>
<%@page import="Modelo.Administrador.Funcionario.Funcionario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Administrador.Funcionario.GSFuncionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,  user-scalabe=no, initial-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" href="CSS/EstiloRespuesta.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
  	<script src="JQ/jquery-3.3.1.min.js"></script>
        <script src="JQ/main.js"></script>
        <title>Pet App</title>
    </head>
    <body>
        
          <%
                ArrayList<GSFuncionario> res = new ArrayList<>();
                Rpositiva res1 = new Rpositiva();
                res=res1.Consultar_encargado(.getCed());
                GSRespuesta res2= new GSRespuesta();
                for (int i3 = 0; i3 < res.size() ; i3++) {
                        res2=res.get(i3);
                %>
          <div id="centro">
                <div class="caja1">
                    <table class="table">
                    <tr>
                    <thead class='thead-dark'>
                    <th>Funcionario Encargado</th>
                    </thead>
                    </tr>
                    </table>
                </div>
                
                <div class="caja2">
                    <table class="table">
                        <tr>
                        <th>Cedula</th>
                        <th><%=res2.getCod()%></th>
                        </tr>
                        <tr>
                        <th>Telefono</th>
                        <th><%=res2.getCed()%></th>
                        </tr>
                        <tr>
                        <th>Nombre Completo</th>            
                        <th><%=res2.getMen()%></th>
                        </tr>
                        <tr>
                            <th>Correo</th>
                            <th><%=res2.getEnc()%></th>
                        </tr>
                         <tr>
                            <th>Cargo</th>
                            <th><%=res2.getEnc()%></th>
                         <tr>
                              <tr>
                            <th>Dependencia</th>
                            <th><%=res2.getEnc()%></th>
                        </tr>
                
                </table>
    </body>
</html>
