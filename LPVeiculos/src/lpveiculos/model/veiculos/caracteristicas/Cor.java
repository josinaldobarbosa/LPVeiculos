package lpveiculos.model.veiculos.caracteristicas;

/**
 * Nesta enumeração está contida todas as cores dos veículos da loja.
 * 
 * @author Carlos Renato
 *
 */
public enum Cor {

	BRANCA   ("Branca"), 
	PRETA    ("Preta"),
	CINZA    ("Cinza"),
	PRATA    ("Prata"),
	VERMELHA ("Vermelha"),
	MARROM   ("Marrom"),
	BEGE     ("Bege"),
	AZUL     ("Azul"),
	VERDE    ("Verde"),
	AMARELA  ("Amarela"),
	DOURADA  ("Dourada");

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
		return cor;
	}

}
