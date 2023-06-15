package entities;

public class Aluno {
	private String nome;
	private String serie;
	private double nota;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public Aluno(String nome, String serie, int nota, int nota1, int nota2, int nota3) {
		super();
		this.nome = nome;
		this.serie = serie;
		this.nota = nota;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double media() {
		double media = (nota + nota1 + nota2 + nota3)/4;
		return media;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\nSérie: " + serie + "\nSua média foi: "  + media();
	}
	
}
