package lista3.logica6;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[]args) {
		
		/*Entrar com um número e informar se ele é divisível por 3 e por 7*/
		
		Scanner leia=new Scanner(System.in);
		Logica6 log=new Logica6();
		int numero;
		
		System.out.println("Informe um numero inteiro.");
		numero=leia.nextInt();
		
		log.setNumero(numero);
		
		System.out.println("O numero "+log.getNumero()+ " pode ser dividido por 3 e por 7: "+log.getDivisivel(numero));
		
		}
	}
