package br.com.senai.lista2poo;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		
		Scanner leia=new Scanner(System.in);
		int sair;
		
		do {
			System.out.println("Algoritmos disponiveis: 2, 4, 9");
			System.out.println("Qual algoritmo você deseja?");
			int alg= leia.nextInt();
			leia.nextLine();
			switch(alg) {
				case 2: 
					System.out.println("AlgoritmoDois: Digite o nome do Projeto");
					String projeto = leia.nextLine();
					System.out.println("Digite o valor do projeto");
			       	double valor=leia.nextDouble();
			      
					AlgoritmoDois pro=new AlgoritmoDois();
					pro.setProjeto(projeto);
					pro.setValor(valor);
					if(pro.getProjeto().contains("UX DESING")) {
						System.out.println("Nome do projeto: \n"+pro.getProjeto()+ "\n valor com acrecismo de 10%: \n"+ pro.getValor());
					}else {
						System.out.println("O projeto não contem UX DESING");
					}break;
				case 4:
					System.out.println("Entre com os dados da matricula no seguinte formato:CCAAMMFFG\n "
							+ "CC: Código de duas letras equivalente à concessionária que o cliente está associado; \n"
							+ "AA: Dois dígitos equivalentes ao ano da data de matrícula do cliente; \n"
							+ "MM: Dois dígitos equivalentes ao mês da data de matrícula do cliente; \n"
							+ "FF: Equivale ao nível da categoria do cliente (00 para Bronze, 01 para Prata, 02 para Ouro, 03 para Diamante);\n"
							+ "G: Gênero do cliente (M para Masculino, F para Feminino, N para Não definido, O para Outro).\n");
					String matricula=leia.next();
					int ano;
					
					AlgoritmoQuatro mat=new AlgoritmoQuatro();
					mat.setMatricula(matricula);
					
					ano= Integer.parseInt(mat.getMatricula().substring(2,4));
					if(ano <22) {
						System.out.println("Não e desse ano essa matricula");
					}else {
						System.out.println("Matricula: "+ mat.getMatricula());break;
					}
					
				
				case 9:
					System.out.println("Nome do usuario");
					String nome=leia.next();
					System.out.println("Escolha o nivel da categoria entre: \n Bronze \n Prata \n Ouro");
					String cat=leia.next();
					
					AlgoritmoNove nom=new AlgoritmoNove();
					nom.setNome(nome);
					nom.setCategoria(cat);
					
					System.out.println("\n Nome do usuario: "+nom.getNome());
					if(nom.getCategoria().contains("BRONZE")) {
						System.out.println("Não possui lista de espera");
					}else if (nom.getCategoria().contains("PRATA")) {
						System.out.println("Lista de espera encerra em Julho");
					}else if (nom.getCategoria().contains("OURO")) {
						System.out.println("Lista de espera encerra em Janeiro");break;
					}
					
				}
			
			
			
			
			System.out.println("deseja sair: 0");
			sair= leia.nextInt();
		}while(sair != 0);
		
}	
}
		
