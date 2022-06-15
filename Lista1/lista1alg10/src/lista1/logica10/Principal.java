package lista1.logica10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler dois números inteiros e imprimir o produto
		
		Integer n1,n2;
		
		n1= Integer.parseInt(JOptionPane.showInputDialog("Digite um numéro inteiro."));
		n2= Integer.parseInt(JOptionPane.showInputDialog("Digite um numéro inteiro."));
		
		int soma;
		soma=n1*n2;
		JOptionPane.showMessageDialog(null,"O produto entre os numeros "+ n1 +" e "+ n2 +" e igual a: "+ soma);
	}

}
