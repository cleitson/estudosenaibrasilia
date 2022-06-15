package lista2.logica7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Você deverá criar um software para gerenciar galpões para agenciar veículos:
		 * Branco: indica que aquela área está sem automóveis alocados para ela, ou seja, está com 0 ocupação.
		 * Azul: indica que aquela área está com automóveis alocados para ela, mas não está totalmente ocupada.
		 * Vermelho: indica que aquela área está com a sua capacidade máxima ocupada com automóveis.
		 * O algoritmo deverá permitir a leitura do nome do galpão e sua cor.
		 * Verifique cada cor e personalize uma mensagem avisando-o do status do andar solicitado.
		*/
		
		String branco,azul,vermelho,galpao;
		int numero;
		
		branco="sem automóveis alocados, ou seja, está com 0 ocupação";
		azul="está com automóveis alocados, mas não está totalmente ocupada";
		vermelho="capacidade máxima de automóveis, não há mais vagas";
		
		galpao = JOptionPane.showInputDialog("Nome do galpão? ");
		numero=Integer.parseInt(JOptionPane.showInputDialog("quantidade de carros a serem guardados? "));
		
		if (numero==0) {
			JOptionPane.showMessageDialog(null,"Galpão "+galpao+" Nivel Branco "+ branco);
		}else if (numero>=1 && numero<=50) {
			JOptionPane.showMessageDialog(null,"Galpão "+galpao+" Nivel Azul "+ azul);
		}else if (numero>50) {
			JOptionPane.showMessageDialog(null,"Galpão "+galpao+" Nivel Vermelho "+ vermelho);
		
		}
	}

}
