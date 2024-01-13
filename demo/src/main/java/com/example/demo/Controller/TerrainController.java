package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.TerrainService;
import com.example.demo.entities.Terrain;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/Terrain")
public class TerrainController {
	
	@Autowired
	TerrainService terrainService;

	
	@PostMapping("/save")
	public <S extends Terrain> S save(@RequestBody S entity) {
		return terrainService.save(entity);
	}

	@GetMapping("/findAll")
	public List<Terrain> findAll() {
		return terrainService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Optional<Terrain> findById(@PathVariable Integer id) {
		return terrainService.findById(id);
	}

	@DeleteMapping("/daleteById/{id}")
	public void deleteById(@PathVariable Integer id) {
		terrainService.deleteById(id);
	}
	
	@GetMapping("/nom/{terrainId}/details")
    public List<Object[]> getNomByTerrainId(@PathVariable int terrainId) {
        return terrainService.getNomByTerrainId(terrainId);
    }
    
    @GetMapping("/type/{terrainId}/details")
    public List<Object[]> getTypeByTerrainId(@PathVariable int terrainId){
    	return terrainService.getTypeByTerrainId(terrainId);
    }
	
	
}
