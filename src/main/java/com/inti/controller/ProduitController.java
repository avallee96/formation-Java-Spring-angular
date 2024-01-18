package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inti.model.Produit;
import com.inti.service.IProduitService;

@Controller
@RequestMapping("produit")
public class ProduitController {
	
	@Autowired
	IProduitService iProduitService;
	
	@GetMapping("formulaireProduit")
	public String getFormulaireProduit() {
		
		return "formulaireProduit";
	}
	
	@PostMapping("saveProduit")
	public String saveProduit(@ModelAttribute("produit") Produit produit) {
		iProduitService.save(produit);
		
		return "formulaireProduit";
	}
	
	@GetMapping("affichage")
	public String affichageNomProduit(@RequestParam(value="nom" ) String nom, Model n) {
		
		n.addAttribute("name", nom);
		
		return "affichage";
	}

}
