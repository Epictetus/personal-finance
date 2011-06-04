package br.com.jonatasdaniel.personalfinance.model.repository;

import br.com.jonatasdaniel.personalfinance.model.entity.Transacao;

public interface TransacaoRepository<T extends Transacao> extends BaseRepository<T> {
	
}