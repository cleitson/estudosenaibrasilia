package lista2.logica2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um algoritmo que leia o nome de um projeto, e o valor do projeto.
		 * Se o projeto ter “UX Design” ele terá 10% a mais do valor digitado.
		 * Mostre o valor corrigido dentro dessa condição.
		 */
		
		String nome;
		double valor,valor10;
		
		nome= JOptionPane.showInputDialog("Nome do projeto").toUpperCase();
		valor= Double.parseDouble(JOptionPane.showInputDialog("valor?"));
		valor10=valor*1.10;
		if(nome.contains("UX DESING")) {
			JOptionPane.showMessageDialog(null,"Nome do projeto: \n"+nome+ "\n valor com acrecismo de 10%: \n"+ valor10);
		}
		else {
			JOptionPane.showMessageDialog(null,"O projeto não contem UX DESING");
		}
		
	}

}
