package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Pregrado;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author juanm
 */
public class PregradoJpaController implements Serializable {

    public PregradoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public PregradoJpaController() {
        emf = Persistence.createEntityManagerFactory("PORTFOLIO_JMarquez_U7_PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pregrado pregrado) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pregrado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pregrado pregrado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pregrado = em.merge(pregrado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pregrado.getId();
                if (findPregrado(id) == null) {
                    throw new NonexistentEntityException("The pregrado with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pregrado pregrado;
            try {
                pregrado = em.getReference(Pregrado.class, id);
                pregrado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pregrado with id " + id + " no longer exists.", enfe);
            }
            em.remove(pregrado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pregrado> findPregradoEntities() {
        return findPregradoEntities(true, -1, -1);
    }

    public List<Pregrado> findPregradoEntities(int maxResults, int firstResult) {
        return findPregradoEntities(false, maxResults, firstResult);
    }

    private List<Pregrado> findPregradoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pregrado.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Pregrado findPregrado(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pregrado.class, id);
        } finally {
            em.close();
        }
    }

    public int getPregradoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pregrado> rt = cq.from(Pregrado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
