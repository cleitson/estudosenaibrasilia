package lista1.logica7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler um n�mero inteiro e escrever o seu sucessor e seu antecessor
		
		Integer numero,antecessor,sucessor;
		
		numero= Integer.parseInt(JOptionPane.showInputDialog("Digite um num�ro inteiro."));
		antecessor= numero-1;
		sucessor= numero+1;
		
		JOptionPane.showMessageDialog(null,"O num�ro escolhido "+numero+"\n tem como antecessor "+antecessor+
				"\n e como sucessor "+sucessor);
	
	}

}
