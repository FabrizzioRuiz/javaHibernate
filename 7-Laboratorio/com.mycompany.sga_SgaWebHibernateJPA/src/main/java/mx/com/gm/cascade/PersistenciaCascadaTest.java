package mx.com.gm.cascade;

import javax.persistence.*;
import javax.persistence.Persistence;
import mx.com.gm.domain.Alumno;
import mx.com.gm.domain.Contacto;
import mx.com.gm.domain.Domicilio;

public class PersistenciaCascadaTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        Domicilio d = new Domicilio();
        d.setCalle("Manzanares");
        d.setNumCalle("1");
        d.setPais("España");
        
        Contacto c = new Contacto();
        c.setEmail("clara@mail.com");
        c.setTelefono("744232");
        
        Alumno a = new Alumno();
        a.setNombre("Carlos");
        a.setApellido("Lara");
        a.setDomicilio(d);
        a.setContacto(c);
        
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        
        System.out.println("alumno = " + a);
        
    }
}
