package entities;

public class Triangulo {

	
	//Atividade triângulo.
	
	
		public double x;
		public double y;
		public double z;
		public String test ;
		
		public String calc () {
			test = "";
			
			if(x == y && y == z  ) {
				test = "Triângulo Equilatero";
			}
			
			else if(x == y || x == z || y == z) {
				test = "Triângulo Isósceles";
			}
			else {
				test = "Triângulo Escaleno";
			}
			
			return test;
		}
	
	
	
}
