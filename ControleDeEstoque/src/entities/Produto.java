package entities;

public class Produto {


	private String descricao;
	private double preco;
	private int quantidade;

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

	public int getQuantidade() {
		return quantidade;
	}

	

	// FUNÇÕES
	

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
		return "\n\nDescrição: " + descricao + "\nPreço: " + preco + "\nQuantidade: " + quantidade
				+ "\nTotal em Estoque: " + String.format("%.2f", valorEmEstoque());
	}

}
