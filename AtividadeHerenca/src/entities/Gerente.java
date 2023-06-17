package entities;

public class Gerente extends Funcionario{

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, char sexo, int idade, String departamento, double salario) {
		super(nome, sexo, idade, departamento, salario);
		// TODO Auto-generated constructor stub
	}
	public void bonus(double sal) {
		
		
			salario = sal + 500;
		
		
		
		
	}
}