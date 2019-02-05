<%@page import="Modelo.Administrador.Ciudadano.Ciudadano"%>
<%@page import="Modelo.Administrador.Ciudadano.GSCiudadanoAdmin"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="Modelo.Usuario.Usuario"%>
<%@page import="Modelo.Usuario.GSUsuario"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,  user-scalabe=no, initial-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" href="CSS/EstiloIngresoCiudadano.css">
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
        HttpSession ht = request.getSession();
        String dat2=(String)ht.getAttribute("nom1");
        %>
        <%
                ArrayList<GSUsuario> datc1 = new ArrayList<>();
                Usuario co1 = new Usuario();
                datc1=co1.Consultar1(dat2);
                GSUsuario cgsc1= new GSUsuario();
                for (int i = 0; i < datc1.size() ; i++) {
                        cgsc1=datc1.get(i);
                %>
                    <input type='hidden' class='usu' value='<%=cgsc1.getNom()%>' name="usu4">
                <%}%>
            
        <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-expand-lg navbar-light bg-light navbar-dark bg-dark fixed-top">
				 
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="navbar-toggler-icon"></span>
                    </button> <a class="navbar-brand" href="">PetApp</a>
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="navbar-nav ml-md-auto">
                            <a class="navbar-brand" href="">Usuario: <%=dat2%></a>
                                <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="" id="navbarDropdownMenuLink" data-toggle="dropdown">
                                    <img src="../../Uploads/FotosUsuarios/<%=cgsc1.getFot()%>" class="fotomod" 
                                      style="width:50px;height:50px;border-radius:200px 200px;"></a>     
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                        <form action="../Ciudadano/Consultar_Ciudadanos.jsp" method="Post">
                            <input type='hidden' name='usu4' value='<%=dat2%>'>
                            <a class="dropdown-item" href="../Ciudadano/Consultar_Ciudadanos.jsp" name="per">Perfil</a>
                        </form> 
                        <a class="dropdown-item" href="../../Notificaciones/Vista/Vista_Notificaciones.php" name="not">Respuestas</a> <a class="dropdown-item" href="../../Menu/Vista/Ciudadano.php" name="ciu">Menu</a>
                            <div class="dropdown-divider">
                        </div> <a class="dropdown-item" href="../../../Cerrar.php">Cerrar Sesion</a>
                    </div>
						
						</li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
</div>
                    <%
                if (request.getParameter("per")!=null){
                        HttpSession htt=request.getSession();
                        String naom=request.getParameter("usu4");
                        String dato= new String(naom);
                        htt.setAttribute("nom1", dato);
                        response.sendRedirect("../Ciudadano/Consultar_Ciudadano.jsp");
                }
            %>
        
        
        <form action="Menu/Ciudadano.jsp">
            <input type="submit" name="volver" value="Volver" class="btn btn-outline-dark" id="vol">
  	</form>
            <h3 class="display-4" style="margin-top: 50px;">Ciudadano</h3>
    	        <%
                ArrayList<GSCiudadanoAdmin> dat = new ArrayList<>();
                Ciudadano co = new Ciudadano();
                dat=co.Consultar1(dat2);
                GSCiudadanoAdmin cgsc= new GSCiudadanoAdmin();
                
                for (int i = 0; i < dat.size() ; i++) {
                        cgsc=dat.get(i);
                %>
            <div id="centro">
                <div class="caja1">
                    <table class="table">
                    <tr>
                    <thead class='thead-dark'>
                    <th><%=cgsc.getNom()%></th>
                    </thead>
                    </tr>
                    </table>
                </div>
                
                <div class="caja2">
                    <table class="table">
                        <tr>
                        <th>Cedula</th>
                        <th><%=cgsc.getCed()%></th>
                        </tr>
                        <tr>
                        <th>Nombre</th>
                        <th><%=cgsc.getNom()%></th>
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
                        <th>Correo</th>
                        <th><%=cgsc.getCor()%></th>
                        </tr>
                    
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
