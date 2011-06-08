package br.com.personalfinance.mobile.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Entrada extends Transacao {

	private Conta destino;

	public Entrada() {}
	
	public Entrada(String descricao, BigDecimal valor, Conta destino, Usuario usuario) {
		this(descricao, valor, destino, usuario, new Date());
	}
	
	public Entrada(String descricao, BigDecimal valor, Conta destino, Usuario usuario, Date data) {
		super(descricao, valor, usuario, data);
		this.destino = destino;
	}
	
	public Conta getDestino() {
		return destino;
	}

	public void setDestino(Conta destino) {
		this.destino = destino;
	}

}