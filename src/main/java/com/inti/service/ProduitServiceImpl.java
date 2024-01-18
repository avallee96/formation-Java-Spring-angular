package com.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Produit;
import com.inti.repository.IProduitRepository;

@Service
public class ProduitServiceImpl implements IProduitService{

	@Autowired
	IProduitRepository iProduitRepository;
	
	@Override
	public Produit save(Produit p) {
		return iProduitRepository.save(p);
	}

	@Override
	public List<Produit> getAllProduit() {
		return iProduitRepository.findAll();
	}

	@Override
	public void delete(int id) {
		iProduitRepository.deleteById(id);
	}

	@Override
	public boolean update(Produit p) {
		
		if(iProduitRepository.save(p) != null) {
			return true;	
		} else {
			return false;
		}
		
	}

}
