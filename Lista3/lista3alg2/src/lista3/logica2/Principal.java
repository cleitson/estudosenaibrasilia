package lista3.logica2;

import java.util.*;

public class Principal {
	public static void main(String[]args) {
		/*Construir um algoritmo que leia dois números e efetue a adição. Caso o valor somado
		 * seja maior que 20, este deverá ser apresentado somando-se a ele mais 8; caso o valor
		 * somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.
		*/
		Scanner leia=new Scanner(System.in);
		
		Logica2 log=new Logica2();
		
		int n1,n2;
		
		System.out.println("Digite um numero");
		n1=leia.nextInt();
		System.out.println("Digite um numero");
		n2=leia.nextInt();
		
		log.setN1(n1);
		log.setN2(n2);
		
		if(log.getSoma()>20){
			System.out.println("A soma dos numeros digitados "+log.getSoma()+ " e maior que 20 entao recebe+8 "+"Total "+ (log.getSoma()+8));
		}else if(log.getSoma()<=20) {
			System.out.println("A soma dos numeros digitados "+log.getSoma()+ " e menor ou igual a 20 entao perde -5 "+" Total "+ (log.getSoma()-5));
		}
		
		
		
		
		
		
		
		
	}
	
}
