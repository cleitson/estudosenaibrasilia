package lista3.logica3;

public class Logica3 {

	/*Entrar com um n�mero e imprimir a raiz quadrada do n�mero caso ele seja positivo
	 * e o quadrado do n�mero caso ele seja negativo.
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


