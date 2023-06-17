package entities;

public class Funcionario {
	
	private String nome;
	private char sexo;
	private int idade;
	protected String departamento;
	protected double salario;
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Funcionario(String nome, char sexo, int idade, String departamento, double salario) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.departamento = departamento;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void bonus(double sal) {
		if(departamento.equals("gerente")) {
			salario += sal;
		}
		else {
			  salario += sal;
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade +
				"\nDepartamento: " + departamento + "\nSalário: " + salario ;
	}
	
}
