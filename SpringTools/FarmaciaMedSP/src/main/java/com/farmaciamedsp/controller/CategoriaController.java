package com.farmaciamedsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.farmaciamedsp.model.Categoria;
import com.farmaciamedsp.repository.CategoriaRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping ("/categoria")

public class CategoriaController {
	
	@Autowired
	private CategoriaRepository catRepository;
	
@GetMapping
	
	public ResponseEntity<List<Categoria>> getAll(){
		return ResponseEntity.ok(catRepository.findAll());
					
	}
	
	@GetMapping("/{id}")
	
	public ResponseEntity<Categoria> getById(@PathVariable long id){
		return catRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
		
	}		
		
	@GetMapping("/descricao/{descricao}")
		
	public ResponseEntity<List<Categoria>> getByName(@PathVariable String descricao){
		return ResponseEntity.ok(catRepository.findAllByDescricaoContainingIgnoreCase(descricao));
					
	}
	
	@PostMapping
	
	public ResponseEntity<Categoria> post (@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(catRepository.save(categoria));
				
	}
	
	@PutMapping
	
	public ResponseEntity<Categoria> put (@RequestBody Categoria categoria){
		return ResponseEntity.ok(catRepository.save(categoria));
		
	}
	
	@DeleteMapping("/{id}")
	
	public void delete(@PathVariable long id){
		catRepository.deleteById(id);
	}
		
}