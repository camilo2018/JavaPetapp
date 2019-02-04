<%-- 
    Document   : Consultar_Postulacion
    Created on : 23/11/2018, 08:52:39 AM
    Author     : KnokinGm
--%>

<%@page import="Modelo.Administrador.Postulacion.Postulacion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Administrador.Postulacion.GSPostulacionAdmin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>Administrador</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="CSS/EstiloIngresoPostulacion.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  	<script src="JQ/jquery-3.3.1.min.js"></script>
        <script src="JQ/main.js"></script>
        
</head>
    <body>
    
        <form action="IngresarPostulacionAdmin.jsp">
            <input type="submit" name="nuevo" value="Insertar" class="btn btn-outline-dark" id="nuevo">
  	</form>

	<form action="../Menu/Administrador.jsp">
            <input type="submit" name="volver" value="Volver" class="btn btn-outline-dark" id="vol">
  	</form>
        
            <input type="submit" name="cerrar" value="Cerrar Sesion" class="btn btn-light" id="sal">
    
    <h3 class="display-4">Administrador</h3>
    	        <%
                ArrayList<GSPostulacionAdmin> dat = new ArrayList<>();
                Postulacion co = new Postulacion();
                dat=co.ConsultaAdmin();
                GSPostulacionAdmin cgsc= new GSPostulacionAdmin();
                for (int i = 0; i < dat.size() ; i++) {
                        cgsc=dat.get(i);
                %>
                <div id="centro">
                <div class="caja1">
                    <table class="table">
                    <tr>
                    <thead class='thead-dark'>
                    <th><%=cgsc.getCod()%></th>
                    </thead>
                    </tr>
                    </table>
                </div>
                
                <div class="caja2">
                    <table class="table">
                        <tr>
                        <th>Codigo</th>
                        <th><%=cgsc.getCod()%></th>
                        </tr>
                        <tr>
                        <th>Telefono</th>
                        <th><%=cgsc.getTel()%></th>
                        </tr>
                        <tr>
                        <th>Direccion</th>
                        <th><%=cgsc.getDir()%></th>
                        </tr>
                        <tr>
                        <th>Telefono Fijo</th>
                        <th><%=cgsc.getFij()%></th>
                        </tr>
                        <tr>
                        <th>Certificado</th>
                        <th><%=cgsc.getCer()%></th>
                        </tr>
                        <tr>
                        <th>Cedula</th>
                        <th><%=cgsc.getCed()%></th>
                        </tr>
                        <tr>
                        <th>Animal</th>
                        <th><%=cgsc.getCoda()%></th>
                        </tr>
                    <tr>
                    
                <form method='POST' action='../../ServletSeguimiento'>
                    <input type='hidden' name='codigo' value='<%=cgsc.getCod()%>'>
                    <input type='hidden' name='telefono' value='<%=cgsc.getTel()%>'>
                    <input type='hidden' name='direccion' value='<%=cgsc.getDir()%>'>
                    <input type='hidden' name='fijo' value='<%=cgsc.getFij()%>'>
                    <input type='hidden' name='cedula' value='<%=cgsc.getCed()%>'>
                    <input type='hidden' name='animal' value='<%=cgsc.getCoda()%>'>
                    <th><input type='submit' name='seguimien' value='Seguimiento' class='btn btn-info' ></th>
                </form>
            
                <form method='POST' action=''>
                    <input type='hidden' name='codfu' value=''>
                    <th><input type='submit' name='eliminar' value='Eliminar' class='btn btn-danger'></th>
                </form>
                
                
                </table>
<!Enviar datos>                
           
<!Enviar datos>              
              
            </table>
            </div>
            </div>
            <%}%>
            <%
                if (request.getParameter("modificar")!=null){
                        HttpSession htt=request.getSession();
                        String naom=request.getParameter("nomA");
                        String dato= new String(naom);
                        htt.setAttribute("nom", dato);
                        response.sendRedirect("Modificar_Admin.jsp");
                }
            %>
    </body>
</html>
