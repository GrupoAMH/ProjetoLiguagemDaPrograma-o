package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Tela_cadastro_Funcionario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfveiculo;
	private JTextField tfnome;
	private JPasswordField tfsenha;
	private JTextField tfmatricula;
	private JTextField tftelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_cadastro_Funcionario frame = new Tela_cadastro_Funcionario();
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
	public Tela_cadastro_Funcionario() {
		setTitle("Cadastro Funcion\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID Ve\u00EDculo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 140, 96, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(223, 192, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome Completo");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 83, 102, 18);
		contentPane.add(lblNewLabel_1_1);
		
		tfveiculo = new JTextField();
		tfveiculo.setBounds(10, 163, 96, 19);
		contentPane.add(tfveiculo);
		tfveiculo.setColumns(10);
		
		tfnome = new JTextField();
		tfnome.setBounds(10, 111, 396, 19);
		contentPane.add(tfnome);
		tfnome.setColumns(10);
		
		tfsenha = new JPasswordField();
		tfsenha.setBounds(223, 215, 96, 19);
		contentPane.add(tfsenha);
		
		JButton btnNewButton = new JButton("CONFIRMAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				Connection con = conexao.faz_conexao();
				String sql = "insert into cadastro_funcionario(nome, idveiculo, matricula, telefone, senha) values ('?','?','?','?','?')";
				
				PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
				
				stmt.setString(1, tfnome.getText());
				stmt.setString(2, tfveiculo.getText());
				stmt.setString(3, tftelefone.getText());
				stmt.setString(4, tfmatricula.getText());
				stmt.setString(5, new String(tfsenha.getPassword()));
				
				stmt.execute();
				stmt.close();
				con.close();
				
				JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!");
				
				
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(10, 261, 96, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("Matr\u00EDcula");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 192, 96, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Telefone");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(223, 140, 96, 13);
		contentPane.add(lblNewLabel_1_3);
		
		tfmatricula = new JTextField();
		tfmatricula.setBounds(10, 215, 96, 19);
		contentPane.add(tfmatricula);
		tfmatricula.setColumns(10);
		
		tftelefone = new JTextField();
		tftelefone.setBounds(223, 163, 96, 19);
		contentPane.add(tftelefone);
		tftelefone.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("MORAIS PARKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 6, 193, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("CADASTRO FUNCION\u00C1RIO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 29, 205, 18);
		contentPane.add(lblNewLabel_3);
	}
}
