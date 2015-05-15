package lpveiculos.view;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Utilidades {

	// Bloqueia cria��o de objetos
	private Utilidades() {
	}

	// Scanner para ser utilizado em todo o programa
	public static Scanner in = new Scanner(System.in);

	// N�mero em formato de dinheiro R$
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

		// Repete at� ser uma op��o v�lida
		while (retorno == 0) {
			System.out.print("\nOp��o: ");
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
				System.err.println("\n[Erro]: op��o inv�lida.");
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

	// Verifica se o valor est� fora do tamanho da lista
	public static <T> boolean validaEnumEscolhido(int valor, List<T> lista) {
		boolean retorno = true;
		if (valor < 0 || valor > lista.size() - 1) {
			retorno = false;
		}
		return retorno;
	}


	/**
	 * Verifica e trata a entrada do usu�rio quando se espera um inteiro.
	 * @param texto Texto exibido antes de receber dados de entrada.
	 * @return valor inteiro a ser usado pelo programa.
	 */
	public static int entradaDeInteiro(String texto) {
		int retorno = 0;
		boolean fim = false;
		
		while (fim == false) {
			System.out.print(texto);
			try{
				retorno = Integer.parseInt(in.nextLine());
				fim = true;
			} catch (NumberFormatException nf){
				System.err.println("\n[Erro]: Caracter inv�lido.");
			}
		}
		return retorno;
	}
	/**
	 * Verifica e trata a entrada do usu�rio quando se espera um float.
	 * @param texto Texto exibido antes de receber dados de entrada.
	 * @return valor float a ser usado pelo programa.
	 */
	public static float entradaDeFloat(String texto) {
		float retorno = 0;
		boolean fim = false;
		
		while (fim == false) {
			System.out.println(texto);
			try{
				retorno = Float.parseFloat(in.nextLine());
				fim = true;
			} catch (NumberFormatException nf){
				System.err.println("\n[Erro]: Caracter inv�lido.");
			}
		}
		return retorno;
	}

} // fim class
