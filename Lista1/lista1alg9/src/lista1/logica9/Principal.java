package lista1.logica9;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler dois n�meros inteiros e imprimir a soma. Antes do resultado, dever� aparecer a mensagem: Soma.
		
		Integer n1,n2,soma;
		n1= Integer.parseInt(JOptionPane.showInputDialog("Digite um num�ro inteiro."));
		n2= Integer.parseInt(JOptionPane.showInputDialog("Digite um num�ro inteiro."));
		
		soma=n1+n2;
		
		JOptionPane.showMessageDialog(null,"A soma dos dois numeros e igual a: "+soma);
		
	}
	

}
