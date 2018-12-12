<%@page import="Modelo.Administrador.Admin.GSAdminAdmin"%>
<%@page import="Modelo.Administrador.Admin.Admin"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="Estilomod.css">
        <script src="JQ/jquery-3.3.1.min.js"></script>
        <script src="JQ/Actualizar.js"></script>
        <title>JSP Page</title>
    </head>
    <body id="fondox">
        <form action="Consultar_Admin.php">
            <input type="submit" name="volver" value="Volver" class="btn btn-outline-light" id="vol">
        </form>
    <div id="padre">
        <div id="modificar" class="form-group">
        <%
            HttpSession ht = request.getSession();
            
            String dat1=(String)ht.getAttribute("nom");
        %>
        <p>Usuario</p><%=dat1%>
        
        <%
                ArrayList<GSAdminAdmin> dat = new ArrayList<>();
                Admin co = new Admin();
                dat=co.Consultar1(dat1);
                GSAdminAdmin cgsc= new GSAdminAdmin();
                for (int i = 0; i < dat.size() ; i++) {
                        cgsc=dat.get(i);
                %>
                    <input type='hidden' class='usu' value='<%=cgsc.getNom()%>' name="usu"> 
                    <p>Clave</p><input type='text' class='clave'  value='<%=cgsc.getCla()%>' name="clave"> 
                    <input type='submit' class='btn btn-info' value='Modificar' name="BTN">
                
            <%}%>
    </body>
</html>

