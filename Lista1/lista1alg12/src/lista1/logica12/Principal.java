package lista1.logica12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Entrar com dois n�meros reais e imprimir a m�dia aritm�tica com a mensagem �m�dia� antes do resultado
		
		double n1,n2,media;
		
		n1= Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real."));
		n2= Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real."));
		media=(n1+n2)/2;
		
		JOptionPane.showMessageDialog(null, "O resultado da media dos numeros e: "+media);
	}

}
