package classes_de_conexoes;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class Conexao {
	public static Connection faz_conexao() throws SQLException{
		
		
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/projetoestacionamento", "root", "123456789");
		
		
		
		
		
		
		
		
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
			
		}
		
	}

	public java.sql.Connection getConnection() {
		return null;
	}
}
