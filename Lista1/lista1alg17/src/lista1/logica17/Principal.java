package lista1.logica17;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Entrar com a base e a altura de um ret�ngulo e imprimir a seguinte sa�da:
		 * Per�metro
		 * Area  
		 * Diagonal
		 */   
		
		double base,altura,perimetro,area,diagonal;
		
		base= Double.parseDouble(JOptionPane.showInputDialog("Valor da base do ret�ngulo."));
		altura= Double.parseDouble(JOptionPane.showInputDialog("Valor da altura do ret�ngulo."));
		
		perimetro=(base*2)+(altura*2);
		area=base*altura;
		diagonal=Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		JOptionPane.showMessageDialog(null, "O perimetro igual a: "+ perimetro);
		JOptionPane.showMessageDialog(null, "A area igual a: "+ area);
		JOptionPane.showMessageDialog(null, "A diagonal igual a: "+ diagonal);
		
	}

}
