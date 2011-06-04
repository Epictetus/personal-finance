package br.com.jonatasdaniel.personalfinance.model.entity;


import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {

	private static final long	serialVersionUID	= 1L;
	
	private Integer	id;
	private String	nome;
	private String	login;
	private String	senha;
	private Date	dataCadastro;
	
	public Usuario() {}
	
	public Usuario(String nome, String login, String senha) {
		this(nome, login, senha, new Date());
	}
	
	public Usuario(String nome, String login, String senha, Date dataCadastro) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.dataCadastro = dataCadastro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}