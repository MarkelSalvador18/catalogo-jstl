package org.cuatrovientos; 
import java.io.IOException; 
import java.math.BigDecimal; 
import java.util.List; 
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
        List<Product> products = List.of(
            new Product(1, "Teclado", new BigDecimal("50,00")),
            new Product(2, "Raton", new BigDecimal("30,00")),
            new Product(3, "Monitor", new BigDecimal("120,00"))
        );
        request.setAttribute("products", products); 
        request.getRequestDispatcher("/WEB-INF/views/catalog.jsp") 
               .forward(request, response); 
    } 
}