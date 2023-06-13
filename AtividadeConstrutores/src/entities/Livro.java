package entities;

public class Livro {
	
	private String nome;
	private String titulo;
	private double valor;
	
	
	public String getNome() {
		return nome;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}


	public Livro(String nome, String titulo, double valor) {
		super();
		this.nome = nome;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	public double imposto() {
		double tax = 0;
		if(valor > 100) {
			tax = valor + (valor * 0.3) ;
		}
		else {
			tax = valor;
		}
		return tax;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\nTitulo: " + titulo + "\nValor: " + imposto();
	}
}
