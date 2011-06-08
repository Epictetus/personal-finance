package br.com.personalfinance.mobile.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Saida extends Transacao {

	private Conta origem;

	public Saida() {
	}

	public Saida(String descricao, BigDecimal valor, Conta origem, Usuario usuario) {
		this(descricao, valor, origem, usuario, new Date());
	}

	public Saida(String descricao, BigDecimal valor, Conta origem, Usuario usuario, Date data) {
		super(descricao, valor, usuario, data);
		this.origem = origem;
	}

	public Conta getOrigem() {
		return origem;
	}

	public void setOrigem(Conta origem) {
		this.origem = origem;
	}

}