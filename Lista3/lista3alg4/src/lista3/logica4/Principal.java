package lista3.logica4;

import java.util.Scanner;

public class Principal {

	public static void main(String[]args) {
		/*Entrar com um n�mero e imprimir uma das mensagens: � multiplo de 3 ou n�o � m�ltiplo de 3*/
	
	
	Scanner leia=new Scanner(System.in);
	
	Logica4 log=new Logica4();
	
	int num1;
	
	System.out.println("Entre com um numero inteiro para saber se e multiplo de tres ou n�o.");
	num1=leia.nextInt();
	log.setNumero(num1);
	if(log.getNumero() % 3 ==0) {
		System.out.println(log.getNumero()+" e multiplo de 3.");
	}else {
		System.out.println(log.getNumero()+" nao e multiplo de 3");
	}
	}
}
