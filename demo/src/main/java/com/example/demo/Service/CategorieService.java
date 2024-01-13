package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.CategorieRepository;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Proprietaire;

@Service
public class CategorieService {

	@Autowired
	CategorieRepository categorieRepository;

	public <S extends Categorie> S save(S entity) {
		return categorieRepository.save(entity);
	}

	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

	public Optional<Categorie> findById(Integer id) {
		return categorieRepository.findById(id);
	}

	public void deleteById(Integer id) {
		categorieRepository.deleteById(id);
	}
	
	public ResponseEntity<Categorie> updateCategorie(int id, Categorie categorie) {
	    Optional<Categorie> optionalCategorie = categorieRepository.findById(id);

	    if (optionalCategorie.isPresent()) {
	        Categorie existingCategorie = optionalCategorie.get();
	        existingCategorie.setType(categorie.getType());

	        Categorie updatedCategorie = categorieRepository.save(existingCategorie);
	        return ResponseEntity.ok(updatedCategorie);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	
}
