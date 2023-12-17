package entidade;

import java.util.ArrayList;

public class Estoque {
	private int quantidade;
	private ArrayList<Produto> produto;

	public Estoque(int quantidade) {
		super();
		this.quantidade = quantidade;
		this.produto = new ArrayList<>();
	}

	//getters e setters
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	

}
