package base;
import java.util.ArrayList;
import java.util.Date;
import util.Verificador;
import javax.swing.JOptionPane;

import entidade.Produto;
import util.Verificador;

public class BaseDados {
	private static ArrayList<Produto> produtos;
	
	public static void createBase() {
		produtos = new ArrayList<>();
		inicializarBase();
	}
	
	public static void inicializarBase() {
		produtos.add(new Produto("PROD001", "feijao da Serra", 10.00, null, false));
		produtos.add(new Produto("PROD002", "arroz da Serra", 5.00, null, false));
		produtos.add(new Produto("PROD003", "biscoito formoso", 2.00, null, false));
		produtos.add(new Produto("PROD004", "laranja mimosa", 0.50, null, true));
	}
	
	private static Produto buscarProduto(Produto produto) {
		if(produto == null) {
			return null;
		}
		for (Produto produtoCurrent : produtos) {
			if(produtoCurrent.codBarras.equalsIgnoreCase(produto.codBarras))
				return produtoCurrent;
		}
		return null;
		
	}
	
	public static boolean isProduto(String codBarras) {
		return produtos.contains(buscarProduto(new Produto(codBarras, null, 0, null, false)));
	}
	
	public static boolean addProduto(Produto produto) {
		if(produto == null) {
			return false;
		}
		
		 if (produtos == null) {
		        createBase();
		    }
		
		if(isProduto(produto.codBarras)) {
			JOptionPane.showMessageDialog(null, "Produto já cadastrado!");
		return false;
		}
//		if (!Verificador.isVencido(produto.getValidade()))) {
//			JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
//			return produtos.add(produto);
//		}
		return false;
	}
	
	public static boolean removerProduto(Produto produto) {
		return produtos.remove(buscarProduto(produto));
	}
	
	public static ArrayList<String> exibirProduto(){
		
		ArrayList<String> produtosString = new ArrayList<>();
		
		for (Produto produtoCurrent : produtos) {
			produtosString.add(produtoCurrent.getNome());
			
		}
		
		System.out.println(produtosString);
		return produtosString;
	
	}

	
}
