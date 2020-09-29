package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;


public class Estado2RecuperarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        /**
         * NO ES NECESARIO INICIAR UNA TRANSACCION PARA RECUPERAR NUESTRO OBJETO
         * PERO SI LO INICIAMOS NO PASA NADA. PERO ESTARIA EN ESTADO PERSISTENTE
         * ASIQUE CUALQUIER MODIFICACION QUE HARIAMOS SE GUARDARIA EN LA BASE DE DATOS.
         * 
         */
        //Definimos la variable 
        Contacto contacto = null;
        
        //Recuperamos el objeto
        contacto = em.find(Contacto.class, 3);
        
        //detached
        System.out.println("contacto = " + contacto);
    }
}
