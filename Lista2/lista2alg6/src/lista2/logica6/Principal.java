package lista2.logica6;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Considere os seguintes arquivos digitados:
		 * base_dados.xlsx
		 * ccode39.zip
		 * Logos_concessionarias.zip
		 * modelo_dicionario_dados.docx
		 * modelo_relatorio.png
		 * plantas_evento.zip
		 * fotos.zip
		 * Para cada extensão mostre qual programa é utilizado:
		 * Xlsx – excel 
		 * Zip – winzip 
		 * Docx – word 
		 * Png – Paint 
		 */
		
		String arquivo,xlsx,zip,docx,png;
		
		arquivo=JOptionPane.showInputDialog("Digite um dos seguintes arquivos: \r\n"
				+ "base_dados.xlsx\r\n"
				+ "ccode39.zip\r\n"
				+ "Logos_concessionarias.zip\r\n"
				+ "modelo_dicionario_dados.docx\r\n"
				+ "modelo_relatorio.png\r\n"
				+ "plantas_evento.zip\r\n"
				+ "fotos.zip");
		xlsx="Microsoft Excel";
		zip="Winzip";
		docx="Microsoft Word";
		png="Paint";
		JOptionPane.showMessageDialog(null, arquivo);
		
		if (arquivo.contains(".xlsx")) {
			
			JOptionPane.showMessageDialog(null,"Para abrir e ultilizado o: "+ xlsx);
			
		}else if(arquivo.contains(".zip")){
			
			JOptionPane.showMessageDialog(null,"Para abrir e ultilizado o: "+ zip);
			
		}else if(arquivo.contains(".docx")){
			
			JOptionPane.showMessageDialog(null,"Para abrir e ultilizado o: "+ docx);
			
		}else if(arquivo.contains(".png")){
			
			JOptionPane.showMessageDialog(null,"Para abrir e ultilizado o: "+ png);
			
		}
		
	}

}
