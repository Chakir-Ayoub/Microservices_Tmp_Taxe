package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CategorieService;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Proprietaire;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/Categorie")
public class CategorieController {
	
	@Autowired
	CategorieService categorieService;

	@PostMapping("/save")
	public <S extends Categorie> S save(@RequestBody S entity) {
		return categorieService.save(entity);
	}

	@GetMapping("/findAll")
	public List<Categorie> findAll() {
		return categorieService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Optional<Categorie> findById(@PathVariable Integer id) {
		return categorieService.findById(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		categorieService.deleteById(id);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Categorie> update(@PathVariable int id, @RequestBody Categorie categorie){
		return categorieService.updateCategorie(id, categorie);
	}
	
	
}
