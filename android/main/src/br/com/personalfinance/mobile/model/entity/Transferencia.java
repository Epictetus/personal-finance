package br.com.personalfinance.mobile.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Transferencia extends Transacao {

	private Conta origem;
	private Conta destino;

	public Transferencia() {
	}

	public Transferencia(String descricao, BigDecimal valor, Conta origem, Conta destino, Usuario usuario) {
		this(descricao, valor, origem, destino, usuario, new Date());
	}

	public Transferencia(String descricao, BigDecimal valor, Conta origem, Conta destino, Usuario usuario, Date data) {
		super(descricao, valor, usuario, data);
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