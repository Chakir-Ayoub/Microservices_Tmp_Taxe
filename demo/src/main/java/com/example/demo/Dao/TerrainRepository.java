package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Terrain;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain,Integer>{
// SELECT p.nom,c.type from terrain t inner join proprietaire p on t.proprietaire_id=p.id inner join categorie c on t.categorie_id=c.id; 
	@Query("select p.nom from Terrain t inner join Proprietaire p on t.proprietaire.id=p.id where t.id= :terrainId")
	List<Object[]> getNomByTerrainId(@Param("terrainId") int terrainId);
	
	@Query("select c.type from Terrain t inner join Categorie c on t.categorie.id=c.id where t.id= :terrainId")
	List<Object[]> getTypeByTerrainId(@Param("terrainId") int terrainId);
	
}
