package classes_de_conexoes;

import java.sql.Connection; 
import java.sql.SQLException; 
public class TestaConexao {     
    public static void main(String[] args) throws SQLException {
         Connection connection = new Conexao().getConnection();
         System.out.println("Conex�o aberta!");
         
         
         
         connection.close();
     }
}