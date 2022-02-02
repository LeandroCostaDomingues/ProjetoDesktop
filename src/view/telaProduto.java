package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class telaProduto extends JFrame {

	private JPanel contentPane;
	private JTable tableProdutos;
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
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaProduto frame = new telaProduto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
		);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Consulta Produtos", null, scrollPane, null);
		
		tableProdutos = new JTable();
		scrollPane.setViewportView(tableProdutos);
		
		JPanel panelCadastros = new JPanel();
		tabbedPane.addTab("Cadastros", null, panelCadastros, null);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		panelCadastros.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nome:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		panelCadastros.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pre\u00E7o:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		panelCadastros.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Quanidade");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		panelCadastros.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panelCadastros.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		panelCadastros.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_9);
		
		textField_10 = new JTextField();
		panelCadastros.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_7);
		
		textField_9 = new JTextField();
		panelCadastros.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_6);
		
		textField_8 = new JTextField();
		panelCadastros.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		panelCadastros.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_10);
		
		textField = new JTextField();
		panelCadastros.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelCadastros.add(lblNewLabel_5);
		
		textField_11 = new JTextField();
		panelCadastros.add(textField_11);
		textField_11.setColumns(10);
		contentPane.setLayout(gl_contentPane);
	}
}
