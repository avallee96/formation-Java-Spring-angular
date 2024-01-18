package com.inti.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inti.model.Produit;


public interface IProduitService {
	
	public Produit save(Produit p);
	public List<Produit> getAllProduit();
	public void delete(int id);
	public boolean update(Produit p);

}
