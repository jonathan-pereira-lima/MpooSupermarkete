package app;

import base.BaseDados;import entidade.Compra;
import entidade.Gerente;
import entidade.Supermercado;
import entidade.Vendedor;

public class App {

	public static void main(String[] args) {
		BaseDados.createBase();
		BaseDados.exibirProduto();
		
		System.out.println(new Gerente("Maria Silva", "111.111.111-11"));
		System.out.println(new Vendedor("Joao Santos", "222.222.222-22", 0, "vend002"));
		
		System.out.println(new Supermercado(null).compra);
	

	}

}
