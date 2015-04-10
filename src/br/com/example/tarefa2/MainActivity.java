package br.com.example.tarefa2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText nome;
	
	public void OnOk(View v){
		Intent i = new Intent(getApplicationContext(), Tela2.class);
		CPessoa pessoa = new CPessoa(nome.getText().toString());
		
		i.putExtra("pessoa", pessoa);
		
		startActivity(i);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		nome  = (EditText) findViewById(R.id.editNome);
		
	}
}
