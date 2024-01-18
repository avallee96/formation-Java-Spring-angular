package com.inti.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * @author antoine vallée
 * 
 *	Classe produit pour lister des produits de notre bdd
 */

@Entity
@Table(name = "product")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "mark", length = 50)
	private String marque;
	
	private double prix;

	public Produit(int id, String marque, double prix) {
		super();
		this.id = id;
		this.marque = marque;
		this.prix = prix;
	}

	public Produit(String marque, double prix) {
		super();
		this.marque = marque;
		this.prix = prix;
	}

	public Produit() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", marque=" + marque + ", prix=" + prix + "]";
	}
	
	

}
