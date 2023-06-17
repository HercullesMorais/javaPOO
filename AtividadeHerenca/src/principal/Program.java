package principal;

import java.util.Scanner;

import entities.Funcionario;
import entities.Gerente;
import entities.Secretaria;

public class Program {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		String nome;
		char sexo;
		int idade;
		String departamento;
		double salario;
		
		System.out.print("Entre com seu nome: ");
		nome =  sc.next();
		
		System.out.print("Entre com seu sexo(F/M): ");
		sexo = sc.next().charAt(0);
		
		System.out.print("Entre com sua idade: ");
		idade = sc.nextInt();
		
		System.out.print("Entre com seu departamento: ");
		departamento = sc.next();
		
		System.out.print("Entre com seu salário: ");
		salario = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, sexo, idade, departamento, salario);
		
		Gerente gerente =  new Gerente(nome, sexo, idade, departamento, salario);
		Secretaria secretaria = new Secretaria(nome, sexo, idade, departamento, salario);
		
		if(departamento.equals("gerente")) {
			gerente.bonus(salario);
			System.out.println(gerente + "\n");
			
		} else {
			secretaria.bonus(salario);
			System.out.println(secretaria);
			
			
		}
		
			

		
		
		}

}
