package principal;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoas pessoas =  new Pessoas();
		
		pessoas.idade = 98;
		pessoas.nome = "Fulano";
		pessoas.sexo = 'M';
		
		System.out.println("Nome: " + pessoas.nome + "\nIdade: " + pessoas.idade + "\nSexo: " + pessoas.sexo);
		
	}

}
