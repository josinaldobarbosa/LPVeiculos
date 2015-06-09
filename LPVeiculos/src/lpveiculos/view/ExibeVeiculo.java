package lpveiculos.view;

import java.util.List;

import lpveiculos.model.Loja;
import lpveiculos.model.veiculos.Carro;
import lpveiculos.model.veiculos.Motocicleta;
import lpveiculos.model.veiculos.Veiculo;

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
					System.out.println("[--------------- " + (i + 1) + "º Carro ---------------]");
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
					System.out.println("[------------ " + (i + 1) + "º Motocicleta ------------]");
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
	
	// Exibe atributos de um veiculo
	protected static void exibeVeiculo(Veiculo veiculo) {
		System.out.println();
		System.out.println(" Chassi:      " + veiculo.getChassi());
		System.out.println(" Modelo:      " + veiculo.getModelo());
		System.out.println(" Cor:         " + veiculo.getCor());
		System.out.println(" Preço:       " + Utilidades.formatoDinheiro.format(veiculo.getPreco()));
	}

	// Exibe um Carro
	protected static void exibeUmVeiculo(Carro carro) {
		exibeVeiculo(carro);
		System.out.println(" Montadora:   " + carro.getMontadora());
		System.out.println(" Tipo:        " + carro.getTipo());
		System.out.println(" Motorização: " + carro.getMotorizacao());
		System.out.println(" Cambio:      " + carro.getCambio());
		System.out.println();
	}

	// Exibe uma Motocicleta
	protected static void exibeUmVeiculo(Motocicleta motocicleta) {
		exibeVeiculo(motocicleta);
		System.out.println(" Montadora:      " + motocicleta.getMontadora());
		System.out.println(" Tipo:           " + motocicleta.getTipo());
		System.out.println(" Cilindrada:     " + motocicleta.getCilindrada());
		System.out.println(" Cap. do tanque: " + motocicleta.getCapacidadeDoTanque());
		System.out.println();
	}

}
