package entities;

public class Funcionario {
	
	public String nome;
	public String cargo;
	public double salario;
	public double salarioFinal;
	public double bonus;
	
	public void valores() {
		
		
		
		
		if(cargo.equals("gerente") && salario <= 5000) {
			
			
			salarioFinal = salario + (0.015 * salario);
		}
		else if(salario <= 1500) {
		
		
			salarioFinal = salario + (0.02 * salario);			
		}
		else {
			salarioFinal = salario;
		}
		
		System.out.println("Olá " + nome + "!! Seu salario final é de : " +salarioFinal);
		
	}
	
	
	
	
	
	
	
	
	
	
}
