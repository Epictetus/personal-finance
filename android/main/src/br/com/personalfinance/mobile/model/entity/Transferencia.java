package br.com.jonatasdaniel.personalfinance.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Transferencia extends Transacao {

	private Conta origem;
	private Conta destino;

	public Transferencia() {
	}

	public Transferencia(String descricao, BigDecimal valor, Conta origem, Conta destino) {
		this(descricao, valor, origem, destino, new Date());
	}

	public Transferencia(String descricao, BigDecimal valor, Conta origem, Conta destino, Date data) {
		super(descricao, valor, data);
		this.origem = origem;
		this.destino = destino;
	}

	public Conta getOrigem() {
		return origem;
	}

	public void setOrigem(Conta origem) {
		this.origem = origem;
	}

	public Conta getDestino() {
		return destino;
	}

	public void setDestino(Conta destino) {
		this.destino = destino;
	}

}