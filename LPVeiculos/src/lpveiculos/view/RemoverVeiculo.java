package lpveiculos.view;

import lpveiculos.model.Loja;
import lpveiculos.model.veiculos.Carro;
import lpveiculos.model.veiculos.Motocicleta;

public class RemoverVeiculo {

	// Bloqueia criação de objetos
	private RemoverVeiculo() {
	}

	// Remove veiculo
	protected static void remove(Loja loja) {
		int veiculoEscolhido = Utilidades.escolheVeiculo();
		Utilidades.limpaTela();

		// Exibe e remove depedendo do veiculo
		switch (veiculoEscolhido) {
		case 1:
			/* Remove Carro */

			// Pede chassi
			System.out.print("\nChassi do carro que deseja remover: ");
			String chassiCarro = Utilidades.in.next();

			// Procura carro
			Carro carro = BuscaVeiculo.buscaCarro(chassiCarro, loja);

			// Verifica se achou
			if (carro != null) {
				// exibe o carro
				BuscaVeiculo.exibeVeiculo(carro);
				if (desejaRemover().equals("s")) {
					loja.removeVeiculo(carro);
					System.out.println("\nAVISO: Carro removido com sucesso.");
				} else {
					System.out.println("\nAVISO: Carro NÃO foi removido.");
				}
			} else {
				// não encontrado
				System.out.println("\nERRO: Carro NÃO encontrado.");
			}

			Utilidades.pausa();
			break;

		case 2:
			/* Remove Motocicleta */

			// Pede chassi
			System.out.print("\nChassi da motocicleta que deseja remover: ");
			String chassiMotocicleta = Utilidades.in.next();

			// Procura motocicleta
			Motocicleta motocicleta = BuscaVeiculo.buscaMotocicleta(
					chassiMotocicleta, loja);

			// Verifica se achou
			if (motocicleta != null) {
				// exibe a motocicleta
				BuscaVeiculo.exibeVeiculo(motocicleta);
				if (desejaRemover().equals("s")) {
					loja.removeVeiculo(motocicleta);
					System.out
							.println("\nAVISO: Motocicleta removido com sucesso.");
				} else {
					System.out
							.println("\nAVISO: Motocicleta NÃO foi removida.");
				}
			} else {
				// não encontrado
				System.out.println("\nERRO: Motocicleta NÃO encontrada.");
			}

			Utilidades.pausa();
			break;
		}

	} // fim do remove veiculo

	// Exibe pergunta se deseja remover
	private static String desejaRemover() {
		System.out.print("\nTem certeza que deseja remover?(s/n): ");
		return Utilidades.in.next();
	}

}
