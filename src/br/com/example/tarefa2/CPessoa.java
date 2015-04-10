/**
 * 
 */
package br.com.example.tarefa2;

import java.io.Serializable;

/**
 * @author TiLL
 *
 */
public class CPessoa implements Serializable{

	private String Nome;
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public CPessoa(String nome) {
		super();
		Nome = nome;
	}

	public CPessoa() {
		// TODO Auto-generated constructor stub
	}

}
