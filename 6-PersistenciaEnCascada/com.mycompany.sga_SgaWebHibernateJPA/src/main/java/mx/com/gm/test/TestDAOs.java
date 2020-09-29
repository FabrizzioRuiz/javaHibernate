
package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.dao.AsignacionDAO;

public class TestDAOs {
    public static void main(String[] args) {
        
        AlumnoDAO alumnoDao = new AlumnoDAO();
        System.out.println("Alumnos: ");
        imprimir(alumnoDao.listar());
//        
//        System.out.println("Contacto");
//        ContactoDAO contactoDao = new ContactoDAO();
//        imprimir(contactoDao.listar());
//        
        System.out.println("Asignaciones");
        AsignacionDAO asignacionDao = new AsignacionDAO();
        imprimir(asignacionDao.listar());
        
    }
    
    private static void imprimir(List coleccion){
        for(Object o: coleccion){
            System.out.println("valor = " + o);
        }
    }
}
