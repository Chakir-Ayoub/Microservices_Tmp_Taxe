package com.example.demo.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashSet;

import jakarta.persistence.*;

@Entity
public class Proprietaire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private String prenom;
	private String CIN;
	
	private String password;

	@ManyToMany(fetch = FetchType.LAZY) 
	@JoinTable(name = "proprietaire_roles", 
				joinColumns = @JoinColumn(name = "proprietaire_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id")) 
	private Set<Role> roles = new HashSet<>();
	
	
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId(){return id;}
	public void setId(int id){this.id=id;}
	
	public String getNom(){return nom;}
	public void setNom(String nom){this.nom=nom;}

	public String getPrenom(){return prenom;}
	public void setPrenom(String prenom){this.prenom=prenom;}


	public String getCIN(){return CIN;}
	public void setCIN(String CIN){this.CIN=CIN;}
}
