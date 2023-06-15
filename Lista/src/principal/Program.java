package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> nomes = new ArrayList<>();
		
		nomes.add("Kamylla");
		nomes.add("Herculles");
		nomes.add("Luna");
		
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		
		// obtém o terceiro item na lista
	    String nome = nomes.get(2);
	  
	    System.out.println("O valor obtido foi: " + nome); 
	    
	    System.out.println(nomes.get(2));
	  
	    String dado =  nomes.stream().filter(x -> x == "Luna").findFirst().orElse(null);
	    
	    System.out.println(dado);
	  
	    Collections.sort(nomes);
	    System.out.println("\nImprindo em ordem alfabetica");
	    for(String name : nomes) {
	    	System.out.println("Nome: " + name);
	    }
	}

}
