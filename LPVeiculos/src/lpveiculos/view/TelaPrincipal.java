package lpveiculos.view;

import lpveiculos.model.Loja;

public class TelaPrincipal {

	// Bloqueia criação de objetos
	private TelaPrincipal() {
	}

	// Inicia o programa
	public static void start() {

		// TODO Criar m�todo para receber a loja...
		Loja loja = new Loja("Rua São José, 90 - Centro, RJ", "LP - Veículos");
		// TODO remover o teste

		// Menu
		menu(loja);
	}

	// Menu de opções
	private static void menu(Loja loja) {
		boolean fim = false;

		// While que mantem todo o programa aberto
		while (fim == false) {
			Utilidades.limpaTela();
			System.out.println("[----------------- MENU -----------------]\n");
			System.out.println(" 1) Adicionar veículo");
			System.out.println(" 2) Remover veículo");
			System.out.println(" 3) Pesquisar veículo");
			System.out.println(" 4) Buscar veículo");
			System.out.println(" 5) Exibir todos os veículos");
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
					/* Opção inválida */
					opcao = 0;
					System.err.println("\nErro: opção inválida.");

				} // fecha switch opcoes do menu

			} // fecha while opcao

		} // fecha while fim

	} // fim método menu

} // fim class
