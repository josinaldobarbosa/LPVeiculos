package lpveiculos.model.veiculos.caracteristicas.carro;

/**
 * Nesta enumeração os tipos de câmbio disponíveis nos carros.
 * 
 * @author Carlos Renato
 *
 */
public enum Cambio {

	AUTOMATICO("Automático"), SEMIAUTOMATICO("Semi-automático"), MANUAL("Manual");

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
