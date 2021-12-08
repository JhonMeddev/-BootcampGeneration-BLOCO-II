package com.farmaciamedsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmaciamedsp.model.Produto;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByDescricaoContainingIgnoreCase (String descricao);
}
