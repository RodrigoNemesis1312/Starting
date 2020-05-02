package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Contato;

public class ContatoDao {

	private Connection conexao;
	
	public ContatoDao() {
		conexao = FabricaConexao.getConexao();
	}
	
	public void encerrarConexao() {
		
		try {
			conexao.close();
				
		} catch (SQLException e) {
			System.out.println("Problemas ao encerrar conexão");
			e.printStackTrace();
		}
	}
	
	public boolean adicionarContato (Contato c) {
		
		String sql = "INSERT INTO contato (nome, telefone, email) VALUES (?, ?, ?)";
		
		PreparedStatement stmt;
		
		try {
			stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getTelefone());
			stmt.setString(3, c.getEmail());
			
			stmt.execute();
			
			stmt.close();
			
			return true;
		
		} catch (SQLException e) {
			System.out.println("Problemas com a execução do comando");
			e.printStackTrace();
			
			return false;
		}
	}
	public boolean removerContato (Contato c) {
		
		String sql = "DELETE FROM contato WHERE id = ?";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, 1);
			
			stmt.execute();
			
			stmt.close();
			
			return true;
		
		} catch (SQLException e) {
			System.out.println("Problemas com a execução do comando");
			e.printStackTrace();
			
			return false;
		}
		
	}
	public boolean alterarContato (Contato c) {
		
		String sql = "UPDATE contato SET nome = ?, telefone = ?, email = ? WHERE id = ?";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getTelefone());
			stmt.setString(3, c.getEmail());
			stmt.setInt(4, c.getId());
			
			stmt.execute();
			
			stmt.close();
			
			return true;
			
		} catch (SQLException e) {
			System.out.println("Problemas com a execução do comando");
			e.printStackTrace();
			
			return false;
		} 

	}
	
	public ArrayList<Contato> listarContatos(){
		
		String sql = "SELECT * FROM contato";
		
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				Contato c = new Contato();
				
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setTelefone(rs.getString("telefone"));
				c.setEmail(rs.getString("email"));
				
				contatos.add(c);
			}
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println("Problemas com a execução do comando");
			e.printStackTrace();
			
		}
		return contatos;
	}
	
	public Contato buscarContato(int id) {
	
		Contato c = new Contato();
		
		String sql  = "SELECT * FROM contato WHERE id = ?";
		
		try {
		
			PreparedStatement stmt = conexao.prepareStatement(sql);
		
			stmt.setInt (1, id);
		
			ResultSet rs = stmt.executeQuery();
		
			while (rs.next()) {
					
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setTelefone(rs.getString("telefone"));
				c.setEmail(rs.getString("email"));
			
			}
		
		rs.close();
		stmt.close();
		
		return c;
		
		} catch (SQLException e) {
			System.out.println("Problemas com a execução do comando");
			e.printStackTrace();
			
			return null;
		}
	}
}


