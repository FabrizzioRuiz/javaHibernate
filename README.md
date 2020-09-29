# HIBERNATE

EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
EntityManager em = emf.createEntityManager();


listar() -> List<Object>
insertar() -> persist(o)
modificar() -> merge(o)
eliminar() -> remove(em.merge(o))
