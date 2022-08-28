package model;

import java.util.Date;

public class Empresa {
	
	private int id;
	private String nome;
	private String cnpj;
	private Date dataAbertura;
	
	public Empresa(int id, String nome, String cnpj, Date dataAbertura) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.dataAbertura = dataAbertura;
	}
	
	public Empresa() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;		
	}
	
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;		
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Id: " + getId() +
			   "\nNome: " + getNome() +
			   "\nCNPJ: " + getCnpj() + 
			   "\nData de Abertura: " + getDataAbertura() + "\n";		
	}	
}
