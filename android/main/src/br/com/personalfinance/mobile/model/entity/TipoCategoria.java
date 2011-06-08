package br.com.personalfinance.mobile.model.entity;

public enum TipoCategoria {

	Todos("Todos"), Entrada("Entrada"), Saida("Saída"), Transferencia("Transferência");
	
	private String descricao;
	
	TipoCategoria(String descricao) {
		this.descricao = descricao;;
	}

	public String getDescricao() {
		return descricao;
	}
	
}