package lpveiculos.view;

import lpveiculos.model.Loja;
import lpveiculos.model.veiculos.Carro;
import lpveiculos.model.veiculos.Motocicleta;

public class BuscaVeiculo {

	// Bloqueia criação de objetos
	private BuscaVeiculo() {
	}

	// Busca veiculo
	protected static void busca(Loja loja) {
		int veiculoEscolhido = Utilidades.escolheVeiculo();
		Utilidades.limpaTela();

		// Busca depedendo do veiculo
		switch (veiculoEscolhido) {
		case 1:
			/* Busca Carro */

			System.out.print("\nChassi do carro que deseja buscar: ");
			String chassiCarro = Utilidades.in.next();

			Carro carro = buscaCarro(chassiCarro, loja);

			if (carro != null) {
				// exibe
				System.out.println("\n[----------- Carro encontrado -----------]");
				ExibeVeiculo.exibeUmVeiculo(carro);
				System.out.println("[----------------------------------------]");
			} else {
				// não encontrado
				System.err.println("\nERRO: Carro NÃO encontrado.");
			}

			Utilidades.pausa();
			break;

		case 2:
			/* Busca Motocicleta */

			System.out.print("\nChassi da motocicleta que deseja buscar: ");
			String chassiMotocicleta = Utilidades.in.next();

			Motocicleta motocicleta = buscaMotocicleta(chassiMotocicleta, loja);

			if (motocicleta != null) {
				// exibe
				System.out.println("\n[-------- Motocicleta encontrada --------]");
				ExibeVeiculo.exibeUmVeiculo(motocicleta);
				System.out.println("[----------------------------------------]");
			} else {
				// não encontrado
				System.err.println("\nERRO: Motocicleta NÃO encontrada.");
			}

			Utilidades.pausa();
			break;
		}

	} // fim do busca veiculo

	// Busca na loja o carro
	protected static Carro buscaCarro(String chassiCarro, Loja loja) {
		Carro retorno = null;
		for (Carro carro : loja.getEstoqueDeCarros()) {
			if (carro.getChassi().equals(chassiCarro)) {
				// achou
				retorno = carro;
			}
		}
		return retorno;
	}

	// Busca na loja a motocicleta
	protected static Motocicleta buscaMotocicleta(String chassiMotocicleta, Loja loja) {
		Motocicleta retorno = null;
		for (Motocicleta moto : loja.getEstoqueDeMotocicleta()) {
			if (moto.getChassi().equals(chassiMotocicleta)) {
				// achou
				retorno = moto;
			}
		}
		return retorno;
	}

}
