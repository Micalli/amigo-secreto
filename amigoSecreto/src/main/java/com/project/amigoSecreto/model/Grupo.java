package com.project.amigoSecreto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_grupo")

public class Grupo {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPessoa;
	
	@NotNull
	private String nome;
	
	@NotNull 
	private String email;
	
	private String pessoaSorteada;

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPessoaSorteada() {
		return pessoaSorteada;
	}

	public void setPessoaSorteada(String pessoaSorteada) {
		this.pessoaSorteada = pessoaSorteada;
	}
	
	
}
