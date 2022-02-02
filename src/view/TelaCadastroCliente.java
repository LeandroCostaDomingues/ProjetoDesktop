package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import cliente.dao.ClienteDao;
import entidade.cliente.Cliente;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaCadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable tableCliente;
	private JTextField textField_codigo;
	private JTextField textField_nome;
	private JTextField textField_telefone;
	private JTextField textField_rg;
	private JTextField textField_cidade;
	private JTextField textField_logradouro;
	private JTextField textField_numero;
	private JTextField textField_bairro;
	private JTextField textField_complemento;
	private JTextField textField_celular;

	private JTextField textField_email;
	private JTextField textField_cep;
	private JTextField textField_cpf;

	public void listarNaTabela() {
		ClienteDao dao = new ClienteDao();
		List<Cliente> lista = dao.listarCliente();
		DefaultTableModel dtm = (DefaultTableModel) tableCliente.getModel();
		dtm.setNumRows(0);
		for (Cliente c : lista) {

			dtm.addRow(new Object[] {

					c.getCodigo(), c.getNome(), c.getEmail(), c.getTefefone(), c.getCelular(), c.getRg(), c.getCpf(),
					c.getLogradouro(), c.getEstado(), c.getCidade(), c.getCep(), c.getBairro(), c.getNumero(),
					c.getComplemento(),

			});

		

			textField_codigo.requestFocus();
		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public TelaCadastroCliente() throws ParseException {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {

				listarNaTabela(); // listar assim que o windows iniciar

			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 534);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(
				new SoftBevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		setContentPane(contentPane);

		JPanel panelCadastroCliente = new JPanel();
		panelCadastroCliente.setBackground(Color.WHITE);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		textField = new JTextField();
		textField.setColumns(10);
		JComboBox comboBox_estado = new JComboBox();
		comboBox_estado.setMaximumRowCount(15);
		comboBox_estado.setModel(new DefaultComboBoxModel(
				new String[] { "", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA",
						"PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "SC", "SE", "SP", "TO" }));
		comboBox_estado.setBounds(692, 176, 119, 22);

		JButton btnNewButton = new JButton("Pesquisar");

	// botão novo tava aki
		JButton btnNewButton_excluir = new JButton("Excluir");
		btnNewButton_excluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ClienteDao excluir = new ClienteDao();
				Cliente obj = new Cliente();

				obj.setCodigo(Integer.parseInt((textField_codigo.getText())));

				excluir.excluirCliente(obj);
			}
		});
		btnNewButton_excluir.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnNewButton_imprimir = new JButton("Imprimir");
		btnNewButton_imprimir.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton btnNewButton_salva = new JButton("salvar");
		btnNewButton_salva.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_salva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cliente obj = new Cliente();
				obj.setCodigo(Integer.parseInt(textField_codigo.getText()));
				obj.setBairro(textField_bairro.getText());
				obj.setCelular(textField_celular.getText());
				obj.setCep(textField_cep.getText());
				obj.setCidade(textField_cidade.getText());
				obj.setComplemento(textField_complemento.getText());
				obj.setCpf(textField_cpf.getText());
				obj.setEmail(textField_email.getText());
				obj.setEstado(comboBox_estado.getSelectedItem().toString());
				obj.setLogradouro(textField_logradouro.getText());
				obj.setNome(textField_nome.getText());
				obj.setNumero(Integer.parseInt(textField_numero.getText()));
				obj.setRg(textField_rg.getText());
				obj.setTefefone(textField_telefone.getText());
				ClienteDao salvar = new ClienteDao();
				salvar.CadastrarClientes(obj);

			}
		});
		JPanel panelCadastros = new JPanel();
		panelCadastros.setBorder(UIManager.getBorder("FileChooser.listViewBorder"));
		panelCadastros.setForeground(Color.WHITE);
		panelCadastros.setBackground(Color.WHITE);
		tabbedPane.addTab("Cadastrar Cliente", null, panelCadastros, null);

		JButton btnNewButton_alterar = new JButton("Alterar");
		btnNewButton_alterar.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});

		JButton btnNewButton_novo = new JButton("Novo");
		btnNewButton_novo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 

				textField_codigo.setText("");
				textField_nome.setText("");
				textField_telefone.setText("");
				textField_rg.setText("");
				textField_cidade.setText("");
				textField_numero.setText(""); // PARA LIMPAR OS CAMPOS
				textField_bairro.setText("");
				textField_complemento.setText("");
				textField_celular.setText("");
				textField_logradouro.setText("");
				textField_email.setText("");
				textField_cep.setText("");
				textField_cpf.setText("");
				comboBox_estado.setSelectedItem("");
				textField_codigo.requestFocus();
				
				
				
				
				
			}
		});
		btnNewButton_novo.setFont(new Font("Tahoma", Font.PLAIN, 12));

		// tava aqui os editar

		btnNewButton_alterar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panelCadastroCliente, GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnNewButton).addGap(18)
						.addComponent(btnNewButton_salva).addGap(37).addComponent(btnNewButton_alterar).addGap(44)
						.addComponent(btnNewButton_novo).addGap(40).addComponent(btnNewButton_excluir)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnNewButton_imprimir)
						.addContainerGap(137, Short.MAX_VALUE))
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panelCadastroCliente, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addGap(2)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton).addComponent(btnNewButton_excluir)
								.addComponent(btnNewButton_novo).addComponent(btnNewButton_alterar)
								.addComponent(btnNewButton_salva).addComponent(btnNewButton_imprimir))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)));

		btnNewButton_alterar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int resp = JOptionPane.showInternalConfirmDialog(null, "Deseja Fazer Esta Alteração?");
				if (resp == 0) {

					Cliente obj = new Cliente();
					obj.setCodigo(Integer.parseInt(textField_codigo.getText()));
					obj.setBairro(textField_bairro.getText());
					obj.setCelular(textField_celular.getText());
					obj.setCep(textField_cep.getText());
					obj.setCidade(textField_cidade.getText());
					obj.setComplemento(textField_complemento.getText());
					obj.setCpf(textField_cpf.getText());
					obj.setEmail(textField_email.getText());
					obj.setEstado(comboBox_estado.getSelectedItem().toString());
					obj.setLogradouro(textField_logradouro.getText());
					obj.setNome(textField_nome.getText());
					obj.setNumero(Integer.parseInt(textField_numero.getText()));
					obj.setRg(textField_rg.getText());
					obj.setTefefone(textField_telefone.getText());
					ClienteDao alterar = new ClienteDao();
					alterar.alterarCliente(obj);

				}
				if (resp == 1) {

				}

			}
		});

		// estava aqui o painel de cadastros
		JLabel lblNewLabel_1 = new JLabel("Codigo:");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(0, 11, 68, 22);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		textField_codigo = new JTextField();
		textField_codigo.setBounds(72, 11, 86, 20);
		textField_codigo.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(0, 53, 68, 22);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		textField_nome = new JTextField();
		textField_nome.setBounds(72, 55, 154, 20);
		textField_nome.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Celular:");
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setBounds(270, 51, 71, 22);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));

		JLabel lblNewLabel_1_1_1 = new JLabel("Telefone:");
		lblNewLabel_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1.setBounds(594, 51, 94, 22);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		textField_telefone = new JTextField();
		textField_telefone.setBounds(692, 51, 119, 20);
		textField_telefone.setColumns(10);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1_1.setBounds(0, 97, 68, 24);
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelCadastros.setLayout(null);
		panelCadastros.add(lblNewLabel_1);
		panelCadastros.add(textField_codigo);
		panelCadastros.add(lblNewLabel_1_1_1_1);
		panelCadastros.add(lblNewLabel_1_1);
		panelCadastros.add(textField_nome);
		panelCadastros.add(lblNewLabel_2);
		panelCadastros.add(lblNewLabel_1_1_1);
		panelCadastros.add(textField_telefone);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("RG:");
		lblNewLabel_1_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1.setBounds(270, 93, 68, 24);
		panelCadastros.add(lblNewLabel_1_1_1_1_1);

		textField_rg = new JTextField();
		textField_rg.setColumns(10);
		textField_rg.setBounds(326, 100, 208, 17);
		panelCadastros.add(textField_rg);

		JLabel lblNewLabel_1_1_2 = new JLabel("Cidade:");
		lblNewLabel_1_1_2.setBackground(Color.BLACK);
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_2.setBounds(0, 173, 86, 22);
		panelCadastros.add(lblNewLabel_1_1_2);

		textField_cidade = new JTextField();
		textField_cidade.setColumns(10);
		textField_cidade.setBounds(82, 175, 154, 20);
		panelCadastros.add(textField_cidade);

		JLabel lblNewLabel_1_1_3 = new JLabel("CEP:");
		lblNewLabel_1_1_3.setBackground(Color.BLACK);
		lblNewLabel_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_3.setBounds(270, 173, 68, 22);
		panelCadastros.add(lblNewLabel_1_1_3);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("Estado:");
		lblNewLabel_1_1_2_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_2_1.setBounds(594, 180, 86, 22);
		panelCadastros.add(lblNewLabel_1_1_2_1);
		panelCadastros.add(comboBox_estado);
		// aqui

		JLabel lblNewLabel_1_1_2_2 = new JLabel("Logradouro:");
		lblNewLabel_1_1_2_2.setBackground(Color.BLACK);
		lblNewLabel_1_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_2_2.setBounds(0, 234, 125, 22);
		panelCadastros.add(lblNewLabel_1_1_2_2);

		textField_logradouro = new JTextField();
		textField_logradouro.setColumns(10);
		textField_logradouro.setBounds(123, 234, 154, 20);
		panelCadastros.add(textField_logradouro);

		JLabel lblNewLabel_1_1_2_3 = new JLabel("N\u00B0");
		lblNewLabel_1_1_2_3.setBackground(Color.BLACK);
		lblNewLabel_1_1_2_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_2_3.setBounds(326, 234, 86, 22);
		panelCadastros.add(lblNewLabel_1_1_2_3);

		textField_numero = new JTextField();
		textField_numero.setColumns(10);
		textField_numero.setBounds(408, 236, 154, 20);
		panelCadastros.add(textField_numero);

		JLabel lblNewLabel_1_1_2_4 = new JLabel("Bairro:");
		lblNewLabel_1_1_2_4.setBackground(Color.BLACK);
		lblNewLabel_1_1_2_4.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_2_4.setBounds(594, 236, 86, 22);
		panelCadastros.add(lblNewLabel_1_1_2_4);

		textField_bairro = new JTextField();
		textField_bairro.setColumns(10);
		textField_bairro.setBounds(676, 238, 154, 20);
		panelCadastros.add(textField_bairro);

		JLabel lblNewLabel_1_1_2_5 = new JLabel("Complemento:");
		lblNewLabel_1_1_2_5.setBackground(Color.BLACK);
		lblNewLabel_1_1_2_5.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_2_5.setBounds(1, 284, 153, 22);
		panelCadastros.add(lblNewLabel_1_1_2_5);

		textField_complemento = new JTextField();
		textField_complemento.setColumns(10);
		textField_complemento.setBounds(164, 288, 154, 20);
		panelCadastros.add(textField_complemento);

		textField_celular = new JFormattedTextField(new MaskFormatter("(##) # ########"));
		textField_celular.setBounds(357, 53, 177, 20);
		panelCadastros.add(textField_celular);
		textField_celular.setColumns(10);

		JLabel lblNewLabel_1_1_4 = new JLabel("Email");
		lblNewLabel_1_1_4.setBackground(Color.BLACK);
		lblNewLabel_1_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_4.setBounds(585, 97, 68, 22);
		panelCadastros.add(lblNewLabel_1_1_4);

		textField_email = new JTextField();
		textField_email.setColumns(10);
		textField_email.setBounds(657, 99, 154, 20);
		panelCadastros.add(textField_email);

		textField_cep = new JFormattedTextField(new MaskFormatter("#####-###"));
		textField_cep.setBounds(338, 173, 184, 20);
		panelCadastros.add(textField_cep);
		textField_cep.setColumns(10);

		textField_cpf = new JFormattedTextField(new MaskFormatter("#########-##"));
		textField_cpf.setBounds(72, 102, 154, 20);
		panelCadastros.add(textField_cpf);
		textField_cpf.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("Consulta Cliente", null, scrollPane, null);

		tableCliente = new JTable();
		tableCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				textField_codigo.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 0).toString());
				textField_nome.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 1).toString());
				textField_rg.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 5).toString());
				textField_cpf.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 6).toString());
				textField_email.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 2).toString());
				textField_telefone.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 3).toString());
				textField_celular.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 4).toString());
				textField_cep.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 10).toString());
				textField_logradouro.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 7).toString());
				textField_numero.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 12).toString());
				textField_complemento.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 13).toString());
				textField_bairro.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 11).toString());
				textField_cidade.setText(tableCliente.getValueAt(tableCliente.getSelectedRow(), 9).toString());
				comboBox_estado.setSelectedItem(tableCliente.getValueAt(tableCliente.getSelectedRow(), 8).toString());
				// editar Cliente

				// PEGAR O QUE FOI SELECIONADO PELO USUARIO

			}
		});
		tableCliente.setBackground(new Color(255, 255, 204));
		tableCliente.setSurrendersFocusOnKeystroke(true);
		tableCliente.setBorder(UIManager.getBorder("ScrollPane.border"));
		tableCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tableCliente.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Codigo", "Nome", "E-MAIL", "Telefone", "Celular", "RG", "CPF", "Logradouro", "Estado",
						"Cidade", "CEP", "Bairro", "N\u00B0", "Complemento" }));
		scrollPane.setViewportView(tableCliente);
		JLabel lblNewLabel = new JLabel("Cadastro De Cliente");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		GroupLayout gl_panelCadastroCliente = new GroupLayout(panelCadastroCliente);
		gl_panelCadastroCliente.setHorizontalGroup(gl_panelCadastroCliente.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE));
		gl_panelCadastroCliente.setVerticalGroup(gl_panelCadastroCliente.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE));
		panelCadastroCliente.setLayout(gl_panelCadastroCliente);
		contentPane.setLayout(gl_contentPane);

	}
}
