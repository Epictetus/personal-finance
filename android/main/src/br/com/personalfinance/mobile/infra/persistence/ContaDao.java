package br.com.jonatasdaniel.personalfinance.infra.persistence;

import java.util.List;

import br.com.jonatasdaniel.personalfinance.model.entity.Conta;
import br.com.jonatasdaniel.personalfinance.model.repository.ContaRepository;

public class ContaDao extends Dao<Conta, Integer> implements ContaRepository {

	@Override
	public void add(Conta entity) {
		
	}

	@Override
	public void remove(Conta entity) {
		
	}

	@Override
	public void refresh(Conta entity) {
		
	}

	@Override
	public Conta get(Object pk) {
		return null;
	}

	@Override
	public List<Conta> list() {
		return null;
	}

}