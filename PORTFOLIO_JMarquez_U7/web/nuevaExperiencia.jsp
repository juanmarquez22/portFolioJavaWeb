<%-- 
    Document   : nuevaExperiencia
    Created on : 15 may. 2022, 10:37:10
    Author     : juanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva EXPERIENCIA</title>
    </head>
    <body>
        <h1>Carga de EXPERIENCIA</h1>>
        <form action="SvExperiencia" method="POST">
            <p><label>Empresa: </label> <input type="text" name="empresa"></p>
            <p><label>Imagen: </label> <input type="text" name="imagen"></p>
            <p><label>Periodo: </label> <input type="text" name="periodo"></p>
            <p><label>Descripcion: </label> <input type="text" name="descripcion"></p>
            <button type="submit">Cargar</button>
        </form>
    </body>
</html>
