package helpers;

import java.util.Scanner;

public class ClienteHelper {

	public static Integer lerIdCliente() throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o id do cliente........: ");
		return Integer.parseInt(scanner.nextLine());

	}

	public static String lerNome() throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome do cliente...: ");
		return scanner.nextLine();
	}

	public static String lerEmail() throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o email do cliente...: ");
		return scanner.nextLine();
	}

	public static String lerTelefone() throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o Telefone do cliente...: ");
		return scanner.nextLine();
	}
}
