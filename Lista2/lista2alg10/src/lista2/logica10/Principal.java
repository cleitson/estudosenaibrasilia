package lista2.logica10;

import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um algoritmo que ir� ajudar uma escola de programa��o:
		 * O algoritmo ir� ler:
		 * O nome do desafio
		 * Quantas linhas de c�digo total no projeto
		 * Quantas horas voc� demorou para desenvolver.
		 * Se a quantidade de c�digo ultrapassar 1000, voc� dever� mostrar uma mensagem �c�digo necessita de refatora��o�. 
		 */
		
		String desafio;
		double linhas,horas;
		
		desafio=JOptionPane.showInputDialog("Nome do desafio");
		linhas=Double.parseDouble (JOptionPane.showInputDialog("Numeros de linhas"));
		horas=Double.parseDouble (JOptionPane.showInputDialog("Numeros de horas"));
		
		if(linhas>=1000) {
			JOptionPane.showMessageDialog(null,"C�digo necessita de refatora��o");
		}else {
			JOptionPane.showMessageDialog(null,"Nome do Algoritmo: "+desafio+"\n Linhas totais do codigo: "+linhas+"\n Numero de horas ultilizadas: "+horas);
		}
		
	}

}
