package lista1.logica19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Entrar com o lado de um quadrado e imprimir:
		 * Perímetro
		 * Area
		 * Diagonal
		*/
		
		double lado,perimetro,area,diagonal;
		
		lado= Double.parseDouble(JOptionPane.showInputDialog("Digite o lado de um quadrado"));
		
		perimetro= 4*lado;
		area=Math.pow(lado, 2);
		diagonal=Math.sqrt(Math.pow(lado, 2)+Math.pow(lado, 2));
		
		JOptionPane.showMessageDialog(null,"perimetro: " + perimetro);
		JOptionPane.showMessageDialog(null,"area: " + area);
		JOptionPane.showMessageDialog(null,"diagonal: " + diagonal);
	}
	

}
