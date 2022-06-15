package lista3.logica5;

import java.util.Scanner;

public class Principal {

	public static void main(String[]args) {
		/*Entrar com um número e informar se ele é ou não divisível por 5*/
	
	Scanner leia=new Scanner(System.in);
	Logica5 log=new Logica5();
	int numero;
	System.out.println("Digite um numero inteiro");
	numero=leia.nextInt();
	
	log.setNumero(numero);
	
	System.out.println(log.isDivisivel(log.getNumero()));
	}
}
