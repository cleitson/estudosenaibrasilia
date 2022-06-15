package lista1.logica21;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criar um algoritmo que calcule e imprima a área de um triângulo 
		
		double base,altura,area;
		
		base=Double.parseDouble(JOptionPane.showInputDialog("Entre com a base do triangulo."));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura do triangulo."));
		
		area=(altura*base)/2;
		JOptionPane.showMessageDialog(null,"A area do triangulo e: "+area);
	}
	

}
