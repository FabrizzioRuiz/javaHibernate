package mx.com.gm.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.ServicioPersonas;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ServicioPersonas srvPersonas = new ServicioPersonas();
        List<Persona> personas = srvPersonas.listarPersonas();
        //"personas" asi es como lo vamos a recuperar desde el jsp
        request.setAttribute("personas", personas);
        //Direccionamos al jsp que queramos seleccionar
        request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request, response);
    }
}
