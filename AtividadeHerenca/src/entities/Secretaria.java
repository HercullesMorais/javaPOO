package entities;

public class Secretaria extends Funcionario{

	public Secretaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretaria(String nome, char sexo, int idade, String departamento, double salario) {
		super(nome, sexo, idade, departamento, salario);
		// TODO Auto-generated constructor stub
	}
	public void bonus(double sal) {
		
	
			salario = sal + 150;
		
		
		
	}

}
