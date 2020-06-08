package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Tela_de_acesso extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField matricula;
	private JPasswordField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_de_acesso frame = new Tela_de_acesso();
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
	public Tela_de_acesso() {
		setResizable(false);
		setTitle("Login Funcionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 111, 82, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 177, 82, 26);
		contentPane.add(lblNewLabel_1);
		
		matricula = new JTextField();
		matricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		matricula.setBounds(102, 111, 146, 28);
		contentPane.add(matricula);
		matricula.setColumns(10);
		
		senha = new JPasswordField();
		senha.setBounds(102, 176, 146, 26);
		contentPane.add(senha);
		
		JButton btnEntrar = new JButton("Login");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					Connection con = conexao.faz_conexao();
				
				
					
					
					String sql = "select *from dados_senhas where usuario=? and senha=?";
				
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, matricula.getText());
					stmt.setString(2, new String(senha.getPassword()));
					
					ResultSet rs = stmt.executeQuery();
					
					if(rs.next()) {
						
						Tela_cadastro_Funcionario exibir = new Tela_cadastro_Funcionario();
						exibir.setVisible(true);
						
						setVisible(false);
						
					} else {
						JOptionPane.showMessageDialog(null, "Esse usuário não existe");
						
					}
					
					stmt.close();
					con.close();
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEntrar.setBounds(102, 230, 146, 32);
		contentPane.add(btnEntrar);
	}

}
