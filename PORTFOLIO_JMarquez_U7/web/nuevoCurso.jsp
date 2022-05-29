<%-- 
    Document   : nuevoCurso
    Created on : 15 may. 2022, 10:26:38
    Author     : juanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Curso</title>
    </head>
    <body>
        <h1>Carga de CURSO</h1>>
        <form action="SvCurso" method="POST">
            <p><label>Título: </label> <input type="text" name="nombre"></p>
            <p><label>Certificado: </label> <input type="text" name="certificado"></p>
            <p><label>Detalle: </label> <input type="text" name="detalle"></p>
            <p><label>Imagen: </label> <input type="text" name="imagen"></p>
            <button type="submit">Cargar</button>
        </form>
    </body>
</html>
