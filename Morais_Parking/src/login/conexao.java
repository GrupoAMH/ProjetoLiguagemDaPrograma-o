package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	public static Connection faz_conexao() throws SQLException {
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_senhas", "root", "123456789");
			
			
			
			
			
			
			
			
			} catch (ClassNotFoundException e) {
				throw new SQLException(e.getException());
				
			}
			
		}

		public java.sql.Connection getConnection() {
			return null;
		}
	}
