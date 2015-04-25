package lpveiculos.model.veiculos.caracteristicas.motocicleta;

/**
 * Nesta enumera��o est� contida os tipos de c�mbio dispon�vel na moto.
 * 
 * @author Wallace Jonatthan
 *@version 25-04-2015
 */

public enum Cambio {

	AUTOMATICO("Autom�tico"), MANUAL("Manual");
	
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
