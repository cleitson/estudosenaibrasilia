package lista1.logica14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima o novo saldo, considerando o reajuste de 1%
		
		
		double saldo,reajuste,total;
		
		saldo= Double.parseDouble(JOptionPane.showInputDialog("Valor do saldo."));
		reajuste= saldo*0.01;
		total=saldo+reajuste;
		JOptionPane.showMessageDialog(null, "Saldo com reajuste de 1% igual a: "+ total);
	}

}
