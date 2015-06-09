package lpveiculos.view;

import lpveiculos.controller.excecoes.Excecao;
import lpveiculos.model.Loja;
import lpveiculos.model.veiculos.Carro;
import lpveiculos.model.veiculos.Motocicleta;
import lpveiculos.view.criaveiculo.CriaCarro;
import lpveiculos.view.criaveiculo.CriaMotocicleta;

public class AdicionaVeiculo {

	// Bloqueia criação de objetos
	private AdicionaVeiculo(Loja loja) {
	}

	// Adiciona veiculo
	protected static void adiciona(Loja loja) {
		int veiculoEscolhido = Utilidades.escolheVeiculo();
		Utilidades.limpaTela();

		// Cadastra e salva depedendo do veiculo
		switch (veiculoEscolhido) {
		case 1:
			/* Adiciona Carro */

			// Cadastra infomações do carro
			Carro carro = CriaCarro.cria();

			Utilidades.limpaTela();

			// Exibe o carro criado
			System.out.println("[-------------- Novo Carro --------------]");
			ExibeVeiculo.exibeUmVeiculo(carro);
			System.out.println("[----------------------------------------]");

			// Pergunta se quer salvar
			if (desejaSalvar().toLowerCase().equals("s")) {
				try {
					// Adiciona carro na loja
					loja.adicionaVeiculo(carro);
					System.out.println("\nAVISO: Carro adicionado.");
				} catch (Excecao e) {
					System.err.println("\nERRO: " + e.getMessage());
				}
			} else {
				System.out.println("\nAVISO: Carro NÃO foi adicionado.");
			}

			Utilidades.pausa();
			break;

		case 2:
			/* Adiciona Motocicleta */

			// Cadastra infomações da motocicleta
			Motocicleta motocicleta = CriaMotocicleta.cria();

			Utilidades.limpaTela();

			// Exibe a motocicleta criada
			System.out.println("[----------- Nova Motocicleta -----------]");
			ExibeVeiculo.exibeUmVeiculo(motocicleta);
			System.out.println("[----------------------------------------]");

			// Pergunta se quer salvar
			if (desejaSalvar().toLowerCase().equals("s")) {
				try {
					// Adiciona motocicleta na loja
					loja.adicionaVeiculo(motocicleta);
					System.out.println("\nAVISO: Motocicleta adicionada.");
				} catch (Excecao e) {
					System.err.println("\nERRO: " + e.getMessage());
				}
			} else {
				System.out.println("\nAVISO: Motocicleta NÃO foi adicionada.");
			}

			Utilidades.pausa();
			break;
		}

	} // fim do adiciona veiculo

	// Exibe pergunta se deseja salvar
	private static String desejaSalvar() {
		System.out.print("\nDeseja salvar?(s/n): ");
		return Utilidades.in.nextLine();
	}

}
