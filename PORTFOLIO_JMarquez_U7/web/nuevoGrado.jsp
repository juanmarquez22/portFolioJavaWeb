<%-- 
    Document   : nuevoGrado
    Created on : 12 may. 2022, 16:03:06
    Author     : juanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Estudio de Grado</title>
    </head>
    <body>
        <h1>Carga de Estudio de Grado</h1>>
        <form action="SvGrado" method="POST">
            <p><label>Título: </label> <input type="text" name="titulo"></p>
            <p><label>Institucion: </label> <input type="text" name="institucion"></p>
            <p><label>Imagen: </label> <input type="text" name="imagen"></p>
            <p><label>Ingreso: </label> <input type="text" name="ingreso"></p>
            <p><label>Egreso: </label> <input type="text" name="egreso"></p>
            <p><label>Carrera: </label> <input type="text" name="carrera"></p>
            <button type="submit">Cargar</button>
        </form>
    </body>
</html>
