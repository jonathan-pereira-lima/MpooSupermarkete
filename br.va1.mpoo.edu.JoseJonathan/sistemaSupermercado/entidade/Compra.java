package entidade;

import java.util.ArrayList;

public class Compra {
	public int id;
	private double valorTotal;
	private ArrayList<Produto> produtos;
	
	
	public Compra() {
		this.id = id+=1;
//		this.valorTotal = valorTotal; //ver essa logica
		this.produtos = new ArrayList<>();
	}



	public boolean adicionarProduto(Produto produto) {
		if(produtos == null) {
			return false;
		}
		if(!produtos.contains(produto)) {
			produtos.add(produto);
		}
		return false;
	}

}
