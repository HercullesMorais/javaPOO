package principal;

import java.util.Scanner;

import entities.Triangulo;

public class ProgramTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Triangulo triangulo = new Triangulo();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com primeiro lado do tri�ngulo: ");
		triangulo.x = sc.nextDouble();
		
		System.out.println("Entre com primeiro lado do tri�ngulo: ");
		triangulo.y = sc.nextDouble();
		
		System.out.println("Entre com primeiro lado do tri�ngulo: ");
		triangulo.z = sc.nextDouble();
		
		System.out.println(triangulo.calc());
		
		sc.close();
	}

}
