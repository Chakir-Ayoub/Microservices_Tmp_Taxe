package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Terrain {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int mc;

	@ManyToOne
	private Proprietaire proprietaire;

	@ManyToOne
	private Categorie categorie;

	public int getId(){return id;}
	public void setId(int id){this.id=id;}

	public int getMc(){return mc;}
	public void setMc(int mc){this.mc=mc;}

	public Proprietaire getProprietaire(){return proprietaire;}
	public void setProprietaire(Proprietaire proprietaire){this.proprietaire=proprietaire;}
	
	public Categorie getCategorie(){return categorie;}
	public void setCategorie(Categorie categorie){this.categorie=categorie;}

}
