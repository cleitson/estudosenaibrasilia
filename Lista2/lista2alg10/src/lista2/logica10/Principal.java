package lista2.logica10;

import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um algoritmo que irá ajudar uma escola de programação:
		 * O algoritmo irá ler:
		 * O nome do desafio
		 * Quantas linhas de código total no projeto
		 * Quantas horas você demorou para desenvolver.
		 * Se a quantidade de código ultrapassar 1000, você deverá mostrar uma mensagem “código necessita de refatoração”. 
		 */
		
		String desafio;
		double linhas,horas;
		
		desafio=JOptionPane.showInputDialog("Nome do desafio");
		linhas=Double.parseDouble (JOptionPane.showInputDialog("Numeros de linhas"));
		horas=Double.parseDouble (JOptionPane.showInputDialog("Numeros de horas"));
		
		if(linhas>=1000) {
			JOptionPane.showMessageDialog(null,"Código necessita de refatoração");
		}else {
			JOptionPane.showMessageDialog(null,"Nome do Algoritmo: "+desafio+"\n Linhas totais do codigo: "+linhas+"\n Numero de horas ultilizadas: "+horas);
		}
		
	}

}
