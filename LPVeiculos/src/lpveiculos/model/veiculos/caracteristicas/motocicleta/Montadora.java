package lpveiculos.model.veiculos.caracteristicas.motocicleta;

/**
 * Nesta enumeração está contida todas as montadores de motocicletas que servem
 * a loja
 * 
 * @author Wallace Jonathan
 * @version 25-04-2015
 * 
 */
public enum Montadora {

	HONDA          ("Honda"),
	YAMAHA         ("Yamaha"),
	HARLEYDAVIDSON ("Harley Davidson"),
	SHINERAY       ("Shineray"),
	BMW            ("Bmw"),
	KAWASAKI       ("Kawasaki");

	private String montadora;

	/* Construtor */
	/**
	 * Construtor que recebe a montadora da motocicleta.
	 * 
	 * @param montadora
	 */
	private Montadora(String montadora) {
		this.montadora = montadora;
	}

	/* Getter */
	/**
	 * Retorna a montadora da motocicleta
	 * 
	 * @return montadora
	 */
	public String getMontadora() {
		return montadora;
	}

}
