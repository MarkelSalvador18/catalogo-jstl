package org.cuatrovientos; 
import java.io.IOException; 
import java.math.BigDecimal; 
import java.util.List;

import org.cuatrovientos.Cursos.Curso;

import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.HttpServlet; 
import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse; 

@WebServlet("/catalog") 
public class CatalogoServlet extends HttpServlet { 

    @Override 
    protected void doGet( 
            HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException { 
        List<Curso> cursos = List.of(
            new Curso(1, "DAM", 50, 20, 8),
            new Curso(2, "ASIR", 35, 19, 9),
            new Curso(3, "CIF", 100, 20, 10),
            new Curso(4, "SMR", 70, 24, 9),
            new Curso(5, "DAW", 45, 20, 8)
        );
        request.setAttribute("courses", cursos); 
        request.getRequestDispatcher("/WEB-INF/views/catalog.jsp") 
               .forward(request, response); 
    } 
}