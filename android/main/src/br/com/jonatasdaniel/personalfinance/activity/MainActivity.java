package br.com.jonatasdaniel.personalfinance.activity;

import br.com.jonatasdaniel.personalfinance.R;
import br.com.jonatasdaniel.personalfinance.model.entity.Usuario;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;


public class MainActivity extends Activity {

	private ListView list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Intent it = getIntent();
		Bundle bundle = it.getExtras();
		Usuario user = (Usuario) bundle.getSerializable("usuario");
		
		setTitle(getString(R.string.main_bem_vindo).concat(" ").concat(user.getNome()));
		
		init();
	}
	
	private void init() {
		list = (ListView) findViewById(R.main.list);
	}
	
}
