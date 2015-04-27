package lpveiculos.model.veiculos.caracteristicas.carro;

/**
 * Nesta enumera��o est� contida todas as categorias dos carros disponibilizados
 * pela loja.
 * 
 * @author Carlos Renato
 * @version 26-04-2015
 *
 */
public enum Tipo {

	ENTRADA("Entrada"), HATCHPEQUENO("Hatch Pequeno"), HATCHMEDIO("Hatch M�dio"), SEDANPEQUENO(
			"Sedan Pequeno"), SEDANCOMPACTO("Sedan Compacto"), SEDANMEDIO(
			"Sedan M�dio"), SEDANGRANDE("Sedan Grande"), SWMEDIO("SW M�dio"), SWGRANDE(
			"SW Grande"), MONOCAB("Monocab"), GRANDCAB("Grandcab"), SPORT(
			"Sport"), PICKUPPEPEQUENA("Pick-up Pequena"), PICKUPPEGRANDE(
			"Pick-up"), FURGAO("Furg�o"), FURGAOPEQUENO("Furg�o Pequeno"), SUV(
			"SUV");

	private String tipo;

	/* Construtor */
	/**
	 * @param tipo
	 */
	private Tipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return a tipo
	 */
	public String getTipo() {
		return tipo;
	}

}
