package principal;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro = new Carro();
		Carro carro2 = new Carro();
		
		carro.modelo = "celta";
		carro.ano = 2022;
		carro.cor = "branco";
		carro.placa = "xyz - 1010";
		
		carro2.modelo = "BMW";
		carro2.ano = 2030;
		carro2.cor = "branco";
		carro2.placa = "xyz - 1112";
		
		System.out.println("Carro: " + carro.modelo +  " Ano: " + carro.ano);
		System.out.println("Carro: " + carro2.modelo +  " Ano: " + carro2.ano);
		
		
		
	}

}
