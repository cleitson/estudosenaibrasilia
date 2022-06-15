package lista1.logica5;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler um número inteiro e imprimi-lo  
		
		Integer n1;
		n1= Integer.parseInt(JOptionPane.showInputDialog("Digite um numéro inteiro."));
		JOptionPane.showMessageDialog(null,"O numéro digitado foi: "+ n1);
	}

}
