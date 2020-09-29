package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

public class PersonaDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDao() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public void listar() {
        String hpl = "SELECT u FROM Persona u";
        Query query = em.createQuery(hpl);
        List<Persona> personas = query.getResultList();
        for(Persona p : personas) {
            System.out.println("p = " + p);
        }
    }

    //Glassfish se encarga de crear la transaccion y de cerrar de forma automatica
    //Como estamos en local necesitamos abrir y cerrar una transaccion
    public void insertar(Persona p) {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        }

    }

}
