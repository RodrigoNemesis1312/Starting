package controle;

import java.util.ArrayList;
import modelo.Contato;
import modelo.dao.ContatoDao;

public class ControlaAgenda {

	ContatoDao dao;
	
	public ControlaAgenda() {
		
		dao = new ContatoDao();
		
	}
	
	public boolean cadastrarContato (String nome, String telefone, String email) {
		
		Contato contato = new Contato();
		
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		
		return dao.adicionarContato(contato);
		
	}
	
	public boolean alterarContato (int id, String nome, String telefone, String email) {
	
		Contato contato = new Contato();
		
		contato.setId(id);
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
	
		return dao.alterarContato(contato);
		
	}
	
	public boolean removerContato (int id) {
		
		Contato contato = new Contato();
		
		contato.setId(id);
	
		return dao.removerContato(contato);
		
	}
	
	public String obterContatos() {
		
		ArrayList<Contato> listaContatos = dao.listarContatos();
		
		String contatos = "";
		
		for (Contato c : listaContatos) {
			contatos += c.getNome() + " | " + c.getTelefone() + " | " + c.getEmail() + "\n";
			
		}
		return contatos;
	}
	
	public void fecharConexao() {
		
		dao.encerrarConexao();
		
	}
}
