package lista1.logica22;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criar um algoritmo que calcule e imprima a área de um losango 
		
		double lado1,lado2,area;
		
		lado1=Double.parseDouble(JOptionPane.showInputDialog("Entre com a diagonal do losango."));
		lado2=Double.parseDouble(JOptionPane.showInputDialog("Entre com a diagonal do losango."));
		
		area=(lado1*lado2)/2;
		JOptionPane.showMessageDialog(null,"A area do losango e: "+area);
	}

}
