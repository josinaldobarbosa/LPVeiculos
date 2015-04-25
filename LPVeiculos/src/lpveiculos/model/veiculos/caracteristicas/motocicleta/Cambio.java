package lpveiculos.model.veiculos.caracteristicas.motocicleta;

/**
 * Nesta enumeração está contida os tipos de câmbio disponível na moto.
 * 
 * @author Wallace Jonatthan
 *@version 25-04-2015
 */

public enum Cambio {

	AUTOMATICO("Automático"), MANUAL("Manual");
	
	private String cambio;

	/* Construtor */
	/**
	 * Construtor que recebe o cambio.
	 * 
	 * @param cambio
	 */
	private Cambio(String cambio) {
		this.cambio = cambio;
	}
	
	/* Getter */
	/**
	 * Substitui o cambio da motocicleta.
	 *
	 * @return cambio 
	 */
	public String getCambio() {
		return cambio;
	}
}
