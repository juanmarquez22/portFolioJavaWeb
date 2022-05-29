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


@WebServlet(name = "SvCurso", urlPatterns = {"/SvCurso"})
public class SvCurso extends HttpServlet {
    
    Controladora control = new Controladora(); 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Curso> listaCursos = control.traerCursos();
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaCursos", listaCursos);
        
        response.sendRedirect("mostrarCurso.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre = request.getParameter("nombre");
        String certificado = request.getParameter("certificado");
        String detalle = request.getParameter("detalle");
        String imagen = request.getParameter("imagen");
        
        Curso curso = new Curso(0,nombre,certificado,detalle,imagen);
        control.crearCurso(curso);
        
        response.sendRedirect("index.jsp");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
