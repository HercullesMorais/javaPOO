package principal;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Qual seu nome?: ");
		funcionario.nome = sc.next();
		 
		System.out.println("Entre com seu cargo: ");
		funcionario.cargo = sc.next();
		
		System.out.print("Entre com seu salário: ");
		funcionario.salario = sc.nextDouble();
		
		funcionario.valores();
		
	}

}
