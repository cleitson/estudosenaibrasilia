package lista2.logica7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Voc� dever� criar um software para gerenciar galp�es para agenciar ve�culos:
		 * Branco: indica que aquela �rea est� sem autom�veis alocados para ela, ou seja, est� com 0 ocupa��o.
		 * Azul: indica que aquela �rea est� com autom�veis alocados para ela, mas n�o est� totalmente ocupada.
		 * Vermelho: indica que aquela �rea est� com a sua capacidade m�xima ocupada com autom�veis.
		 * O algoritmo dever� permitir a leitura do nome do galp�o e sua cor.
		 * Verifique cada cor e personalize uma mensagem avisando-o do status do andar solicitado.
		*/
		
		String branco,azul,vermelho,galpao;
		int numero;
		
		branco="sem autom�veis alocados, ou seja, est� com 0 ocupa��o";
		azul="est� com autom�veis alocados, mas n�o est� totalmente ocupada";
		vermelho="capacidade m�xima de autom�veis, n�o h� mais vagas";
		
		galpao = JOptionPane.showInputDialog("Nome do galp�o? ");
		numero=Integer.parseInt(JOptionPane.showInputDialog("quantidade de carros a serem guardados? "));
		
		if (numero==0) {
			JOptionPane.showMessageDialog(null,"Galp�o "+galpao+" Nivel Branco "+ branco);
		}else if (numero>=1 && numero<=50) {
			JOptionPane.showMessageDialog(null,"Galp�o "+galpao+" Nivel Azul "+ azul);
		}else if (numero>50) {
			JOptionPane.showMessageDialog(null,"Galp�o "+galpao+" Nivel Vermelho "+ vermelho);
		
		}
	}

}
