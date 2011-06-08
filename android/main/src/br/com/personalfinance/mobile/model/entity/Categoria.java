package br.com.personalfinance.mobile.model.entity;

public class Categoria {

	private Integer id;
	private String nome;
	private String descricao;
	private TipoCategoria tipo;

	private Usuario usuario;

	public Categoria() {
	}

	public Categoria(String nome, String descricao, TipoCategoria tipo,
			Usuario usuario) {
		this.nome = nome;
		this.descricao = descricao;
		this.usuario = usuario;
		this.tipo = tipo;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoCategoria getTipo() {
		return tipo;
	}

	public void setTipo(TipoCategoria tipo) {
		this.tipo = tipo;
	}

}