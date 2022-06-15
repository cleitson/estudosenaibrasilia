package lista3.logica6;

public class Logica6 {

	private int numero;
	
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public boolean getDivisivel(int numero) {
		return numero % 3==0 && numero % 7==0;
	}
}
