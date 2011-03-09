package br.com.jonatasdaniel.personalfinance.infra.persistence;

import br.com.jonatasdaniel.personalfinance.model.entity.Usuario;
import br.com.jonatasdaniel.personalfinance.model.repository.UsuarioRepository;


public class UsuarioDao extends Dao<Usuario, Integer> implements UsuarioRepository {

	@Override
	public Usuario findByLogin(String login) {
		return null;
	}

}