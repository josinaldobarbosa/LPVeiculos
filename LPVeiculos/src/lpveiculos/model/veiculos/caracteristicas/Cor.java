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
