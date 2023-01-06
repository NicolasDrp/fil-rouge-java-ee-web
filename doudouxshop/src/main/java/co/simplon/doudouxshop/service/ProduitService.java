package co.simplon.doudouxshop.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.doudouxshop.model.Produit;

@Service
public class ProduitService {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Transactional
    public List<Produit> getProduits() {
        EntityManager em = entityManagerFactory.createEntityManager();
        String strQuery = "SELECT p FROM Produit p WHERE p.id IS NOT NULL";
        TypedQuery<Produit> tq = em.createQuery(strQuery, Produit.class);
        List<Produit> produit;
        try {
            produit = tq.getResultList();
            if (produit.isEmpty()) {
                throw new NoResultException();
            }
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            em.close();
        }
        return produit;
    }

    
}

