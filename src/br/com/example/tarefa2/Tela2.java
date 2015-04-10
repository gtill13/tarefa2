package br.com.example.tarefa2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends Activity {

	private TextView campoTexto;
	
	public void OnVoltar(View v){
		finish();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela2);
		
		campoTexto = (TextView) findViewById(R.id.textView1);
		
		CPessoa pessoa = (CPessoa) this.getIntent().getSerializableExtra("pessoa");
		 
		campoTexto.setText(pessoa.getNome()); 
	}
}
