package br.com.personalfinance.mobile.model.repository;

import br.com.personalfinance.mobile.model.entity.Usuario;


public interface UsuarioRepository {

	Usuario findByLogin(String login);
	
}