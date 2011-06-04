package br.com.jonatasdaniel.personalfinance.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Entrada extends Transacao {

	private Conta destino;

	public Entrada() {}
	
	public Entrada(String descricao, BigDecimal valor, Conta destino) {
		this(descricao, valor, destino, new Date());
	}
	
	public Entrada(String descricao, BigDecimal valor, Conta destino, Date data) {
		super(descricao, valor, data);
		this.destino = destino;
	}
	
	public Conta getDestino() {
		return destino;
	}

	public void setDestino(Conta destino) {
		this.destino = destino;
	}

}