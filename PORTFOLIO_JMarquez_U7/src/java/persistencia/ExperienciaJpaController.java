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
import logica.Experiencia;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author juanm
 */
public class ExperienciaJpaController implements Serializable {

    public ExperienciaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public ExperienciaJpaController() {
        emf = Persistence.createEntityManagerFactory("PORTFOLIO_JMarquez_U7_PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Experiencia experiencia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(experiencia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Experiencia experiencia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            experiencia = em.merge(experiencia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = experiencia.getId();
                if (findExperiencia(id) == null) {
                    throw new NonexistentEntityException("The experiencia with id " + id + " no longer exists.");
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
            Experiencia experiencia;
            try {
                experiencia = em.getReference(Experiencia.class, id);
                experiencia.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The experiencia with id " + id + " no longer exists.", enfe);
            }
            em.remove(experiencia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Experiencia> findExperienciaEntities() {
        return findExperienciaEntities(true, -1, -1);
    }

    public List<Experiencia> findExperienciaEntities(int maxResults, int firstResult) {
        return findExperienciaEntities(false, maxResults, firstResult);
    }

    private List<Experiencia> findExperienciaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Experiencia.class));
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

    public Experiencia findExperiencia(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Experiencia.class, id);
        } finally {
            em.close();
        }
    }

    public int getExperienciaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Experiencia> rt = cq.from(Experiencia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
