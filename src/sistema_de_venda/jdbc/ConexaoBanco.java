package sistema_de_venda.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConexaoBanco {
	public Connection pegarConexao() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/sistemasdevendas", "root",null);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " Erro De Conexão " + e);

		}
		return null;
	}
}
