/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import logica.Estudio;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author juanm
 */
public class EstudioJpaController implements Serializable {

    public EstudioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public EstudioJpaController() {
        emf = Persistence.createEntityManagerFactory("PORTFOLIO_JMarquez_U7_PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Estudio estudio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(estudio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Estudio estudio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            estudio = em.merge(estudio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = estudio.getId();
                if (findEstudio(id) == null) {
                    throw new NonexistentEntityException("The estudio with id " + id + " no longer exists.");
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
            Estudio estudio;
            try {
                estudio = em.getReference(Estudio.class, id);
                estudio.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The estudio with id " + id + " no longer exists.", enfe);
            }
            em.remove(estudio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Estudio> findEstudioEntities() {
        return findEstudioEntities(true, -1, -1);
    }

    public List<Estudio> findEstudioEntities(int maxResults, int firstResult) {
        return findEstudioEntities(false, maxResults, firstResult);
    }

    private List<Estudio> findEstudioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Estudio.class));
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

    public Estudio findEstudio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Estudio.class, id);
        } finally {
            em.close();
        }
    }

    public int getEstudioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Estudio> rt = cq.from(Estudio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
