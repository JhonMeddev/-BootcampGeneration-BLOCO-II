package org.generation.blogJhon.controller;

import java.util.List;

import org.generation.blogJhon.model.Postagem;
import org.generation.blogJhon.repository.PostagemRepository;
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
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	// retornar uma postagem pelo id
    @GetMapping("/{id}")
    public ResponseEntity<Postagem> GetById(@PathVariable long id){
        return repository.findById(id)
                .map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
    }

    // retornar uma postagem pelo titulo
    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
        return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
    }
    

    // inserir dados no banco de dados
    @PostMapping
    public ResponseEntity<Postagem> post(@RequestBody Postagem postagem)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
    }

    // atualizar um dado ja existente no banco de dados
    @PutMapping
    public ResponseEntity<Postagem> put(@RequestBody Postagem postagem)
    {
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
    }

    //deletar dados do banco de dados.
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id)
    {
        repository.deleteById(id);
    }
	
}
