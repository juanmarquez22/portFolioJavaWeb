<%-- 
    Document   : index
    Created on : 9 may. 2022, 20:12:44
    Author     : juanm
--%>

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
    <section id="hero" class="hero">
        <div class="fondoPerfil">
        </div>
        <div class="info">
            <div class="contenedor">
                <img class="foto" src="./assets/img/foto.png" alt="Foto Juan Marquez">            
                <h3 class="title">JUAN L MARQUEZ</h3>
                <h4>Profesional de Apoyo en IEE-CONICET</h4>
                <a class="infoCont" href="">Información de Contacto</a>
                <h4>San Juan (Argentina)</h4>
            </div>
            <div class="iee">
                <img class="fotoiee" src="./assets/img/conicetiee.png" alt="Foto Conicet-IEE">
            </div>
        </div>
        <div class="botones">
            <ul class="lista-nav">
                <li class="item-nav"><a href="#hero"></a> <i class="far fa-address-card"></i>Información Personal</li>
                <li class="item-nav"><a href="#servicios"></a><i class="fas fa-server"></i>Intereses Personales</li>
            </ul>
        </div>
    </section>
    
    <section id="educacion">
        <h2>Formación Académica</h2> 
        <form action="SvEducacion" method="GET">
            <button type="submit">Mostrar</button>
        </form>
        <h3>Formación de Grado <a class="infoContI" href="nuevoGrado.jsp">Agregar</a></h3>
        
        <h3>Formación de Pre-Grado<a class="infoContI" href="nuevoPregrado.jsp">Agregar</a></h3>
        
        <h3>Idiomas<a class="infoContI" href="nuevoIdioma.jsp">Agregar</a></h3>
        
    </section>
        

    <section id="experiencia">
        <h2>Antecedentes Laborales <a class="infoContI" href="nuevaExperiencia.jsp">Agregar</a></h3>
        <form action="SvExperiencia" method="GET">
            <button type="submit">Mostrar</button>
        </form>
        
        <!--
        <div class="contE">
            <img class="logoUniv" src="./assets/img/conicetiee.png" alt="Logo EPET 1">
            <p>Periodo: 2021 - Actual</p>
            <p><b>IEE-CONICET-UNSJ Instituto Energía Eléctrica de la Universidad Nacional de San Juan (CPA Profesional Adjunto)</b>: 
                Profesional para asistir y brindar soporte en el Laboratorio de Energías Renovables del Instituto de Energía Eléctrica de la Universidad Nacional de San Juan. 
                Fecha de ingreso: 01/04/2021
            </p>
        </div>
        <div class="contE">
            <img class="logoUniv" src="./assets/img/energia.png" alt="Logo EPET 1">
            <p>Periodo: 2015 - 2020</p>
            <p><b>ENERGÍA SAN JUAN</b>: Ingeniero de Obras Eléctricas de Baja, Media y Alta Tensión. A cargo de supervisar la ejecución de los trabajos por parte de empresas contratistas de Energía San Juan, principalmente en 13,2 kV, y elaborar reportes para ser presentados al  Ente Provincial Regulador de la Electricidad. Responsabilidad exclusiva en supervisión de construcción de Línea de Alta Tensión 132kV para vincular las nuevas Estaciones Transformadoras ET LA BEBIDA – ET ALBARDON/CHIMBAS y ET LA BEBIDA – ET RAWSON/POCITO. Elaboración de Pliegos para Concursos Privados de Precios y demás tareas inherentes a la designación de Obras mediante concursos.
                PROMOCIÓN (Noviembre 2018): Jefe del Área Obras de Energía San Juan SA 
                (5 personas a cargo). El cargo incluye responsabilidad en el concurso, designación de contratista, seguimiento en la ejecución para cumplir los plazos en la finalización de las obras de 13,2 kV y BT (tanto aéreas como subterráneas). Elaboración de informes y reportes para ser enviados al Ente Regulador. Fecha de ingreso: 09/03/2015
            </p>
        </div>
        <div class="contE">
            <img class="logoUniv" src="./assets/img/barrick.jpg" alt="Logo EPET 1">
            <p>Periodo: 2011 - 2013</p>
            <p><b>BARRICK EXPLORACIONES ARGENTINAS SA</b>: Trabajos de Configuración del Sistema de Control (DCS) de la Planta de Procesos del Proyecto Minero Pascua-Lama.	Desarrollo de Tareas de configuración de controladores, Pruebas de Aceptación en Fábrica de Tableros del DCS en planta de fabricación de ABB Argentina, Pruebas en Terreno y Puesta en Marcha de Plantas de Construcción Primaria.

				Apoyo en tareas de Supervisión de instalación de grupos generadores para abastecimiento de energía al campamento “Los Amarillos”.

                Periodo de Ejecución: desde 21/02/2011 hasta 27/11/2013.
                Función: Ingeniero DCS.
            </p>
        </div>
        <div class="contE">
            <img class="logoUniv" src="./assets/img/icsa.jpg" alt="Logo EPET 1">
            <p>Periodo: 2010 - 2011</p>
            <p><b>ICSA MENDOZA</b>: Ingeniero de Puesta en marcha de protecciones eléctricas en Central  Hidráulica en construcción, configurando, ajustando y ensayando dispositivos  marca ABB, de la plataforma 670 (luego de realizar curso de perfeccionamiento en las instalaciones de ABB en Valentín Alsina, Buenos Aires) para la protección del Generador de unidad, transformador elevador, líneas hasta la sub-estación, sub-estación y líneas de salida de la central.

                También en las instalaciones de fabricación de paneles de ICSA se configuró y ensayo dispositivos SEL y AREVA (Serie MICOM) para otras obras en las que la empresa tenía asignadas tareas específicas. (Parque Eólico ARAUCO en La Rioja)
                
                Curso de manejo de equipos de inyección secundaria de diversas marcas para el ensayo de los dispositivos de protección, dictado en las instalaciones de ICSA por personal de ABB. 
                
                Periodo de Ejecución: desde 03/2010 hasta 10/2010.
                Función: Ingeniero de Protecciones.
                
            </p>
        </div>
        <div class="contE">
            <img class="logoUniv" src="./assets/img/exxon.png" alt="Logo EPET 1">
            <p>Periodo: 2010</p>
            <p><b>EXXON Mobil</b>: Realización de pasantía rentada en EXXON Mobil (Esso Petrolera Argentina). Duración: 2 meses
                
            </p>
        </div>
        <div class="contE">
            <img class="logoUniv" src="./assets/img/conicetiee.png" alt="Logo EPET 1">
            <p>Periodo: 2007 - 2009</p>
            <p><b>INSTITUTO DE ENERGIA ELECTRICA</b>: Ayudante de Cátedras (en Instituto de Energía Eléctrica de la U.N.S.J.), en las materias de la carrera Ingeniería Eléctrica:<br>                            
                Principios de Electrónica y Telecomunicaciones.<br>
                Electrónica de Potencia
                
            </p>
        </div>
        <div class="contE">
            <img class="logoUniv" src="./assets/img/loma.jfif" alt="Logo EPET 1">
            <p>Periodo: 2007 - 2009</p>
            <p><b>LOMA NEGRA CIASA</b>: Pasantía en LOMA NEGRA CIASA durante un lapso de 6 meses en mantenimiento electro-mecánico.
                
            </p>
        </div>
        
        -->
    </section>

    <section id="cursos"> 
        <h2>Cursos Realizados <a class="infoContI" href="nuevoCurso.jsp">Agregar</a></h2> 
        <form action="SvCurso" method="GET">
            <button type="submit">Mostrar</button>
        </form>
        <!--
        <div class="cards">
            <div class="card">
                <img class="imgcards" src="./assets/img/folcademy.png" alt="imagen1">
                <h4><a href="./assets/img/UI-18.png">UI DEVELOPMENT</a></h4>
                <p>Folcademy. – Diciembre 2021, con una carga horaria de 64hs.</p>
            </div>
            <div class="card">
                <img class="imgcards" src="assets/img/arg1.jpg" alt="imagen1">
                <h4><a href="./assets/img/argentina_programa_agosto_octubre_2021.pdf">ARGENTINA PROGRAMA: #SeProgramar</a></h4>
                <p>Ministerio de Desarrollo Productivo. CESSI Argentina – Octubre 2021.</p>
            </div>
            <div class="card">
                <img class="imgcards" src="assets/img/conicetiee.png" alt="imagen1">
                <h4>TECNOLOGIAS DE GENERACIÓN ELECTRICA DISTRIBUIDA</h4>
                <p>IEE–FI–UNSJ. Dictado por los Ing. Domingo Pontoriero, Juan Serrano, Gustavo Baron y el Dr. Ing. Pedro Mercado.</p>
            </div>
        </div>
        <div class="cards">
            <div class="card">
                <img class="imgcards" src="assets/img/conicetiee.png" alt="imagen1">
                <h4>INTRODUCCIÓN A LA PROTECCIÓN DE SISTEMAS ELÉCTRICOS DE POTENCIA</h4>
                <p>Carga horaria de 30 horas. Instituto de Energía Eléctrica – 
                    Facultad de Ingeniería – Universidad Nacional de San Juan.</p>
            </div>
            <div class="card">
                <img class="imgcards" src="assets/img/conicetiee.png" alt="imagen1">
                <h4>AUTOCAD</h4>
                <p>Instituto de Energía Eléctrica – Facultad de Ingeniería – Universidad Nacional de San Juan. Diciembre 2009. Dictado por el Ing. Carlos Guevara.</p>
            </div>
            <div class="card">
                <img class="imgcards" src="assets/img/conicetiee.png" alt="imagen1">
                <h4>INTRODUCCIÓN AL SISTEMA MATLAB/SIMULINK</h4>
                <p>Instituto de Energía Eléctrica – Facultad de Ingeniería – Universidad Nacional de San Juan. Junio 2009. Dictado por la Dra. Ing. Graciela Colomé.</p>
            </div>
        </div>
        <div class="cards">
            <div class="card">
                <img class="imgcards" src="assets/img/fiunsj.jfif" alt="imagen1">
                <h4>APRENDIENDO MATLAB</h4>
                <p>Avalado por el departamento de Ingeniería de Minas- Facultad de Ingeniería – Universidad Nacional de San Juan.</p>
            </div>
            <div class="card">
                <img class="imgcards" src="assets/img/abb.png" alt="imagen1">
                <h4>T314 – Engineering using System 800xA with AC800M</h4>
                <p>Dictado en Santiago de Chile, por capacitador de ABB University, durante el mes de marzo de 2011.</p>
            </div>
            <div class="card">
                <img class="imgcards" src="assets/img/adexus.png" alt="imagen1">
                <h4>CONOCIMIENTOS BASICOS DE REDES DE DATOS Y DESCRIPCION DE REDES PROYECTO PASCUA-LAMA</h4>
                <p>Dictado en Santiago de Chile por capacitadores de la empresa ADEXUS SA, en Agosto de 2011 con una carga horaria de 40 horas.</p>
            </div>
        </div>
        <div class="cards">
            <div class="card">
                <img class="imgcards" src="assets/img/barrick.jpg" alt="imagen1">
                <h4>HERRAMIENTAS BASICAS DE MEJORA CONTINUA</h4>
                <p>A través de 19 cursos del programa “e-Learning” desarrollado por el Área de Capacitación de BARRICK EXPLORACIONES ARGENTINAS SA con una carga horaria de 25horas.</p>
            </div>
        </div>
        -->
    </section>
</body>

</html>
