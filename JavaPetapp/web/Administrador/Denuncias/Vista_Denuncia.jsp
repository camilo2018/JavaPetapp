<%@page import="Modelo.Denuncia"%>
<%@page import="Modelo.GSDenuncia"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
       <title>Denuncia</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="CSS/EstiloIngresoDenuncia.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  	<script src="JQ/jquery-3.3.1.min.js"></script>
        <script src="JQ/main.js"></script>
        
</head>
    <body>
        <input type="submit" name="nuevo" value="Insertar" class="btn btn-outline-dark" id="nuevo">
  	<input type="submit" name="volver" value="Volver" class="btn btn-outline-dark" id="vol">
        <input type="submit" name="cerrar" value="Cerrar Sesion" class="btn btn-light" id="sal">
    
    <h3 class="display-4">Denuncia</h3>
            <%
            ArrayList<GSDenuncia> dat = new ArrayList<>();
            Denuncia co = new Denuncia();
            dat=co.Consultar();
            GSDenuncia cgsc= new GSDenuncia();
            for (int i = 0; i < dat.size() ; i++) {
                    cgsc=dat.get(i);
            %>
        <div id="centro">
            <div class="caja1">
                <table class="table">
                <tr>
                <thead class='thead-dark'>
                <th><%=cgsc.getFec()%>-Cedula: <%=cgsc.getCed()%></th>
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
                    <th>Fecha</th>
                    <th><%=cgsc.getFec()%></th>
                    </tr>
                    <tr>
                    <th>Tipo</th>            
                    <th><%=cgsc.getTip()%></th>
                    </tr>
                    <tr>
                    <th>Cedula</th>
                    <th><%=cgsc.getCed()%></th>
                    </tr>
                    <tr>
                    <th>Mensaje</th>
                    <th><%=cgsc.getMen()%></th>
                    </tr>
                    <tr>
                    <th>Evidencia</th>
                    <th><img src="../<%=cgsc.getEvi()%>" width="100" height="100"></th>
                    </tr>
            <form method='POST' action=''>
                <input type='hidden' name='ceduladenun' value='<%=cgsc.getCed()%>'>
                <th><input type='submit' name='aceptarden' class='btn btn-primary' value='Responder'></th>
            </form>
                        
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
