package br.senai.inovatech.aulaabstracao;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * digite a opçao
		 * 1 conta corrente
		 * 2 conta poupanca
		 * 3 conta rural
		 * 
		 * digite a opçao
		 * 1 depositar
		 * 2 sacar
		 * 3 verificar saldo
		 * 
		 * deseja realizar outra operacao:{sim}  {nao}*/
		Scanner leia= new Scanner(System.in);
		int sair;
		double deposito,saque;
		ContaCorrente cc=new ContaCorrente();
		ContaPoupanca cp=new ContaPoupanca();
		contaRural cr=new contaRural();
	

		do {
			System.out.println("Escolha a Opção \n 1 - Conta Corrente \n 2 - Conta Poupança \n 3 - Conta Rural");
			int alg1=leia.nextInt();
			
			System.out.println("Escolha a Opção \n 1 - Depositar \n 2 - Sacar \n 3 - Verificar Saldo");
			int alg2=leia.nextInt();
			
			
			switch(alg1) {
				case 1:
					if(alg2==1){
						System.out.println("Valor a ser depositado:");
						deposito=leia.nextDouble();
						cc.setValor(deposito);
						System.out.println("Saldo total: "+ cc.getSaldo());
						}
						else if(alg2==2) {	
							System.out.println("Valor do Saque;");
							saque=leia.nextDouble();
							cc.setValor(saque);
							System.out.println("Saldo total: "+ cc.getSaldo());
						}
						else if(alg2==3) {
							System.out.println("Saldo: "+cc.getSaldo());
						}break;
				case 2:
					if(alg2==1){
						System.out.println("Valor a ser depositado:");
						deposito=leia.nextDouble();
						cp.setValor(deposito);
						}
						else if(alg2==2) {	System.out.println("Valor do Saque;");
						saque=leia.nextDouble();
						cp.setValor(saque);
						}
						else if(alg2==3) {
						System.out.println("Verificar Saldo");
						cp.getSaldo();
						}break;
						
				case 3:
					System.out.println("Saldo Atual: "+cc.getSaldo());
				}
						
			System.out.println("Para continuar= 0 para sair= 1");
			sair= leia.nextInt();
			
		}while (sair!=1);
		
	}

}
