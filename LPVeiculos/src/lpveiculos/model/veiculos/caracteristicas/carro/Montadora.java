package lpveiculos.model.veiculos.caracteristicas.carro;

/**
 * Nesta enumeração está contida todas o nome de todas as montadoras de carros
 * que servem a loja.
 * 
 * @author Carlos Renato
 * @version 23-04-2015
 *
 */
public enum Montadora {

	VOLKSWAGEN("Volkswagen"), FIAT("Fiat"), CHEVROLET("Chevrolet"), FORD("Ford"), RENAULT(
			"Renault"), GM("GM"), PEUGEUOT("Peogeuot"), HONDA("Honda"), NISSAN(
			"Nissan"), HYUNDAI("Hyundai"), TOYOTA("Toyota"), MERCEDESBENZ(
			"Mercedes-Benz"), BMW("BMW"), AUDI("Audi"), VOLVO("Volvo"), CITROEN(
			"Citroen"), JAC("Kac"), KIA("Kia"), CHRYSLER("Chrysler"), MITSUBISHI(
			"Mitsubishi"), CHERY("Chery"), LANDROVER("Land Rover"), SUZUKI(
			"Suzuki");
	
	private String montadora;

	/*Construtor*/
	/**
	 * @param montadora
	 */
	private Montadora(String montadora) {
		this.montadora = montadora;
	}

	/*Getter*/
	/**
	 * @return  montadora
	 */
	public String getMontadora() {
		return montadora;
	}

}
