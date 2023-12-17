package entidade;

import java.util.ArrayList;

public class Supermercado {
	public String nome;
	public static ArrayList<Funcionario> funcionarios;
	public static ArrayList<Compra> compra;
	
	public Supermercado(String nome) {
		this.nome = nome;
		this.funcionarios = new ArrayList<>();
		this.compra = new ArrayList<>();
	}
	
	public static Funcionario buscarFuncionario(String cpf) {
		if(cpf == null) {
			return null;
		}
		for (Funcionario funcionarioCurrent : funcionarios) {
			if(funcionarioCurrent.getCpf().equalsIgnoreCase(cpf))
				return funcionarioCurrent;	
		}
		return null;
	}
	public static Vendedor buscarVendedor(String codVendedor) {
		if(codVendedor == null) {
			return null;
		} //fazer Downcasting
		return null;
	}
	public static Compra buscarCompra(int id) {
		if(id == 0) {
			return null;
		}
//		for (Compra compraCurrent : compra) {
//			if(compraCurrent.
//				return funcionarioCurrent;	
//		}
		return null;
	}
	
}
