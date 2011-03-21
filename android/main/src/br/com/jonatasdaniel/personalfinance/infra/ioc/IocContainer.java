package br.com.jonatasdaniel.personalfinance.infra.ioc;

import com.google.inject.Guice;
import com.google.inject.Injector;

public final class IocContainer {
	
	private static Injector injector;
	
	private IocContainer() {}
	
	public final static <T> T getBean(Class<T> beanClass) {
		if(injector == null)
			injector = Guice.createInjector(new IocModule());
		
		return injector.getInstance(beanClass);
	}

}