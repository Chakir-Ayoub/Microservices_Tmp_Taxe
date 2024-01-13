package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Proprietaire;

@Repository
public interface ProprietaireRepository extends JpaRepository<Proprietaire,Integer>{
	
	public Proprietaire findByCIN(String CIN);
	Boolean existsByCIN(String CIN);
}
