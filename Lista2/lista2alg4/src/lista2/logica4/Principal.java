package lista2.logica4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um algoritmo que leia o nome do cliente, um c�digo de matr�cula.
		 * A matr�cula estar� no formato CCAAMMFFG.
		 * CC: C�digo de duas letras equivalente � concession�ria que o cliente est� associado;
		 * AA: Dois d�gitos equivalentes ao ano da data de matr�cula do cliente;
		 * MM: Dois d�gitos equivalentes ao m�s da data de matr�cula do cliente;
		 * FF: Equivale ao n�vel da categoria do cliente (00 para Bronze, 01 para Prata, 02 para Ouro, 03 para Diamante);
		 * G: G�nero do cliente (M para Masculino, F para Feminino, N para N�o definido, O para Outro).
		 * Depois utilize substring para tirar o ano da data de matr�cula do cliente.
		 * Se o ano for abaixo de 22, mostre uma mensagem: �N�o � desse ano essa matricula�. 
		 */
		
		String matricula;
		int ano;
		
		matricula=JOptionPane.showInputDialog("Entre com os dados da matricula no seguinte formato:CCAAMMFFG \n "
				+ "CC: C�digo de duas letras equivalente � concession�ria que o cliente est� associado; \n"
				+ "AA: Dois d�gitos equivalentes ao ano da data de matr�cula do cliente; \n"
				+ "MM: Dois d�gitos equivalentes ao m�s da data de matr�cula do cliente; \n"
				+ "FF: Equivale ao n�vel da categoria do cliente (00 para Bronze, 01 para Prata, 02 para Ouro, 03 para Diamante);\n"
				+ "G: G�nero do cliente (M para Masculino, F para Feminino, N para N�o definido, O para Outro).\n");
		
		
		ano= Integer.parseInt(matricula.substring(2,4));
		if(ano <22) {
			JOptionPane.showMessageDialog(null,"N�o e desse ano essa matricula");
		}else {
			JOptionPane.showMessageDialog(null,"Matricula: "+ matricula);
		}
		
		
	}

}
