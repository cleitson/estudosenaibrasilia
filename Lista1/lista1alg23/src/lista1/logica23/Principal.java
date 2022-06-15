package lista1.logica23;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Entrar com nome e idade. Imprimir a seguinte saída
		 * Nome
		 * Idade
		 */	
		
		String nome;
		int idade;
		
		nome=JOptionPane.showInputDialog("Insira seu nome.");
		idade=Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade."));
		
		JOptionPane.showMessageDialog(null,"Seu nome e: "+ nome+"\n"+"Sua idade e: "+ idade);
	
	}

}
