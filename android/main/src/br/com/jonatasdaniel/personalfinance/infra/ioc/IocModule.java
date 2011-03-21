package br.com.jonatasdaniel.personalfinance.infra.ioc;

import br.com.jonatasdaniel.personalfinance.infra.persistence.UsuarioDao;
import br.com.jonatasdaniel.personalfinance.model.repository.UsuarioRepository;

import com.google.inject.AbstractModule;

public class IocModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(UsuarioRepository.class).to(UsuarioDao.class);
	}

}
