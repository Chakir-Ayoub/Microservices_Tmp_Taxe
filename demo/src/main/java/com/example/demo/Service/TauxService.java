package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.TauxRepository;
import com.example.demo.entities.Taux;

@Service
public class TauxService {
	@Autowired
	TauxRepository tauxRepository;

	public <S extends Taux> S save(S entity) {
		return tauxRepository.save(entity);
	}

	public List<Taux> findAll() {
		return tauxRepository.findAll();
	}

	public Optional<Taux> findById(Integer id) {
		return tauxRepository.findById(id);
	}

	public void deleteById(Integer id) {
		tauxRepository.deleteById(id);
	}
	
	
}
