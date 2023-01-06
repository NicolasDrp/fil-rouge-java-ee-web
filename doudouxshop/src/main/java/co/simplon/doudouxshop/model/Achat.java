package co.simplon.doudouxshop.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "achat")
@Component
@Scope("prototype")
public class Achat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idachat")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idproduit")
    private Produit idproduit;

    @Column(name = "fournisseur")
    private String fournisseur;

    @Column(name = "date")
    private Calendar date;

    @Column(name = "nbrachat")
    private Integer nbrAchat;

}

