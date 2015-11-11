package com.idomine.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.idomine.model.enums.UsuarioSituacao;


@Entity
@Table(name="tab_usuario")
public class Usuario {

	@Id
	@GeneratedValue	
	private long id;
	
	@NotNull
	@Size(min=3,max=100)
	@Column(length=100)
	private String nome;
	
	@Size(min=3,max=20)
	@Column(length=20)
	private String login;
	
	@JsonIgnore
	@Size(min=3,max=20)
	@Column(length=20)
	private String senha;
	
	private UsuarioSituacao situacao;

	@Email
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Date nascimento;

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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public UsuarioSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(UsuarioSituacao situacao) {
		this.situacao = situacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Usuario(long id, String nome, String login, String senha, UsuarioSituacao 
			situacao, String email,	Date nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.situacao = situacao;
		this.email = email;
		this.nascimento = nascimento;
	}
	
	public Usuario(){
		
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", situacao="
				+ situacao + ", email=" + email + ", nascimento=" + nascimento + "]";
	}


	
}
