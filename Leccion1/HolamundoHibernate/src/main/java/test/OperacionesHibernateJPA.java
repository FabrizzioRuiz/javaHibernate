
package test;

import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;


public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDao personadao = new PersonaDao();
        personadao.listar();
        
//        Persona p = new Persona();
//        p.setNombre("Carlos");
//        p.setApellido("Lara");
//        p.setEmail("clara@mail.com");
//        p.setTelefono("12234");
//
//        personadao.insertar(p);
        
    }
}
