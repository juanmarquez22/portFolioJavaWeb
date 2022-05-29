<%-- 
    Document   : mostrarCurso
    Created on : 15 may. 2022, 12:01:26
    Author     : juanm
--%>

<%@page import="logica.Curso"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>    
        <title>Portfolio JUAN MARQUEZ</title>
        <link rel="stylesheet" href="styles.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Lato:wght@300;400;700&display=swap" rel="stylesheet">
        <script src="https://kit.fontawesome.com/b73f4c24d2.js" crossorigin="anonymous"></script>

    </head>
    
    
    <body>
        
        <header>
            <nav class="nav">
                <p id="nombre">JUAN MARQUEZ</p>
                <ul class="lista-nav">
                    <li class="item-nav"><a href="#hero"> <i class="far fa-address-card"></i>Inicio</a></li>
                    <li class="item-nav"><a href="#educacion"><i class="fas fa-server"></i>Educación</a></li>
                    <li class="item-nav"><a href="#experiencia"><i class="fas fa-images"></i>Experiencia Laboral</a></li>
                    <li class="item-nav"><a href="#cursos"><i class="fas fa-images"></i>Cursos Realizados</a></li>
                </ul>
            </nav>
        </header>
        
        <section id="cursos">
            
            <h2>Cursos Realizados</h2>
                
                <div class="cards">
                    <%
                        List<Curso> listaCursos = (List) request.getSession().getAttribute("listaCursos");
                        for (Curso curso : listaCursos){
                                        
                    %> 
                    <div class="card">
                        <img class="imgcards" src="<%=curso.getImagen()%>" alt="imagen1">
                        <h4><a href="<%=curso.getCertificado()%>"><%=curso.getNombre()%></a></h4>
                        <p><%=curso.getDetalle()%></p>
                    </div>
                    
                    <%
                        }
                    %>
                </div>
                

                </div>
        </section>
    </body>
</html>
