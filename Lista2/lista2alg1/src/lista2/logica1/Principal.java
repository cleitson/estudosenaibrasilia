package lista2.logica1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* Crie um algoritmo que leia o nome de uma determinada empresa,
		 * leia o nome de uma parceria que ela ir� realizar (entrar com o nome de outra empresa),
		 * entrar com o valor do software que ser� contratado, ler a quantidade de funcion�rios da empresa.
		 * Ler a quantidade de clientes que ir�o utilizar o software.
		 * O seu algoritmo dever� mostrar todas as informa��es lidas.
		 * Apenas se o valor do software for acima de R$ 100.000,00.
		 */
				
		String nome,parceria;
		double software,funcionarios,cliente,valor;
		
		
		
		nome= JOptionPane.showInputDialog("Digite o nome da empresa: ");
		parceria= JOptionPane.showInputDialog("Digite o nome da empresa parceira: ");
		
		software= Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do software a ser contratado?"));
		funcionarios= Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de funcionarios que v�o utilizar o software?"));
		cliente= Double.parseDouble(JOptionPane.showInputDialog("Qual a estimativa de quantos clientes usar�o o software?"));
		
		valor=(cliente+funcionarios)*software;
		
		if  (valor >= 100000){
			
			JOptionPane.showMessageDialog(null,"Empresa: \n "+ nome + "\n Empresa parceira: \n "+ parceria + 
												"\n Valor unitario do software a ser ultilizado: \n"+software+
												"\n Quantidade de funcionarios da empresa "+parceria+" �: \n"+funcionarios+
												"\n Estimativa de clientes: \n "+cliente+ "\n Valor total igual a: "+valor);
			
		}else {
			
			JOptionPane.showMessageDialog(null,"Valor abaixo das especifica��es.");
		}
		
		
		
	}

}
