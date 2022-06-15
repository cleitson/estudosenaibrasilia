package lista1.logica26;

import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula de prestação = valor+(valor*(taxa/100)*tempo).
		
		double valor,taxa,tempo,total;
		
		valor= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação."));
		tempo= Double.parseDouble(JOptionPane.showInputDialog("Quantidade de meses vencido."));
		taxa= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa de atraso."));
		
		total=valor+(valor*(taxa/100)*tempo);
		
		JOptionPane.showMessageDialog(null, "O valor da prestação atualizado e: "+total);
		
	}

}
