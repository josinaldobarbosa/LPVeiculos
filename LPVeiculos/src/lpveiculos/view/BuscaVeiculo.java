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
				exibeVeiculo(carro);
			} else {
				// não encontrado
				System.out.println("\nERRO: Carro NÃO encontrado.");
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
				exibeVeiculo(motocicleta);
			} else {
				// não encontrado
				System.out.println("\nERRO: Motocicleta NÃO encontrada.");
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
	protected static Motocicleta buscaMotocicleta(String chassiMotocicleta,
			Loja loja) {
		Motocicleta retorno = null;
		for (Motocicleta moto : loja.getEstoqueDeMotocicleta()) {
			if (moto.getChassi().equals(chassiMotocicleta)) {
				// achou
				retorno = moto;
			}
		}
		return retorno;
	}

	// Exibe Carro
	protected static void exibeVeiculo(Carro carro) {
		System.out.println("\n[----------- Carro encontrado -----------]");
		System.out.println(" Chassi: " + carro.getChassi());
		System.out.println(" Montadora: " + carro.getMontadora());
		System.out.println(" Modelo: " + carro.getModelo());
		System.out.println(" Tipo: " + carro.getTipo());
		System.out.println(" Cor: " + carro.getCor());
		System.out.println(" Motorização: " + carro.getMotorizacao());
		System.out.println(" Cambio: " + carro.getCambio());
		System.out.println(" Preço: "
				+ Utilidades.formatoDinheiro.format(carro.getPreco()));
		System.out.println("[----------------------------------------]");
	}

	// Exibe Motocicleta
	protected static void exibeVeiculo(Motocicleta motocicleta) {
		System.out.println("\n[-------- Motocicleta encontrada --------]");
		System.out.println(" Chassi: " + motocicleta.getChassi());
		System.out.println(" Montadora: " + motocicleta.getMontadora());
		System.out.println(" Modelo: " + motocicleta.getModelo());
		System.out.println(" Tipo: " + motocicleta.getTipo());
		System.out.println(" Cor: " + motocicleta.getCor());
		System.out.println(" Cilindrada: " + motocicleta.getCilindrada());
		System.out.println(" Capacidade do tanque: "
				+ motocicleta.getCapacidadeDoTanque());
		System.out.println(" Preço: "
				+ Utilidades.formatoDinheiro.format(motocicleta.getPreco()));
		System.out.println("[----------------------------------------]");
	}

}
