package lista1.logica6;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler dois n�meros inteiros e imprimi-los  
		
		int n1,n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("Degite um numero inteiro: ")) ;
		n2=Integer.parseInt(JOptionPane.showInputDialog("Degite um numero inteiro: ")) ;
		
		JOptionPane.showMessageDialog(null,"Os num�ros escolhidos s�o: " +n1+" e "+ n2);
	}

}
