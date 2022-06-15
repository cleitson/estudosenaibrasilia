package lista1.logica18;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Entrar com o raio de um círculo e imprimir a seguinte saída:
		 * Perímetro
		 * Área */ 
		
		double raio,perimetro,area;
		
		raio= Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do Raio de um circulo."));
		
		perimetro= 2*Math.PI*raio;
		JOptionPane.showMessageDialog(null,"O perimetro do circulo indicado e: " + perimetro);
		
		area= Math.PI*(Math.pow(raio,2));
		JOptionPane.showMessageDialog(null,"A area do circulo indicado e: " + area);
	}

}
