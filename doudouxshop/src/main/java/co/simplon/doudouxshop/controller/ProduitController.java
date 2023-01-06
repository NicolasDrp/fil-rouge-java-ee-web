package co.simplon.doudouxshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.simplon.doudouxshop.model.Produit;
import co.simplon.doudouxshop.service.ProduitService;

@Controller
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/products")
    public String getProductList(Model model) {
        List<Produit> produitList = produitService.getProduits();
        model.addAttribute("products", produitList);
        return "products";
    }

}
 
