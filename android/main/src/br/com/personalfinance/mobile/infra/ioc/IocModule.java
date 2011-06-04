package br.com.personalfinance.mobile.infra.ioc;

import br.com.personalfinance.mobile.infra.persistence.UsuarioDao;
import br.com.personalfinance.mobile.model.repository.UsuarioRepository;

import com.google.inject.AbstractModule;

public class IocModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(UsuarioRepository.class).to(UsuarioDao.class);
	}

}
