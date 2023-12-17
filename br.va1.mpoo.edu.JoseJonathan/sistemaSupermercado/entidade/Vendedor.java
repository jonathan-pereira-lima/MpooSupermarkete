package entidade;

public class Vendedor extends Funcionario {
	public final double COMISSAO = 0.05;
	private double totalComissao;
	private String codVendedor;
	
	public Vendedor(String nome, String cpf, double totalComissao, String codVendedor) {
		super(nome, cpf);
		this.totalComissao = totalComissao;
		this.codVendedor = codVendedor;
	}
	
	
	//Getters e Setters
	public double getTotalComissao() {
		return totalComissao;
	}

	public void setTotalComissao(double totalComissao) {
		this.totalComissao = totalComissao;
	}

	public String getCodVendedor() {
		return codVendedor;
	}

	public void setCodVendedor(String codVendedor) {
		this.codVendedor = codVendedor;
	}


	@Override
	public String toString() {
		return "Vendedor [COMISSAO=" + COMISSAO + ", totalComissao=" + totalComissao + ", codVendedor=" + codVendedor
				+ "]";
	}
	
	
	
	
	
	

}
