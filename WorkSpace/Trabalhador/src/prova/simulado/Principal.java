package prova.simulado;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		TrabalhadorChefe chefe=new TrabalhadorChefe();
		TrabalhadorComissao comissao=new TrabalhadorComissao();
		TrabalhadorProducao producao=new TrabalhadorProducao();
		TrabalhadorHorista horista=new TrabalhadorHorista();
		
		int sair;
		int cargo;
		
		
		do {			
			System.out.println("Cargo do funcionario \n"
					+ " 1 = Trabalhador Chefe \n"
					+ " 2 = Trabalhador Comissão \n"
					+ " 3 = Trabalhador Produção \n"
					+ " 4 = Trabalhador Horista \n");
			cargo=ler.nextInt();
			
			switch(cargo) {
			
			case 1:
				System.out.println("Digite o seu primeiro nome");		
				chefe.setNome(ler.next());
		
				System.out.println("Digite o seu sobrenome");
				chefe.setSobrenome(ler.next());
				
				System.out.println("Digite o salario semanal");
				chefe.setSemanal(ler.nextDouble());
				
				System.out.println(chefe.toString());				
				break;
				
				
			case 2:
				System.out.println("Digite o seu primeiro nome");		
				comissao.setNome(ler.next());
		
				System.out.println("Digite o seu sobrenome");
				comissao.setSobrenome(ler.next());
				
				System.out.println("Digite o salario");
				comissao.setSalario(ler.nextDouble());
				
				System.out.println("Digite o valor da comissão");
				comissao.setComissao(ler.nextDouble());
				
				System.out.println("Digite a quantidade de itens vendidos");
				comissao.setNvenda(ler.nextDouble());
				
				System.out.println(comissao.toString());				
				break;
				
				
			case 3:
				System.out.println("Digite o seu primeiro nome");		
				producao.setNome(ler.next());
		
				System.out.println("Digite o seu sobrenome");
				producao.setSobrenome(ler.next());
				
				System.out.println("Valor do iten produzido");
				producao.setVproduzido(ler.nextDouble());
				
				System.out.println("Quantidade de itens produzidos");
				producao.setQproduto(ler.nextDouble());
				
				System.out.println(producao.toString());				
				break;
			case 4:
				System.out.println("Digite o seu primeiro nome");		
				horista.setNome(ler.next());
		
				System.out.println("Digite o seu sobrenome");
				horista.setSobrenome(ler.next());
				
				System.out.println("Digite o valor da hora trabalhada");
				horista.setVhora(ler.nextDouble());
				
				System.out.println("Digite a quantidade de horas trabalhadas");
				horista.setQhora(ler.nextDouble());
				
				System.out.println(horista.toString());				
				break;
			}
			
			System.out.println("Continuar: 1=Sim 0=Não");
			sair = ler.nextInt();
			
		}while(sair != 0);
		
		
	}	


}
