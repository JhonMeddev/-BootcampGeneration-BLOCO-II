package org.generation.blogJhon.controller;

import java.util.List;

import javax.validation.Valid;

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
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll() {
		return ResponseEntity.ok(postagemRepository.findAll());
	}
	
	// retornar uma postagem pelo id
    @GetMapping("/{id}")
	public ResponseEntity<Postagem> getById(@PathVariable long id) {
		return postagemRepository.findById(id)
			.map(respostaPostagem -> ResponseEntity.ok(respostaPostagem))
			.orElse(ResponseEntity.notFound().build());
	}

    // retornar uma postagem pelo titulo
    @GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(postagemRepository.findAllByTituloContainingIgnoreCase(titulo));
	}
    

    // inserir dados no banco de dados
    @PostMapping
	public ResponseEntity<Postagem> postPostagem(@Valid @RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(postagemRepository.save(postagem));
	}

    // atualizar um dado ja existente no banco de dados
    @PutMapping
	public ResponseEntity<Postagem> putPostagem(@Valid @RequestBody Postagem postagem){

		return postagemRepository.findById(postagem.getId())
			.map(resposta -> ResponseEntity.ok().body(postagemRepository.save(postagem)))
			.orElse(ResponseEntity.notFound().build());
			
	}
	

    //deletar dados do banco de dados.
    @DeleteMapping("/{id}")
	public ResponseEntity<?> deletePostagem(@PathVariable long id) {
		
		return postagemRepository.findById(id)
			.map(resposta -> {
				postagemRepository.deleteById(id);
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			})
			.orElse(ResponseEntity.notFound().build());
	}
	
}
