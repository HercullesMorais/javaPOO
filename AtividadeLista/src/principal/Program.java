package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pessoa p;
		List<Pessoa> adicionar = new ArrayList<>();
		char opcao;
		
		do {
			
			
			System.out.println("Entre com um nome: ");
			String nome = sc.nextLine();
		
			
			System.out.println("Entre com o telefone: ");
			String telefone = sc.nextLine();
			
			System.out.println("Entre com a idade: ");
			int idade = sc.nextInt();
			
			
			
			 p = new Pessoa(nome, idade, telefone);
			
			adicionar.add(p);
			
			System.out.print("Deseja cadastrar mais uma pessoa?: ");
			System.out.println("s/n");
			
			opcao =  sc.next().charAt(0);
			sc.nextLine();
			
		}
		while(Character.toLowerCase(opcao) == 's');
		
		for(Pessoa a : adicionar) {
			System.out.println(a);
			System.out.println("\n");
		}
		
		
	sc.close();
	
		
	
	}
}

