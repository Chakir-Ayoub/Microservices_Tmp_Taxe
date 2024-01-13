package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.TauxService;
import com.example.demo.entities.Taux;

@RestController
@RequestMapping("/Taux")
public class TauxController {
	
	@Autowired
	TauxService tauxService;

	@PostMapping("/save")
	public <S extends Taux> S save(@RequestBody S entity) {
		return tauxService.save(entity);
	}
	
	@GetMapping("/findAll")
	public List<Taux> findAll() {
		return tauxService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Optional<Taux> findById(@PathVariable Integer id) {
		return tauxService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		tauxService.deleteById(id);
	}
	
	
}
