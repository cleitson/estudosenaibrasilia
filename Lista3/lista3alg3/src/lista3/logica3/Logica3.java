package lista3.logica3;

public class Logica3 {

	/*Entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo
	 * e o quadrado do número caso ele seja negativo.
	*/
	
	private double num;
	
	public void setNum(double num) {
		this.num=num;
	}
	public double getNum() {
		return num;
	}
	
	public double getPositivo() {
		return Math.sqrt(num);
	}
	public double getNegativo() {
		return Math.pow(num,2);
	}
}


