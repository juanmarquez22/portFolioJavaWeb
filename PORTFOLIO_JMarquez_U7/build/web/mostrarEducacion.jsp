<%-- 
    Document   : mostrarIdiomas
    Created on : 11 may. 2022, 20:38:35
    Author     : juanm
--%>

<%@page import="logica.Pregrado"%>
<%@page import="logica.Grado"%>
<%@page import="logica.Estudio"%>
<%@page import="logica.Idioma"%>
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
        
        <section id="educacion">
            
            <h2>Formación Académica</h2>
                <h3>Formación de Grado</h3>
                <div class="contE">                    
                    <%
                        List<Estudio> listaEstudios = (List) request.getSession().getAttribute("listaEstudios");
                        for (Estudio estudio : listaEstudios){
                            if (estudio.getTipo().equals("Grado")){
                            Grado grado = (Grado)estudio;
                                        
                    %> 
                    <img class="logoUniv" src="<%=grado.getImagen()%>" alt="Logo Institucion">
                    <p style="margin-right: 50px"><u><b>Título de Grado</u>: <%=grado.getTitulo()%></b><br>
                    Institución: <%=grado.getInstitucion()%><br>
                    Carrera: <%=grado.getCarrera()%><br>
                    Fecha de Egreso: <%=grado.getEgreso()%><br>
                        
                    </p><br>
                    <%
                        }
                        }
                    %>
                </div>
                
                <h3>Formación de Pre-Grado</h3>
                
                <div class="contE">                    
                    <%
                        for (Estudio estudio : listaEstudios){
                            if (estudio.getTipo().equals("Pregrado")){
                            Pregrado pregrado = (Pregrado)estudio;
                                        
                    %> 
                    <img class="logoUniv" src="<%=pregrado.getImagen()%>" alt="Logo Institucion">
                    <p style="margin-right: 50px"><u><b>Título Alcanzado</u>: <%=pregrado.getTitulo()%></b><br>
                    Institución: <%=pregrado.getInstitucion()%><br>
                    Promedio: <%=pregrado.getPromedio()%><br>
                    Fecha de Egreso: <%=pregrado.getEgreso()%><br>
                        
                    </p><br>
                    <%
                        }
                        }
                    %>
                </div>
                
                      
            
            <h2>Idiomas</h2>
            <%
                List<Idioma> listaIdiomas = (List) request.getSession().getAttribute("listaIdiomas");
                for (Idioma idioma : listaIdiomas){            
            %>   

                <div class="contE">
                    <img class="logoUniv" src="<%=idioma.getImagen()%>" alt="Logo Institucion">
                    <p style="margin-right: 50px"><u><b>Idioma: <%=idioma.getIdiom() %></u></b><br>
                        Nivel: <%=idioma.getNivel()%><br>
                        Institución: <%=idioma.getInstitucion()%><br>
                    </p>
                <%
                    }
                %>

                </div>
        </section>
    </body>
</html>
