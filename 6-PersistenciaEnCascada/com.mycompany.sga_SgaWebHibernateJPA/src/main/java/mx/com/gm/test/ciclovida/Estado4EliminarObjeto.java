package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado4EliminarObjeto {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
       
        
        //Definimos la variable 
        Contacto contacto = null;
        
        /*=============================================
        OBJETO EN ESTADO TRANSITIVO
        =============================================*/
        
        contacto = em.find(Contacto.class, 3);
                
        /*=============================================
        TRANSACCION
        =============================================*/
        
        em.getTransaction().begin();
        //Objeto persistente
        em.remove(em.merge(contacto));
        
        em.getTransaction().commit();
        
        /*=====  FIN DE LA TRANSACCION  ======*/
        
        /*=============================================
        EL OBJETO PASA A ESTADO TRANSITIVO (solo en 
        memoria y no en la base de datos)
        =============================================*/
        System.out.println("contacto = " + contacto);
    }
}
