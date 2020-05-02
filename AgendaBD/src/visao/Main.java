package visao;

import java.util.Scanner;
import controle.ControlaAgenda;

public class Main {

	public static void main (String[] args) {
		
		ControlaAgenda controlador = new ControlaAgenda();
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		int opcao = 0;
		
		System.out.println("Bem Vindo(a) à agenda!\n\nDigite a opção desejada:\n 1 para ADICIONAR contato\n 2 para ALTERAR contato\n 3 para EXCLUIR contato\n 4 para LISTAR os contatos cadastrados\n Qualquer outro número para ENCERRAR");
		opcao = scanner.nextInt();
				
		switch (opcao) { 
		
		case 1:
		
		System.out.println("Digite o nome do contato: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o telefone do contato: ");
		String telefone = scanner.nextLine();
		
		System.out.println("Digite o email do contato: ");
		String email = scanner.nextLine();
		
			if (controlador.cadastrarContato(nome, telefone, email)) {
			System.out.println("Contato cadastrado com sucesso!");
			} else {
			System.out.println("Falha em cadastrar novo contato");
			}
		controlador.fecharConexao();
		
		case 2:
			
			System.out.println("Digite o id do contato que deseja alterar: ");
			int id = scanner.nextInt();
			
			System.out.println("Digite o nome do contato: ");
			String nome2 = scanner.nextLine();
			
			System.out.println("Digite o telefone do contato: ");
			String telefone2 = scanner.nextLine();
			
			System.out.println("Digite o email do contato: ");
			String email2 = scanner.nextLine();
			
				if (controlador.alterarContato(id, nome2, telefone2, email2)) {
				System.out.println("Contato alterado com sucesso!");
				} else {
				System.out.println("Falha em alterar contato");
				}
			controlador.fecharConexao();
		
		case 3:
		
			System.out.println("Digite o id do contato que deseja EXCLUIR: ");
			int id3 = scanner.nextInt();
		
			if (controlador.removerContato(id3)) {
				System.out.println("Contato EXCLUÍDO com sucesso!");
				} else {
				System.out.println("Falha em alterar contato");
				}
			controlador.fecharConexao();
	
		case 4:
		
			controlador.obterContatos();
			controlador.fecharConexao();
			
		default:
			
			System.out.println("Obrigado por usar a agenda!\nTenha um bom dia!:)");
					
		}
	}	
}
