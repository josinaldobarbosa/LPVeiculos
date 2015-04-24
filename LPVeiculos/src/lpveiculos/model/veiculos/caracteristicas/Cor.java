<<<<<<< HEAD
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
=======
package lpveiculos.model.veiculos.caracteristicas;

/**
 * Enumeração com as cores disponiveis dos veiculos
 * 
 * @author Josinaldo
 *
 */
public enum Cor {

	PRATA("Prata"), PRETO("Preto"), BRANCO("Branco"), CINZA("Cinza"), AZUL(
			"Azul"), VERMELHO("Vermelho"), MARROMBEGE("Marrom/Bege"), VERDE(
			"Verde"), AMARELODOURADO("Amarelo/Dourado");

	private String cor;

	/**
	 * Construtor que recebe a cor do veiculo
	 * 
	 * @param cor
	 *            Cor do veiculo
	 */
	private Cor(String cor) {
		this.cor = cor;
	}

	/**
	 * Retorna a cor do veiculo
	 * 
	 * @return cor do veiculo
	 */
	public String getCor() {
		return this.cor;
	}

}
>>>>>>> origin/master
