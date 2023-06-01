package principal;

import java.util.Scanner;

import entities.Areaterreno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double width;
		double length;
		
		
		Areaterreno dados = new Areaterreno();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a largura: ");
		width = sc.nextDouble();
		
		System.out.print("Entre com o comprimento: ");
		length =  sc.nextDouble();
		
		dados.area(width, length);
		
		System.out.println("Área total: " + dados.areaTotal);
		
		
		//Atividade Triângulo;

		
	}

}
