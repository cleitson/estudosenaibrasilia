package lista1.logica11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler um número real e imprimir a terça parte deste número
		
		double numero,parte;
		numero= Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real"));
		parte=numero/3;
		
		JOptionPane.showMessageDialog(null,"O numero escolhido foi: "+numero+" a terça parte dele e: "+parte);
	}

}
