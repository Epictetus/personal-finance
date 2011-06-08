package br.com.personalfinance.mobile.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import br.com.personalfinance.mobile.R;
import br.com.personalfinance.mobile.infra.ioc.IocContainer;
import br.com.personalfinance.mobile.model.entity.Usuario;
import br.com.personalfinance.mobile.model.repository.UsuarioRepository;

public class ConfiguracoesActivity extends Activity {

	private EditText edtUsuario;
	private EditText edtSenha;
	private CheckBox ckValidarWeb;
	
	private UsuarioRepository repository;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.configuracoes);
		
		repository = IocContainer.getBean(UsuarioRepository.class);
		
		init();
	}
	
	private void init() {
		edtUsuario = (EditText) findViewById(R.configuracoes.usuario);
		edtSenha = (EditText) findViewById(R.configuracoes.senha);
		ckValidarWeb = (CheckBox) findViewById(R.configuracoes.validar_web);
	}
	
	public void btnSalvarClick(View view) {
		String usuario = edtUsuario.getText().toString();
		String senha = edtSenha.getText().toString();
		if(usuario.trim().length() == 0) {
			Toast.makeText(this, getString(R.string.configuracoes_usuario_invalido), 2500).show();
		} else if(senha.trim().length() == 0) {
			Toast.makeText(this, getString(R.string.configuracoes_senha_invalida), 2500).show();
		} else {
			Usuario user = repository.findByLogin(usuario);
			if(user == null || !user.getSenha().equals(senha)) {
				Toast.makeText(this, getString(R.string.configuracoes_usuario_invalido), 2500).show();
			} else {
				Intent intent = new Intent(this, MainActivity.class);
				startActivity(intent);
				finish();
			}
		}
	}
	
	public void btnCancelarClick(View view) {
		finish();
	}
	
}
