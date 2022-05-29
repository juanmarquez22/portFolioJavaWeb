<%-- 
    Document   : nuevoIdioma
    Created on : 9 may. 2022, 20:42:02
    Author     : juanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Nuevo Idioma</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Carga de Idioma</h1>>
        <form action="SvIdioma" method="POST">
            <p><label>Idioma: </label> <input type="text" name="idiom"></p>
            <p><label>Nivel: </label> <input type="text" name="nivel"></p>
            <p><label>Institucion: </label> <input type="text" name="institucion"></p>
            <p><label>Imagen: </label> <input type="text" name="imagen"></p>
            <button type="submit">Cargar</button>
        </form>
    </body>
</html>
