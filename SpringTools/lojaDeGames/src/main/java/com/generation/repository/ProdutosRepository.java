package com.generation.repository;

import java.util.List;

import com.generation.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	
@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
		
		public List<Produtos> findAllByTituloContainingIgnoreCase (String titulo);
}
