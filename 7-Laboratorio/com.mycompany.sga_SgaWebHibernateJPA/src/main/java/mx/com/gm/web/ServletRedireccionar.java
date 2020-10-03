package mx.com.gm.web;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletRedireccionar")
public class ServletRedireccionar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resopnse) {
        try {
            request.getRequestDispatcher("/WEB-INF/agregarAlumno.jsp").forward(request, resopnse);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);

        }
    }
}
