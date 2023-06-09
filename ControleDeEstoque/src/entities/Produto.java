package entities;

public class Produto {


	private String descricao;
	private double preco;
	private double quantidade;

	
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(String descricao, double preco, int quantidade) {
		super();
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}



	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	

	// FUN��ES
	

	public void addEstoque(int quantidade) {

		this.quantidade += quantidade;
	}

	public void baixaEstoque(int quantidade) {
		if (quantidade > 0) {

			this.quantidade -= quantidade;
		}

	}

	public double valorEmEstoque() {
		double a = preco * quantidade;
		return a;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n\nDescri��o: " + descricao + "\nPre�o: " + preco + "\nQuantidade: " + quantidade
				+ "\nTotal em Estoque: " + String.format("%.2f", valorEmEstoque());
	}

}
