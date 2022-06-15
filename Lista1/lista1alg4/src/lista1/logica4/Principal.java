package lista1.logica4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criar um algoritmo que escreva a média aritmética entre os números 8,9 e 7
		
		double n1,n2,n3,media;
		n1=8;
		n2=9;
		n3=7;
		media = (n1+n2+n3)/3;
	
		JOptionPane.showMessageDialog(null,"A  média dos numeros 8,9,7 e: "+ media);
	}

}
