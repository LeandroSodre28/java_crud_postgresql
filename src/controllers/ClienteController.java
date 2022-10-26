package controllers;

import entities.Cliente;
import helpers.ClienteHelper;
import repositories.ClienteRepository;

public class ClienteController {

	public void CadastrarCliente() {

		try {
			System.out.println("\nCADASTRO DE CLIENTE\n");

			Cliente cliente = new Cliente();

			cliente.setNome(ClienteHelper.lerNome());
			cliente.setEmail(ClienteHelper.lerEmail());
			cliente.setTelefone(ClienteHelper.lerTelefone());

			ClienteRepository clienteRepository = new ClienteRepository();
			clienteRepository.create(cliente);

		} catch (Exception e) {
			System.out.print("\nErro: " + e.getMessage());

		}

	}

}
