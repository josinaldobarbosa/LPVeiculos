package lpveiculos.view;

import lpveiculos.model.Loja;
import lpveiculos.model.veiculos.Carro;
import lpveiculos.model.veiculos.Motocicleta;
import lpveiculos.view.criaveiculo.CriaCarro;
import lpveiculos.view.criaveiculo.CriaMotocicleta;

public class AdicionaVeiculo {

	// Bloqueia cria��o de objetos
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

			// Cadastra infoma��es do carro
			Carro carro = CriaCarro.cria();

			// Salva quantidade antes de adicionar
			int totalCarros = loja.getEstoqueDeCarros().size();

			Utilidades.limpaTela();

			// Exibe o carro criado
			System.out.println("[-------------- Novo Carro --------------]");
			ExibeVeiculo.exibeUmVeiculo(carro);
			System.out.println("[----------------------------------------]");

			// Pergunta se quer salvar
			if (desejaSalvar().equals("s")) {
				// Adiciona carro na loja
				loja.adicionaVeiculo(carro);
				// Verifica se o carro foi adicionado(valida��o de carro, pacote
				// model)
				if (totalCarros < loja.getEstoqueDeCarros().size()) {
					System.out.println("\nAVISO: Carro adicionado.");
				} else {
					System.err.println("\nERRO: Este carro j� existe.");
				}
			} else {
				System.out.println("\nAVISO: Carro N�O foi adicionado.");
			}

			Utilidades.pausa();
			break;

		case 2:
			/* Adiciona Motocicleta */

			// Cadastra infoma��es da motocicleta
			Motocicleta motocicleta = CriaMotocicleta.cria();

			// Salva quantidade antes de adicionar
			int totalMotocicletas = loja.getEstoqueDeMotocicleta().size();

			Utilidades.limpaTela();

			// Exibe a motocicleta criada
			System.out.println("[----------- Nova Motocicleta -----------]");
			ExibeVeiculo.exibeUmVeiculo(motocicleta);
			System.out.println("[----------------------------------------]");

			// Pergunta se quer salvar
			if (desejaSalvar().equals("s")) {
				// Adiciona carro na loja
				loja.adicionaVeiculo(motocicleta);
				// Verifica se a motocicleta foi adicionado(valida��o de
				// motocicleta, pacote model)
				if (totalMotocicletas < loja.getEstoqueDeMotocicleta().size()) {
					System.out.println("\nAVISO: Motocicleta adicionada.");
				} else {
					System.err.println("\nERRO: Esta motocicleta j� existe.");
				}
			} else {
				System.out.println("\nAVISO: Motocicleta N�O foi adicionada.");
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
