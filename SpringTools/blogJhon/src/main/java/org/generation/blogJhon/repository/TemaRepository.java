package org.generation.blogJhon.repository;

import java.util.List;

import org.generation.blogJhon.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase (String descricao);

}
