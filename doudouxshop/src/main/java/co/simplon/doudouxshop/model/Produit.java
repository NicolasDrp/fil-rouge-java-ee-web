package co.simplon.doudouxshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "produit")
@Component
@Scope("prototype")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproduit", unique = true)
    private int idproduit;

    @Column(name = "nomproduit", length = 30, nullable = false)
    private String nom;

    @Column(name = "prix", nullable = false)
    private double prix;

    @Column(name = "quantite", nullable = false)
    private int quantite;

    
    
    
    
    
    
    
    
    
    
    
	/**
	 * @return the idproduit
	 */
	public int getIdproduit() {
		return idproduit;
	}

	/**
	 * @param idproduit the idproduit to set
	 */
	public void setIdproduit(int idproduit) {
		this.idproduit = idproduit;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

    
}
