package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.TaxeTnb;

@Repository
public interface TaxeTnbRepository extends JpaRepository<TaxeTnb,Integer>{

}
