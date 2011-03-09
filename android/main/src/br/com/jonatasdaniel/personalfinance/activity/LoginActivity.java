package br.com.jonatasdaniel.personalfinance.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import br.com.jonatasdaniel.personalfinance.R;
import br.com.jonatasdaniel.personalfinance.infra.persistence.UsuarioDao;
import br.com.jonatasdaniel.personalfinance.model.entity.Usuario;
import br.com.jonatasdaniel.personalfinance.model.repository.UsuarioRepository;

public class LoginActivity extends Activity {
    
	private EditText edtUsuario;
	private EditText edtSenha;
	private Button btnEntrar;

	private UsuarioRepository repository = new UsuarioDao();
		
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
		btnEntrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				login();
			}
		});
    }
    
    private void login() {
    	Usuario user = repository.findByLogin(getUsuarioLogin());
    	if(user == null) {
    		Toast.makeText(this, R.string.login_usuario_nao_encontrado, 2000).show();
    	} else {
    		if(user.getSenha().equals(getUsuarioSenha())) {
    			Intent it = new Intent(this, MainActivity.class);
    			Bundle bundle = new Bundle();
    			bundle.putSerializable("usuario", user);
    			it.putExtras(bundle);
    			startActivity(it);
    			finish();
    		} else {
    			Toast.makeText(this, R.string.login_senha_incorreta, 2000).show();
    		}	
    	}
    }
    
    private String getUsuarioLogin() {
    	if(edtUsuario.getText() == null || edtUsuario.getText().length() == 0)
    		return null;
    	else
    		return edtUsuario.getText().toString();
    }
    
    private String getUsuarioSenha() {
    	if(edtSenha.getText() == null || edtSenha.getText().length() == 0)
    		return null;
    	else
    		return edtSenha.getText().toString();
    }
}