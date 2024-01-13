package com.example.demo.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Integer>{

}
