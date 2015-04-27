package lpveiculos.model.veiculos.caracteristicas.motocicleta;

/**
 * Nesta enumeração está contida toda a categoria de motocicleta
 * disponibilizados pela loja.
 * 
 * @author Wallace Jonathan
 * @version 25-04-2015
 *
 */
public enum Tipo {

	CITY("City"), CUSTOM("Custom"), MAXTRAIL("Maxtrail"), NAKED("Naked"), CUB(
			"Cub"), SCOOTER("Scooter"), SPORT("Sport"), TOURING("Touring"), TRAIL(
			"Trail"), FUN("Fun");

	private String tipo;

	/* Construtor */
	/**
	 * Construtor que recebe o tipo.
	 * 
	 * @param tipo
	 */
	private Tipo(String tipo) {
		this.tipo = tipo;
	}

	/* Getter */
	/**
	 * Retorna o tipo da motocicleta.
	 * 
	 * @return categoria
	 */
	public String getTipo() {
		return tipo;
	}

}
