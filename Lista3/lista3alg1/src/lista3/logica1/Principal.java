package lista3.logica1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[]args) {
		/*Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição;
		 * caso o resultado seja maior que 10, apresentá-lo.
		 */
		
		Scanner leia=new Scanner(System.in);
		
		Logica1 log1=new Logica1();
		
		int n1,n2;
		
		System.out.println("Digite um numero inteiro:");
		n1=leia.nextInt();
		System.out.println("Digite um numero inteiro:");
		n2=leia.nextInt();
		
		
		log1.setN1(n1);
		log1.setN2(n2);
		
		if(log1.adicao()>=10) {
			System.out.println(" Soma dos valores igual a: "+log1.adicao());
		}else {
			System.out.println("Numero menor que 10");
		}
	}
}
