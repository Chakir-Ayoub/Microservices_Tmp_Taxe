package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class TaxeTnb {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String label;
	private String description;
	private int tnbyear;
	private Double montantbase;
	@ManyToOne
	private Terrain terrain;
	@ManyToOne
	private Proprietaire proprietaire;
	@ManyToOne
	private Categorie categorie;
	@ManyToOne
	private Taux taux;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTnbyear() {
		return tnbyear;
	}
	public void setTnbyear(int tnbyear) {
		this.tnbyear = tnbyear;
	}
	public Double getMontantbase() {
		return montantbase;
	}
	public void setMontantbase(Double montantbase) {
		this.montantbase = montantbase;
	}
	public Terrain getTerrain() {
		return terrain;
	}
	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}
	public Proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Taux getTaux() {
		return taux;
	}
	public void setTaux(Taux taux) {
		this.taux = taux;
	}
	
	
}
