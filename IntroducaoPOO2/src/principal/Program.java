package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		
		Pessoa pessoa =  new Pessoa();
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Entre com o nome: ");
		pessoa.nome = sc.next();
		
		System.out.println("Ano de nascimento: ");
		int ano = sc.nextInt();
	
		System.out.println("Entre com o sexo: ");
		pessoa.sexo = sc.next().charAt(0);
		
		pessoa.retornaIdade(ano);
		
		System.out.println("Nome: " + pessoa.nome + "\nIdade: " + pessoa.idade + "\nSexo: " + pessoa.sexo);
		
	}

}
