package com.duarte.basededados.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionarios {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	@Column(name="Nome" , nullable=false)
	private String nome;
	
	@Column(name="Data de Nascimeto", nullable=false)
	private String dataDeNascimento;
	
	@Column(name="NIF", nullable=false)
	private String nif;
	
	@Column(name="Telefone", nullable=false)
	private String telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
