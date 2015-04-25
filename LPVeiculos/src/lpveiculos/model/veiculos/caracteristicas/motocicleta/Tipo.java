package lpveiculos.model.veiculos.caracteristicas.motocicleta;

/**
 * Nesta enumera��o est� contida toda a categoria de motocicleta disponibilizados
 * pela loja.
 * 
 * @author User
 *@version 25-04-2015
 */

public enum Tipo {

	CITY("City"), CUSTOM("Custom"), MAXTRAIL("Maxtrail"), NAKED("Naked"),
	CUB("Cub"), SCOOTER("Scooter"), SPORT("Sport"), TOURING("Touring"),
	TRAIL("Trail"), FUN("Fun");
	
	private String categoria;
	
	/* Construtor */
	/**
	 * Construtor que recebe a categoria.
	 * 
	 * @param categoria
	 */
	private Tipo(String categoria) {
		this.categoria = categoria;
	}
	
	/* Getter */
	/**
	 * Substitui a categoria da motocicleta.
	 * 
	 * @return categoria
	 */
	public String getCategoria() {
		return categoria;
	}
}
