package br.edu.ifpb.esperanca.daw2.financeiro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private int id_cpf;

	private String nome;
	private int idade;
	private float despesafixa;
	private float salariofixo;
	private float resultado;
	private String endereco;

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	public float getSalariofixo() {
		return salariofixo;
	}

	public void setSalariofixo(float salariofixo) {
		this.salariofixo = salariofixo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId_cpf() {
		return id_cpf;
	}

	public void setId_cpf(int id_cpf) {
		this.id_cpf = id_cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getDespesafixa() {
		return despesafixa;
	}

	public void setDespesafixa(float despesafixa) {
		this.despesafixa = despesafixa;
	}

}
