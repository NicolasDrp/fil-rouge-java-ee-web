package co.simplon.doudouxshop.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.doudouxshop.model.Produit;

@Repository
public interface ProduitDAO extends JpaRepository<Produit, Long> {

}

