package lpveiculos.view;

import lpveiculos.model.Loja;

public class TelaPrincipal {

	// Bloqueia cria��o de objetos
	private TelaPrincipal() {
	}

	// Inicia o programa
	public static void start() {

		// TODO Criar m�todo para receber a loja...
		Loja loja = new Loja("Rua S�o Jos�, 90 - Centro, RJ", "LP - Veiculos");
		// TODO remover o teste

		// Menu
		menu(loja);
	}

	// Menu de op��es
	private static void menu(Loja loja) {
		boolean fim = false;

		// While que mantem todo o programa aberto
		while (fim == false) {
			Utilidades.limpaTela();
			System.out.println("[----------------- MENU -----------------]\n");
			System.out.println(" 1) Adicionar veiculo");
			System.out.println(" 2) Remover veiculo");
			System.out.println(" 3) Pesquisar veiculo");
			System.out.println(" 4) Buscar veiculo");
			System.out.println(" 5) Exibir todos os veiculos");
			System.out.println("\n 6) Sair");
			System.out.println("\n[----------------------------------------]");

			int opcao = 0;
			while (opcao == 0) {
				opcao = Utilidades.entradaDeInteiro("\nOpção: ");

				switch (opcao) {
				case 1:
					/* Adiciona um veiculo */
					AdicionaVeiculo.adiciona(loja);
					break;

				case 2:
					/* Remove um veiculo */
					RemoverVeiculo.remove(loja);
					break;

				case 3:
					/* Pesquisa um veiculo */
					PesquisaVeiculo.pesquisar(loja);
					break;

				case 4:
					/* Busca um veiculo */
					BuscaVeiculo.busca(loja);
					break;

				case 5:
					/* Exibe todos os veiculos */
					ExibeVeiculo.exibe(loja);
					break;

				case 6:
					/* Termina programa */
					fim = true;
					System.out.print("\nAVISO: Programa terminado.");
					break;

				default:
					/* Op��o inv�lida */
					opcao = 0;
					System.err.println("\nErro: op��o inv�lida.");

				} // fecha switch opcoes do menu

			} // fecha while opcao

		} // fecha while fim

	} // fim m�todo menu

} // fim class
