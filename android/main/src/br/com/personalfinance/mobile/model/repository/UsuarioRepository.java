package br.com.jonatasdaniel.personalfinance.model.repository;

import br.com.jonatasdaniel.personalfinance.model.entity.Usuario;


public interface UsuarioRepository {

	Usuario findByLogin(String login);
	
}