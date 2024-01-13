package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.TaxeTnbRepository;
import com.example.demo.entities.TaxeTnb;

@Service
public class TaxeTnbService {
	@Autowired
	TaxeTnbRepository taxetnbRepository;

	public <S extends TaxeTnb> S save(S entity) {
		return taxetnbRepository.save(entity);
	}

	public List<TaxeTnb> findAll() {
		return taxetnbRepository.findAll();
	}

	public Optional<TaxeTnb> findById(Integer id) {
		return taxetnbRepository.findById(id);
	}

	public void deleteById(Integer id) {
		taxetnbRepository.deleteById(id);
	}
	
	
}
