package principal;

import java.util.Scanner;

import controllers.ClienteController;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n *** CONTROLE DE CLIENTES \n");
		System.out.println("(1) Cadastrar cliente");
		System.out.println("(2) Atualizar cliente");
		System.out.println("(3) Excluir cliente");
		System.out.println("(4) Consultar todos os cliente");

		System.out.print("\nEcolha uma opção: ");
		Integer opcao = Integer.parseInt(scanner.nextLine());

		ClienteController clienteController = new ClienteController();
		
		switch (opcao) {
		
		case 1:
			clienteController.CadastrarCliente();
			break;		
			
		case 2:
			clienteController.atualizarCliente();
			break;
			
		case 3:
			clienteController.excluirCliente();
			break;
			
		case 4:
			clienteController.consultarClientes();
			break;
			
			default:
				System.out.println("\nOpção inválida");
				break;
		}
	}

}
