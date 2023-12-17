package entidade;

import java.util.ArrayList;
import java.util.Calendar;

public class Produto {
	public String codBarras;
	private String nome;
	protected double preco;
	Calendar validade;
	private boolean perecivel;
	
	public Produto(String codBarras, String nome, double preco, Calendar validade, boolean perecivel) {
		this.codBarras = codBarras;
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
		this.perecivel = perecivel;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Calendar getValidade() {
		return validade;
	}

	public void setValidade(Calendar validade) {
		this.validade = validade;
	}

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
	
	
	
	

}
