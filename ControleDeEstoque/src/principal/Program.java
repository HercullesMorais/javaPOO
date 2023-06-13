package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do produto: ");
		String descri = sc.nextLine();
		
		//produto.setDescricao(descri);
		
		System.out.println("Quantidade para de itens para o estoque: ");
		int quant = sc.nextInt();
		//produto.addEstoque(quant);
		
		System.out.println("Valor: ");
		double valor = sc.nextDouble();
		//produto.setPreco(preco);
		
		
		Produto produto = new Produto(descri, valor, quant);
	
		
		System.out.println(produto);
		
		sc.close();
		

	}

}
