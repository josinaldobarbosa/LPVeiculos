package lpveiculos.view;

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

			// Salva quantidade antes de adicionar
			int totalCarros = loja.getEstoqueDeCarros().size();

			// Pergunta se quer salvar
			if (desejaSalvar().equals("s")) {
				// Adiciona carro na loja
				loja.adicionaVeiculo(carro);
				// Verifica se o carro foi adicionado(validação de carro, pacote
				// model)
				if (totalCarros < loja.getEstoqueDeCarros().size()) {
					System.out.println("\nAVISO: Carro adicionado.");
				} else {
					System.out.println("\nERRO: Este carro já existe.");
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

			// Salva quantidade antes de adicionar
			int totalMotocicletas = loja.getEstoqueDeMotocicleta().size();

			// Pergunta se quer salvar
			if (desejaSalvar().equals("s")) {
				// Adiciona carro na loja
				loja.adicionaVeiculo(motocicleta);
				// Verifica se a motocicleta foi adicionado(validação de
				// motocicleta, pacote model)
				if (totalMotocicletas < loja.getEstoqueDeMotocicleta().size()) {
					System.out.println("\nAVISO: Motocicleta adicionada.");
				} else {
					System.out.println("\nERRO: Esta motocicleta já existe.");
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
		return Utilidades.in.next();
	}

}
