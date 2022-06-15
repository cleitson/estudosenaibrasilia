package lista1.logica9;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá aparecer a mensagem: Soma.
		
		Integer n1,n2,soma;
		n1= Integer.parseInt(JOptionPane.showInputDialog("Digite um numéro inteiro."));
		n2= Integer.parseInt(JOptionPane.showInputDialog("Digite um numéro inteiro."));
		
		soma=n1+n2;
		
		JOptionPane.showMessageDialog(null,"A soma dos dois numeros e igual a: "+soma);
		
	}
	

}
