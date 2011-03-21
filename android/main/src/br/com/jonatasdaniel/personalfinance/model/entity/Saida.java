package br.com.jonatasdaniel.personalfinance.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Saida extends Transacao {

	private Conta origem;

	public Saida() {
	}

	public Saida(String descricao, BigDecimal valor, Conta origem) {
		this(descricao, valor, origem, new Date());
	}

	public Saida(String descricao, BigDecimal valor, Conta origem, Date data) {
		super(descricao, valor, data);
		this.origem = origem;
	}

	public Conta getOrigem() {
		return origem;
	}

	public void setOrigem(Conta origem) {
		this.origem = origem;
	}

}