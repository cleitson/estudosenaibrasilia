package br.com.senai.lista1poo;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int sair;
		do {
			System.out.println("Qual algoritmo você deseja?");
			int alg= leia.nextInt();
			
			switch(alg) {
			   case 1:
				   //Interação com o usuário
				
			       System.out.println("Digite a mensagem");
			       String mensagem = leia.next();
			       
			       //Instânciação
			       AlgoritmoUm a1= new AlgoritmoUm();
			       a1.setMensagem(mensagem);
			       System.out.println("Mensagem Original:"+a1.getMensagem());
			       System.out.println("Mensagem Caixa Alta:"+a1.tranformarMensagem(true));
			       System.out.println("Mensagem Mínusculo:"+a1.tranformarMensagem(false));break;
			       
			       
			       
			   case 2:
				   System.out.println("Digite um numero:");
				   int n1 = Integer.parseInt(leia.next());
				   System.out.println("Digite um numero:");
				   int n2 = Integer.parseInt(leia.next());
				   
				   AlgoritmoTres numero=new AlgoritmoTres();
				   numero.setN1(n1);
				   numero.setN2(n2);
				   System.out.println("O produto entre os numeros digitados "+ n1+ " e "+ n2+ " e igual a: "+numero.multiplicar());break;
				   
				   
			   case 3:
				   System.out.println("Digite a primeira nota");
				   double nota1=Double.parseDouble(leia.next());
				   System.out.println("Digite a segunda nota");
				   double nota2=Double.parseDouble(leia.next());
				   System.out.println("Digite a terceira nota");
				   double nota3=Double.parseDouble(leia.next());
				   
				   AlgoritmoQuatro nota=new AlgoritmoQuatro();
				   nota.setNota1(nota1);
				   nota.setNota2(nota2);
				   nota.setNota3(nota3);
				   
				   System.out.println("A media entre as notas: "+nota1+", "+nota2+", "+nota3+" e igual a: "+nota.media());break;
				   
				default: System.out.println("Algoritmo invalido");
			}
			
			
			
			
			System.out.println("deseja sair: 0");
			sair= leia.nextInt();
			
		}while(sair != 0);
		
		
		
	}

}