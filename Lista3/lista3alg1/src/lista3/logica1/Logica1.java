package lista3.logica1;

public class Logica1 {

	/*Construir um algoritmo que leia dois valores num�ricos inteiros e efetue a adi��o;
	 * caso o resultado seja maior que 10, apresent�-lo.
	 */
	
	private int n1,n2;
	
	public void setN1(int n1) {
		this.n1=n1;
	}
	public int getN1() {
		return n1;
	}
	
	public void setN2(int n2) {
		this.n2=n2;
	}
	public int getN2() {
		return n2;
	}
	
	public int adicao() {
	return n1+n2;
	}
}
