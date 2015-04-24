package lpveiculos.model.veiculos.caracteristicas.carro;

/**
 * Nesta enumera��o os tipos de c�mbio dispon�veis nos carros.
 * 
 * @author Carlos Renato
 *
 */
public enum Cambio {

	AUTOMATICO("Autom�tico"), SEMIAUTOMATICO("Semi-autom�tico"), MANUAL("Manual");

	private String cambio;

	/* Construtor */
	/**
	 * @param cambio
	 */
	private Cambio(String cambio) {
		this.cambio = cambio;
	}

	/* Getter */
	/**
	 * @return o cambio
	 */
	public String getCambio() {
		return cambio;
	}
}
