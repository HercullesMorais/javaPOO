package entities;

public class Triangulo {

	
	//Atividade tri�ngulo.
	
	
		public double x;
		public double y;
		public double z;
		public String test ;
		
		public String calc () {
			test = "";
			
			if(x == y && y == z  ) {
				test = "Tri�ngulo Equilatero";
			}
			
			else if(x == y || x == z || y == z) {
				test = "Tri�ngulo Is�sceles";
			}
			else {
				test = "Tri�ngulo Escaleno";
			}
			
			return test;
		}
	
	
	
}
