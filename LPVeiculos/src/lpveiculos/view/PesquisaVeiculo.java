package lpveiculos.view;

import lpveiculos.model.Loja;

public class PesquisaVeiculo {

	// Bloqueia criação de objetos
	private PesquisaVeiculo() {
	}

	protected static void pesquisar(Loja loja) {
		int veiculoEscolhido = Utilidades.escolheVeiculo();
		Utilidades.limpaTela();

		switch (veiculoEscolhido) {
		case 1:
			/* Pesquisa Carro por atributos */
			// TODO: fazer
			System.out.println("\nFalta fazer!.");
			Utilidades.pausa();

			break;
		case 2:
			/* Pesquisa Motocicleta por atributos */
			// TODO: fazer
			System.out.println("\nFalta fazer!.");
			Utilidades.pausa();

			break;
		}

	}

}
