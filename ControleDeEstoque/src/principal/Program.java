package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		
		Produto produto = new Produto();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do produto: ");
		String descri = sc.nextLine();
		produto.setDescricao(descri);
		
		System.out.println("Quantidade para de itens para o estoque: ");
		int quant = sc.nextInt();
		produto.addEstoque(quant);
		
		System.out.println("Valor: ");
		double preco = sc.nextDouble();
		produto.setPreco(preco);
		
		
		
	
		
		System.out.println(produto);
		
		sc.close();
		

	}

}
