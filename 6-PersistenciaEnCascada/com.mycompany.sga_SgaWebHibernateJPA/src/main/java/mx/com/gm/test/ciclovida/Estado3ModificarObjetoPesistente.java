
package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;


public class Estado3ModificarObjetoPesistente {
     public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
       
        
        //Definimos la variable 
        Contacto contacto = null;
        
        /*=============================================
        OBJETO EN ESTADO TRANSITIVO
        =============================================*/
        
        contacto = em.find(Contacto.class, 3);
        
        contacto.setEmail("clara@mail.com");
        
        /*=============================================
        TRANSACCION
        =============================================*/
        
        em.getTransaction().begin();
        
        //Objeto persistente
        //em.persist(contacto);
        em.merge(contacto);
        em.getTransaction().commit();
        
        /*=====  FIN DE LA TRANSACCION  ======*/
        
        //detached
        System.out.println("contacto = " + contacto);
    }
}
