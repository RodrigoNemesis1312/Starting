package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public static Connection getConexao() {
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection conexao = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; databaseName=agenda; user=;password=;");
			
			return conexao;
		
		} catch (ClassNotFoundException e) {
			
			System.out.println("Driver não encontrado");
			e.printStackTrace();
			return null;
		
		} catch (SQLException e) {
			
			System.out.println("Impossivel conectar ao banco");
			e.printStackTrace();
			return null;
		}
		
	}
	
}
