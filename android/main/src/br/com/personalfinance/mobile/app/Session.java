package br.com.personalfinance.mobile.app;

import br.com.personalfinance.mobile.model.entity.Usuario;

public final class Session {

	private static Session instance;
	
	private Usuario usuario;
	
	public static Session get() {
		if(instance == null)
			instance = new Session();
		
		return instance;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
}