<%-- 
    Document   : Ingresar_Veterinaria
    Created on : 23/11/2018, 09:02:43 AM
    Author     : KnokinGm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Veterinaria</title>
    </head>
    <body>
        <form action="../../ServletVeterinaria">
        <h1>Veterinaria</h1>
        <input type="text" name="nit" size="30" placeholder="Digite el nit de la veterinaria"><BR>
        <input type="text" name="telefono" size="30" placeholder="Digite el telefono de la veterinaria"><BR>
        <input type="text" name="nombre" size="30" placeholder="Digite el nombre de la veterinaria"><BR>
        <input type="text" name="direccion" size="30" placeholder="Digite la direccion de la veterinaria"><BR>
        <input type="text" name="clave" size="30" placeholder="Digite el clave de la veterinaria"><BR>
        <input type="text" name="rol" size="30" placeholder="Digite el rol de la veterinaria"><BR>
        <input type="submit" name="botonvete" value="Guardar">
        </form>
    </body>
</html>
