
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.Estudio;
import logica.Grado;


@WebServlet(name = "SvGrado", urlPatterns = {"/SvGrado"})
public class SvGrado extends HttpServlet {

    Controladora control = new Controladora(); 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String titulo = request.getParameter("titulo");
        String carrera = request.getParameter("carrera");
        String institucion = request.getParameter("institucion");
        String imagen = request.getParameter("imagen");
        String ingreso = request.getParameter("ingreso");
        String egreso = request.getParameter("egreso");
        
        Estudio grado = new Grado(carrera, 0, titulo, institucion, imagen, ingreso, egreso);
        control.crearEstudio(grado);
        
        response.sendRedirect("index.jsp");
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
