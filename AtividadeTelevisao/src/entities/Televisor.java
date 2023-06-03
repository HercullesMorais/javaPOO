package entities;

public class Televisor {

	public int canal;
	public int volume;
	public boolean  ligada;
	

	public void subirCanal() {

		if (canal == canal && canal <= 16) {
			canal += 1;
		}

	}

	public void descerCanal() {
		canal = 1;
		if (canal >= canal && canal > 0) {
			canal -= 1;
		}

	}

	public void aumentarVolume() {
		
		if (volume == volume && volume < 11) {
			volume += 1;
		}

	}

	public void reduzirVolume() {

		if (volume >= volume && volume < 0) {
			volume -= 1;
		}

	}

	public void ligarTv() {
		ligada = true;
	

	}

	public void desligarTv() {
		ligada =  false;
		

	}

	public void mostrarStatus() {
		if(ligada == true){
			System.out.println( "TV: Ligada" + "\nCanal: " + canal + "\nVolume: " + volume );
		}
		else {
			System.out.println("Televisor desligado!");
		}

	}

}
