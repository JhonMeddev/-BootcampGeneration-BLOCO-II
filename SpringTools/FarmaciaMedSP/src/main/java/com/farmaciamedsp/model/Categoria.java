package com.farmaciamedsp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")

	public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Este campo não pode permanecer em branco ")
	private String descricao;
	
	@NotBlank(message = "Este campo não pode permanecer em branco ")
	private String faixaEtaria;
	
	private boolean medicamentoControlado;
	
	@NotBlank(message = "Este campo não pode permanecer em branco ")
	private String tipoProduto;

	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Produto produto;
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public boolean isMedicamentoControlado() {
		return medicamentoControlado;
	}

	public void setMedicamentoControlado(boolean medicamentoControlado) {
		this.medicamentoControlado = medicamentoControlado;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
			
}
