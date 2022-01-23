package sistema_de_venda.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;

public class ViewClientes {

	private static final String DefaultTableModel = null;
	private JFrame frame;
	private JTable tableCliente;
	private JTable tableConsulta;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

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
		frame.getContentPane().setBackground(Color.WHITE);

		JPanel panel_Cliente = new JPanel();
		panel_Cliente.setForeground(new Color(0, 0, 51));
		panel_Cliente.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 51), new Color(0, 0, 51), new Color(0, 0, 51), new Color(0, 0, 51)));
		panel_Cliente.setBackground(new Color(0, 0, 51));

		JLabel lblNewLabel = new JLabel("Cadastro De Clientes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(UIManager.getBorder("ToggleButton.border"));
		tabbedPane.setBackground(new Color(128, 128, 128));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 0, 51));
		panel.setForeground(new Color(0, 0, 0));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_Cliente, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
				.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_Cliente, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
		
		JButton btnNewButtonSalvar = new JButton("Salvar");
		btnNewButtonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonSalvar.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(btnNewButtonSalvar);
		
		JButton btnNewButtonNovo = new JButton("Novo");
		btnNewButtonNovo.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(btnNewButtonNovo);
		
		JButton btnNewButtonExcluir = new JButton("Excluir");
		btnNewButtonExcluir.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(btnNewButtonExcluir);
		
		JButton btnNewButton_3 = new JButton("Salvar");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Salvar");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Salvar");
		btnNewButton_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(btnNewButton_5);
		
		JScrollPane scrollPaneConsultaCliente = new JScrollPane();
		scrollPaneConsultaCliente.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		scrollPaneConsultaCliente.setToolTipText("");
		scrollPaneConsultaCliente.setEnabled(false);
		tabbedPane.addTab("Consulta De Cliente", null, scrollPaneConsultaCliente, null);
		tabbedPane.setBackgroundAt(0, new Color(0, 0, 0));
		tabbedPane.setForegroundAt(0, new Color(0, 0, 0));
		
		tableConsulta = new JTable();
		tableConsulta.setFont(new Font("Tahoma", Font.BOLD, 10));
		tableConsulta.setFillsViewportHeight(true);
		tableConsulta.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "CPF / CNPJ", "RG", "Bairro", "CEP", "N\u00B0", "Logradouro", "Cidade", "Estado", "Complemento"
			}
		));
		scrollPaneConsultaCliente.setViewportView(tableConsulta);
		
		JPanel panel_1DadosPessoais = new JPanel();
		panel_1DadosPessoais.setForeground(new Color(0, 0, 0));
		panel_1DadosPessoais.setBackground(new Color(0, 0, 51));
		tabbedPane.addTab("Dados Pessoais ", null, panel_1DadosPessoais, null);
		
		JLabel lblNewLabelCodigo = new JLabel("Codigo:");
		lblNewLabelCodigo.setBounds(6, 43, 108, 29);
		lblNewLabelCodigo.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelCodigo.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabelCodigo.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabelNome = new JLabel("Nome:");
		lblNewLabelNome.setBounds(6, 83, 108, 27);
		lblNewLabelNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelNome.setForeground(new Color(255, 255, 255));
		lblNewLabelNome.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabelEmail = new JLabel("E-mail:");
		lblNewLabelEmail.setBounds(6, 163, 108, 27);
		lblNewLabelEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelEmail.setForeground(new Color(255, 255, 255));
		lblNewLabelEmail.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabelCep = new JLabel("CEP:");
		lblNewLabelCep.setBounds(6, 283, 108, 27);
		lblNewLabelCep.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelCep.setForeground(new Color(255, 255, 255));
		lblNewLabelCep.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabelBairro = new JLabel("Bairro:");
		lblNewLabelBairro.setBounds(6, 363, 108, 27);
		lblNewLabelBairro.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelBairro.setForeground(new Color(255, 255, 255));
		lblNewLabelBairro.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabelRg = new JLabel("RG:");
		lblNewLabelRg.setBounds(6, 403, 108, 21);
		lblNewLabelRg.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelRg.setForeground(new Color(255, 255, 255));
		lblNewLabelRg.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabelCpf = new JLabel("CPF:");
		lblNewLabelCpf.setBounds(6, 443, 108, 27);
		lblNewLabelCpf.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelCpf.setForeground(new Color(255, 255, 255));
		lblNewLabelCpf.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabelEndereco = new JLabel("Endere\u00E7o:");
		lblNewLabelEndereco.setBounds(6, 203, 108, 26);
		lblNewLabelEndereco.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelEndereco.setForeground(new Color(255, 255, 255));
		lblNewLabelEndereco.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabelCelular = new JLabel("Celular:");
		lblNewLabelCelular.setBounds(6, 123, 108, 21);
		lblNewLabelCelular.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelCelular.setForeground(Color.WHITE);
		lblNewLabelCelular.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabelCidade = new JLabel("Cidade:");
		lblNewLabelCidade.setBounds(6, 243, 108, 27);
		lblNewLabelCidade.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelCidade.setForeground(Color.WHITE);
		lblNewLabelCidade.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabelUf = new JLabel("UF:");
		lblNewLabelUf.setBounds(6, 323, 108, 27);
		lblNewLabelUf.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelUf.setForeground(Color.WHITE);
		lblNewLabelUf.setFont(new Font("Arial", Font.BOLD, 18));
		panel_1DadosPessoais.setLayout(null);
		panel_1DadosPessoais.add(lblNewLabelCpf);
		panel_1DadosPessoais.add(lblNewLabelRg);
		panel_1DadosPessoais.add(lblNewLabelNome);
		panel_1DadosPessoais.add(lblNewLabelEmail);
		panel_1DadosPessoais.add(lblNewLabelEndereco);
		panel_1DadosPessoais.add(lblNewLabelCidade);
		panel_1DadosPessoais.add(lblNewLabelCep);
		panel_1DadosPessoais.add(lblNewLabelUf);
		panel_1DadosPessoais.add(lblNewLabelBairro);
		panel_1DadosPessoais.add(lblNewLabelCodigo);
		panel_1DadosPessoais.add(lblNewLabelCelular);
		
		textField = new JTextField();
		textField.setBackground(new Color(230, 230, 250));
		textField.setBounds(110, 43, 231, 20);
		panel_1DadosPessoais.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(230, 230, 250));
		textField_1.setColumns(10);
		textField_1.setBounds(110, 83, 231, 20);
		panel_1DadosPessoais.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(230, 230, 250));
		textField_2.setColumns(10);
		textField_2.setBounds(110, 123, 231, 20);
		panel_1DadosPessoais.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(230, 230, 250));
		textField_3.setColumns(10);
		textField_3.setBounds(110, 163, 231, 20);
		panel_1DadosPessoais.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(230, 230, 250));
		textField_4.setColumns(10);
		textField_4.setBounds(110, 203, 231, 20);
		panel_1DadosPessoais.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(230, 230, 250));
		textField_5.setColumns(10);
		textField_5.setBounds(110, 243, 231, 20);
		panel_1DadosPessoais.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(230, 230, 250));
		textField_6.setColumns(10);
		textField_6.setBounds(110, 283, 231, 20);
		panel_1DadosPessoais.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(230, 230, 250));
		textField_7.setColumns(10);
		textField_7.setBounds(110, 323, 231, 20);
		panel_1DadosPessoais.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBackground(new Color(230, 230, 250));
		textField_8.setColumns(10);
		textField_8.setBounds(110, 363, 231, 20);
		panel_1DadosPessoais.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(230, 230, 250));
		textField_9.setColumns(10);
		textField_9.setBounds(110, 403, 231, 20);
		panel_1DadosPessoais.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBackground(new Color(230, 230, 250));
		textField_10.setColumns(10);
		textField_10.setBounds(110, 449, 231, 20);
		panel_1DadosPessoais.add(textField_10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\leonay\\Pictures\\Camera Roll\\telas cadastro-cadastro.png"));
		lblNewLabel_1.setBounds(-11, -79, 1100, 890);
		panel_1DadosPessoais.add(lblNewLabel_1);
		GroupLayout gl_panel_Cliente = new GroupLayout(panel_Cliente);
		gl_panel_Cliente.setHorizontalGroup(
			gl_panel_Cliente.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
		);
		gl_panel_Cliente.setVerticalGroup(
			gl_panel_Cliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Cliente.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_Cliente.setLayout(gl_panel_Cliente);
		frame.getContentPane().setLayout(groupLayout);
	}
}
