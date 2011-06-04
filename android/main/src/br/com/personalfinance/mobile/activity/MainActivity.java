package br.com.personalfinance.mobile.activity;

import br.com.personalfinance.mobile.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
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
