package principal;

import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre como o nome do livro: ");
		String nome = sc.nextLine();
		
		System.out.println("Entre com o titulo: ");
		String titulo = sc.nextLine();
		
		System.out.println("Ente como o valor: ");
		double valor = sc.nextDouble();
		
		Livro livro = new Livro(nome, titulo, valor);
		
		System.out.println(livro);
		
		
		
		
		
		
		sc.close();
		
		
		
	}

}
