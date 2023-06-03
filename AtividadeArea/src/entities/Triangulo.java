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
				return test;
			}
			
			else if(x == y || x == z || y == z) {
				test = "Triângulo Isósceles";
				return test;
			}
			else {
				test = "Triângulo Escaleno";
				return test;
			}
			
			
		}
	
	
	
}
