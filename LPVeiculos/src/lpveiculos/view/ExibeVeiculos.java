package lpveiculos.view;

import java.util.ArrayList;
import java.util.List;

import lpveiculos.model.Loja;
import lpveiculos.model.veiculos.Carro;
import lpveiculos.model.veiculos.Motocicleta;

public class ExibeVeiculos {

	// Bloqueia criação de objetos
	private ExibeVeiculos() {
	}

	// Exibe veiculos
	protected static void exibe(Loja loja) {
		int veiculoEscolhido = Utilidades.escolheVeiculo();
		Utilidades.limpaTela();

		// Exibe depedendo do veiculo
		switch (veiculoEscolhido) {
		case 1:
			/* Exibe todos os carros */

			ArrayList<Carro> carros = loja.getEstoqueDeCarros();

			if (validaLista(carros)) {
				// Exibe carro
				for (int i = 0; i < carros.size(); i++) {
					System.out.println("[--------------- " + (i + 1)
							+ "º Carro ---------------]");
					System.out.println(" Chassi: " + carros.get(i).getChassi());
					System.out.println(" Montadora: "
							+ carros.get(i).getMontadora());
					System.out.println(" Modelo: " + carros.get(i).getModelo());
					System.out.println(" Tipo: " + carros.get(i).getTipo());
					System.out.println(" Cor: " + carros.get(i).getCor());
					System.out.println(" Motorização: "
							+ carros.get(i).getMotorizacao());
					System.out.println(" Cambio: " + carros.get(i).getCambio());
					System.out.println(" Preço: "
							+ Utilidades.formatoDinheiro.format(carros.get(i)
									.getPreco()));
				}
				System.out
						.println("[----------------------------------------]");
				System.out.println("\nTotal de carros: " + carros.size());
			} else {
				System.out.print("\nAVISO: Estoque de Carros vazio.\n");
			}

			Utilidades.pausa();
			break;

		case 2:
			/* Exibe todas as motocicletas */

			ArrayList<Motocicleta> motocicletas = loja
					.getEstoqueDeMotocicleta();

			if (validaLista(motocicletas)) {
				// Exibe motocicleta
				for (int i = 0; i < motocicletas.size(); i++) {
					System.out.println("[------------ " + (i + 1)
							+ "º Motocicleta ------------]");
					System.out.println(" Chassi: "
							+ motocicletas.get(i).getChassi());
					System.out.println(" Montadora: "
							+ motocicletas.get(i).getMontadora());
					System.out.println(" Modelo: "
							+ motocicletas.get(i).getModelo());
					System.out.println(" Tipo: "
							+ motocicletas.get(i).getTipo());
					System.out.println(" Cor: " + motocicletas.get(i).getCor());
					System.out.println(" Cilindrada: "
							+ motocicletas.get(i).getCilindrada());
					System.out.println(" Capacidade do tanque: "
							+ motocicletas.get(i).getCapacidadeDoTanque());
					System.out.println(" Preço: "
							+ Utilidades.formatoDinheiro.format(motocicletas
									.get(i).getPreco()));
				}
				System.out
						.println("[----------------------------------------]");
				System.out.println("\nTotal de motocicletas: "
						+ motocicletas.size());
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

}
