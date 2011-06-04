package br.com.jonatasdaniel.personalfinance.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Transacao {

	private Integer id;
	private String descricao;
	private BigDecimal valor;
	private Date data;

	public Transacao() {}
	
	public Transacao(String descricao, BigDecimal valor) {
		this(descricao, valor, new Date());
	}
	
	public Transacao(String descricao, BigDecimal valor, Date data) {
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}