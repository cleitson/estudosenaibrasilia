package lista1.logica5;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler um n�mero inteiro e imprimi-lo  
		
		Integer n1;
		n1= Integer.parseInt(JOptionPane.showInputDialog("Digite um num�ro inteiro."));
		JOptionPane.showMessageDialog(null,"O num�ro digitado foi: "+ n1);
	}

}
