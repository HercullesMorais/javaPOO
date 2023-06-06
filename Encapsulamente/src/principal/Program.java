package principal;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Conta conta =  new Conta();
		
	
		
		System.out.println("Titular: ");
		
		String titularInfor = sc.next();
		
		conta.setTitular(titularInfor);
		
		System.out.println("Agencia: ");
		int agencia = sc.nextInt();
		
		conta.setAgencia(agencia); 
		
		
		System.out.println("Número da conta: ");
		int numConta = sc.nextInt();
			
		conta.setNumeroConta(numConta);
		
		/*System.out.println("Saldo: ");
		conta.saldo = sc.nextDouble();*/
		
		System.out.println("Entre com o valor de deposito: ");
		double deposito = sc.nextDouble();
		
		conta.depositar(deposito);
		
		
		System.out.println("Entre com o valor de retirada: ");
		double retirada = sc.nextDouble();
		
		conta.sacar(retirada);
		
		System.out.println(conta);
		
		
		
		
		sc.close();
		
		
	}

}
