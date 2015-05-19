package lpveiculos.view;

import java.util.List;

import lpveiculos.model.Loja;
import lpveiculos.model.veiculos.Carro;
import lpveiculos.model.veiculos.Motocicleta;

public class ExibeVeiculo {

	// Bloqueia criação de objetos
	private ExibeVeiculo() {
	}

	// Exibe veiculos
	protected static void exibe(Loja loja) {
		int veiculoEscolhido = Utilidades.escolheVeiculo();
		Utilidades.limpaTela();

		// Exibe depedendo do veículo
		switch (veiculoEscolhido) {
		case 1:
			/* Exibe todos os carros */

			List<Carro> carros = loja.getEstoqueDeCarros();

			if (validaLista(carros)) {
				// Exibe carro
				for (int i = 0; i < carros.size(); i++) {
					System.out.println("[--------------- " + (i + 1) + "� Carro ---------------]");
					exibeUmVeiculo(carros.get(i));
				}
				System.out.println("[----------------------------------------]");
				System.out.println("\nTotal de carros: " + carros.size());
			} else {
				System.out.print("\nAVISO: Estoque de Carros vazio.\n");
			}

			Utilidades.pausa();
			break;

		case 2:
			/* Exibe todas as motocicletas */

			List<Motocicleta> motocicletas = loja.getEstoqueDeMotocicleta();

			if (validaLista(motocicletas)) {
				// Exibe motocicleta
				for (int i = 0; i < motocicletas.size(); i++) {
					System.out.println("[------------ " + (i + 1) + "� Motocicleta ------------]");
					exibeUmVeiculo(motocicletas.get(i));
				}
				System.out.println("[----------------------------------------]");
				System.out.println("\nTotal de motocicletas: " + motocicletas.size());
			} else {
				System.out.print("\nAVISO: Estoque de Motocicletas vazio.\n");
			}

			Utilidades.pausa();
			break;
		}
	}

	// Verifica se a lista está vazia ou nula
	private static <T> boolean validaLista(List<T> lista) {
		boolean retorno = true;
		if (lista.size() == 0 || lista == null) {
			retorno = false;
		}
		return retorno;
	}

	// Exibe um Carro
	protected static void exibeUmVeiculo(Carro carro) {
		System.out.println();
		System.out.println(" Chassi:      " + carro.getChassi());
		System.out.println(" Montadora:   " + carro.getMontadora());
		System.out.println(" Modelo:      " + carro.getModelo());
		System.out.println(" Tipo:        " + carro.getTipo());
		System.out.println(" Cor:         " + carro.getCor());
		System.out.println(" Motorização: " + carro.getMotorizacao());
		System.out.println(" Cambio:      " + carro.getCambio());
		System.out.println(" Preço:       " + Utilidades.formatoDinheiro.format(carro.getPreco()));
		System.out.println();
	}

	// Exibe uma Motocicleta
	protected static void exibeUmVeiculo(Motocicleta motocicleta) {
		System.out.println();
		System.out.println(" Chassi:         " + motocicleta.getChassi());
		System.out.println(" Montadora:      " + motocicleta.getMontadora());
		System.out.println(" Modelo:         " + motocicleta.getModelo());
		System.out.println(" Tipo:           " + motocicleta.getTipo());
		System.out.println(" Cor:            " + motocicleta.getCor());
		System.out.println(" Cilindrada:     " + motocicleta.getCilindrada());
		System.out.println(" Cap. do tanque: " + motocicleta.getCapacidadeDoTanque());
		System.out.println(" Preço:          " + Utilidades.formatoDinheiro.format(motocicleta.getPreco()));
		System.out.println();
	}

}
