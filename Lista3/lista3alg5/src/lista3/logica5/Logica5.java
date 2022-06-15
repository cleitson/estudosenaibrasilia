package lista3.logica5;

public class Logica5 {
	private int num1;
	
	public void setNumero(int num1) {
		this.num1=num1;
	}
	
	public int getNumero(){
		return num1;
	}
	
	public boolean isDivisivel(int num1) {
		return num1 % 5==0;
	}
}
