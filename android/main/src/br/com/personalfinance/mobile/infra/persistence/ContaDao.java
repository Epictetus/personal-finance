package br.com.personalfinance.mobile.infra.persistence;

import java.util.List;

import br.com.personalfinance.mobile.model.entity.Conta;
import br.com.personalfinance.mobile.model.repository.ContaRepository;

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