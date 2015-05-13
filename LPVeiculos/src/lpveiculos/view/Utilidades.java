package lpveiculos.view;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Utilidades {

	// Bloqueia criação de objetos
	private Utilidades() {
	}

	// Scanner para ser utilizado em todo o programa
	public static Scanner in = new Scanner(System.in);

	// Número em formato de dinheiro R$
	public static NumberFormat formatoDinheiro = NumberFormat
			.getCurrencyInstance(new Locale("pt", "BR"));

	// Escolhe um veiculo
	protected static int escolheVeiculo() {
		limpaTela();
		int retorno = 0;
		System.out.println("\n[------ ESCOLHA O TIPO DE VEICULO -------]\n");
		System.out.println(" 1) Carro");
		System.out.println(" 2) Motocicleta");
		System.out.println("\n 3) Cancelar");
		System.out.println("\n[----------------------------------------]");

		// Repete até ser uma opção válida
		while (retorno == 0) {
			System.out.print("\nOpção: ");
			int opcao = in.nextInt();

			switch (opcao) {
			case 1:
				retorno = 1;
				break;
			case 2:
				retorno = 2;
				break;
			case 3:
				System.out.println();
				retorno = -1;
				break;
			default:
				System.err.println("\nErro: opção inválida.");
			}

		}

		return retorno;
	} // fim escolheVeiculo

	// POG para "limpar" a tela
	public static void limpaTela() {
		for (int i = 0; i < 100; ++i)
			System.out.println();
	}

	// POG para "pausar"
	protected static void pausa() {
		System.out.print("\nPressione enter para continuar...");
		in.nextLine();
		in.nextLine();
	}

	// Verifica se o valor está fora do tamanho da lista
	public static <T> boolean validaEnumEscolhido(int valor, List<T> lista) {
		boolean retorno = true;
		if (valor < 0 || valor > lista.size() - 1) {
			retorno = false;
		}
		return retorno;
	}

} // fim class
