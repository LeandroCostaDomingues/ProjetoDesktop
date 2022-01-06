package sistema_de_venda.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;

public class ViewClientes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewClientes window = new ViewClientes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 789, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLACK);
		panel1.setBounds(0, 0, 773, 483);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblcadastroCliente = new JLabel("Cadastro De Clientes");
		lblcadastroCliente.setForeground(Color.WHITE);
		lblcadastroCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblcadastroCliente.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblcadastroCliente.setBackground(Color.DARK_GRAY);
		lblcadastroCliente.setBounds(0, 11, 763, 30);
		panel1.add(lblcadastroCliente);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 52, 773, 366);
		panel1.add(panel2);
		panel2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 763, 366);
		panel2.add(tabbedPane);
		
		JPanel panel_dados_pessoais = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel_dados_pessoais, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
	}
}
