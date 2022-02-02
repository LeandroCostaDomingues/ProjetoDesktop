package sistema_de_venda.jdbc;

import javax.swing.JOptionPane;

import view.TelaCadastroCliente;

public class Programa {

	public static void main(String[] args) {
		try {
			new ConexaoBanco().pegarConexao();
			
			JOptionPane.showMessageDialog(null, "Conectado");
			TelaCadastroCliente tl = new TelaCadastroCliente();
			tl.setVisible(true);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro De Conexão"+e.getStackTrace());
			
		}

	}

}
