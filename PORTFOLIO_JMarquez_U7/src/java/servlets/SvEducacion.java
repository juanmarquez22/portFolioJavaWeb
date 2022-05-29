/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Curso;
import logica.Estudio;
import logica.Experiencia;
import logica.Grado;
import logica.Idioma;
import logica.Pregrado;


@WebServlet(name = "SvEducacion", urlPatterns = {"/SvEducacion"})
public class SvEducacion extends HttpServlet {
    
    Controladora control = new Controladora(); 

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Idioma> listaIdiomas = control.traerIdiomas();
        List<Estudio> listaEstudios = control.traerEstudios();
        //List<Pregrado> listaPregrados = control.traerPregrados();
        List<Experiencia> listaExper = control.traerExper();
        List<Curso> listaCursos = control.traerCursos();
             
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaIdiomas", listaIdiomas);
        miSesion.setAttribute("listaEstudios", listaEstudios);
        miSesion.setAttribute("listaExper", listaExper);
        //miSesion.setAttribute("listaPregrados", listaPregrados);
        miSesion.setAttribute("listaCursos", listaCursos);
        
        response.sendRedirect("mostrarEducacion.jsp");
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
