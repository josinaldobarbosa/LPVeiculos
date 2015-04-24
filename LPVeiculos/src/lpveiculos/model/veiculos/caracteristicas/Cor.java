package lpveiculos.model.veiculos.caracteristicas;

/**
 * Nesta enumeração está contida todas as cores dos veículos da loja
 * 
 * @author Carlos Renato
 *
 */
public enum Cor {

	BRANCA("Branca"), PRETA("Preta"), CINZA("Cinza"), PRATA("Prata"), VERMELHA(
			"Vermelha"), MARROM("Marrom"), BEGE("Bege"), AZUL("Azul"), VERDE(
			"Verde"), AMARELA("Amarela"), DOURADA("Dourada");

	/* Variavel que armazena o valor da constante */
	private String cor;

	/* Construtor */
	/**
	 * @param cor
	 */
	private Cor(String cor) {
		this.cor = cor;
	}

	/*Getter*/
	/**
	 * @return a cor
	 */
	public String getCor() {
		return cor;
	}
}
