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

import com.example.demo.Service.TaxeTnbService;
import com.example.demo.entities.TaxeTnb;

@RestController
@RequestMapping("/TaxeTnb")
public class TaxeTnbController {
	@Autowired
	TaxeTnbService taxetnbService;

	@PostMapping("/save")
	public <S extends TaxeTnb> S save(@RequestBody S entity) {
		return taxetnbService.save(entity);
	}

	@GetMapping("/findAll")
	public List<TaxeTnb> findAll() {
		return taxetnbService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Optional<TaxeTnb> findById(@PathVariable Integer id) {
		return taxetnbService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		taxetnbService.deleteById(id);
	}
	
	
}
