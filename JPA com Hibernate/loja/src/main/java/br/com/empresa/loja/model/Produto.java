package br.com.empresa.loja.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private LocalDate dataCadastro = LocalDate.now();
	@ManyToOne
	private Categoria categoria;
	
	public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;		
		this.categoria = categoria;
	}
	
	public Produto() {
		
	}
			
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public String toString() {
		StringBuilder camposFormatados = new StringBuilder();
		camposFormatados.append("Nome: ").append(getNome());
		camposFormatados.append("\nDescrição: ").append(getDescricao());
		camposFormatados.append("\nPreço: R$ ").append(getPreco());
		camposFormatados.append("\nData do cadastro: ").append(dataCadastro.toString());
		camposFormatados.append("\n").append(categoria.toString());
		return camposFormatados.toString();		
	}

}
