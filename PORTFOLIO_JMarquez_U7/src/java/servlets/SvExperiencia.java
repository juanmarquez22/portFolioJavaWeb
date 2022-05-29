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
import logica.Experiencia;


@WebServlet(name = "SvExperiencia", urlPatterns = {"/SvExperiencia"})
public class SvExperiencia extends HttpServlet {
    
    Controladora control = new Controladora(); 
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Experiencia> listaExperiencias = control.traerExper();
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaExperiencias", listaExperiencias);
        
        response.sendRedirect("mostrarExperiencia.jsp");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String  empresa = request.getParameter("empresa");        
        String periodo = request.getParameter("periodo");
        String descripcion = request.getParameter("descripcion");
        String imagen = request.getParameter("imagen");
        
        Experiencia exper = new Experiencia(0, empresa, periodo, descripcion, imagen);
        control.crearExper(exper);
        
        response.sendRedirect("index.jsp");
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
