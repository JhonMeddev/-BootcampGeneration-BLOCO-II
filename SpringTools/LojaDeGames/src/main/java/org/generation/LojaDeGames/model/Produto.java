package org.generation.LojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotBlank
		@Size(min = 1, max = 100, message = "O nome deve ter no mínimo 1 carácter e no máximo 100.")
		private String nome;
		
		@NotNull
		private Double preco;

		@NotNull
		private boolean estoque;
		
		@NotNull
		private boolean multiplayer;

		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}

		public boolean isEstoque() {
			return estoque;
		}

		public void setEstoque(boolean estoque) {
			this.estoque = estoque;
		}

		public boolean isMultiplayer() {
			return multiplayer;
		}

		public void setMultiplayer(boolean multiplayer) {
			this.multiplayer = multiplayer;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
	}

