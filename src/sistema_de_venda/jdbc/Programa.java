package sistema_de_venda.jdbc;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		try {
			new ConexaoBanco().conexao();
			

		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Erro De Conexão"+e.getStackTrace());
			
		}

	}

}
