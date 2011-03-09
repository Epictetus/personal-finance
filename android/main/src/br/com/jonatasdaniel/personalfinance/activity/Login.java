package br.com.jonatasdaniel.personalfinance.activity;

import br.com.jonatasdaniel.personalfinance.R;
import br.com.jonatasdaniel.personalfinance.R.layout;
import br.com.jonatasdaniel.personalfinance.R.login;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
    
	private EditText edtUsuario;
	private EditText edtSenha;
	private Button btnEntrar;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        init();
    }
    
    private void init() {
    	edtUsuario = (EditText) findViewById(R.login.edt_usuario);
    	edtSenha = (EditText) findViewById(R.login.edt_senha);
    	btnEntrar = (Button) findViewById(R.login.btn_logar);
    }
}