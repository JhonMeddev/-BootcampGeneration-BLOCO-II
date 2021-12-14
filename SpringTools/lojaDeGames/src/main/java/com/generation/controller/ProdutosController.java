package com.generation.controller;

import java.util.List;

import javax.validation.Valid;

import com.generation.model.Produtos;
import com.generation.repository.ProdutosRepository;

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

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produtos>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	// retornar uma Produtos pelo id
    @GetMapping("/{id}")
    public ResponseEntity<Produtos> GetById(@PathVariable long id){
        return repository.findById(id)
                .map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
    }

    // retornar uma Produtos pelo titulo
    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<List<Produtos>> GetByTitulo(@PathVariable String titulo){
        return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
    }
    

    // inserir dados no banco de dados
    @PostMapping
    public ResponseEntity<Produtos> post(@Valid @RequestBody Produtos Produtos)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Produtos));
    }

    // atualizar um dado ja existente no banco de dados
    @PutMapping
    public ResponseEntity<Produtos> put(@Valid @RequestBody Produtos Produtos)
    {
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(Produtos));
    }

    //deletar dados do banco de dados.
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id)
    {
        repository.deleteById(id);
    }
	
}

