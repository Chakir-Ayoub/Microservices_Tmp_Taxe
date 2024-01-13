package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Taux;

@Repository
public interface TauxRepository extends JpaRepository<Taux,Integer>{

}
