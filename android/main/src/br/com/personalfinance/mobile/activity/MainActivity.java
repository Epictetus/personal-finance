package br.com.personalfinance.mobile.activity;

import br.com.personalfinance.mobile.R;
import br.com.personalfinance.mobile.infra.ioc.IocContainer;
import br.com.personalfinance.mobile.model.repository.UsuarioRepository;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {

	private UsuarioRepository usuarioRepository;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		
		usuarioRepository = IocContainer.getBean(UsuarioRepository.class);
		if(!usuarioRepository.hasUsuario()) {
			Intent intent = new Intent(this, ConfiguracoesActivity.class);
			startActivity(intent);
			
			finish();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {
		case R.main_menu.contas:

			break;
		case R.main_menu.transacoes:

			break;
		case R.main_menu.configuracoes:

			break;
		case R.main_menu.sobre:

			break;
		case R.main_menu.sair:
			finish();
			break;

		default:
			break;
		}

		return super.onMenuItemSelected(featureId, item);
	}

}
