package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Aluno aluno;
		char opcao;
		
		List<Aluno> dadosAlunos = new ArrayList<>();
		
		do {
			System.out.print("Entre com nome do aluno: ");
			String nome = sc.nextLine();
			
			System.out.print("Entre com a serie: ");
			String serie = sc.nextLine();
			
			System.out.print("Entre com a nota do 1° bi:");
			int nota = sc.nextInt();
			
			System.out.print("Entre com a nota do 2° bi:");
			int nota1 = sc.nextInt();
			
			System.out.print("Entre com a nota do 3° bi:");
			int nota2 = sc.nextInt();
			
			System.out.print("Entre com a nota do 4° bi:");
			int nota3 = sc.nextInt();
			
			aluno = new Aluno(nome, serie, nota, nota1, nota2, nota3);
			
			dadosAlunos.add(aluno);
			
			System.out.print("Deseja calcular a média de mais aluno?: ");
			System.out.println("s/n");
			
			opcao =  sc.next().charAt(0);
			sc.nextLine();
			
			
			
		}
		while(Character.toLowerCase(opcao) == 's');
		
		for(Aluno a : dadosAlunos) {
			System.out.println(a);
			System.out.println("\n");
		}
		


	}
}

