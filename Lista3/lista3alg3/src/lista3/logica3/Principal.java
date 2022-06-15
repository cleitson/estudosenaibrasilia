package lista3.logica3;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		/*Entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo
		 * e o quadrado do número caso ele seja negativo.
		*/
		
		Scanner leia=new Scanner(System.in);
		
		Logica3 log=new Logica3();
		
		double n1;
		
		System.out.println("Digite um numero para raiz quadrada do número caso ele seja positivo e o quadrado do número caso ele seja negativo.");
		n1=leia.nextDouble();
		
		log.setNum(n1);
		
		if(log.getNum()<0) {
			System.out.println("Numero negativo: "+ log.getNegativo());
		}else {
			System.out.println("Numero positivo: "+ log.getPositivo());
		}
	
		
	
	
	}
	
}
