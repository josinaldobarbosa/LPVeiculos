package model.veiculos.caracteristicas.carro;

/**
 * Nesta enumera��o est� contida todas as categorias dos carros disponibilizados pela loja.
 * @author Carlos Renato
 * @version 23-04-2015
 *
 */
public enum Categorias {
	ENTRADA("Entrada"), HATCHPEQUENO("Hatch Pequeno"), HATCHMEDIO ("Hatch M�dio"),
	SEDANPEQUENO("Sedan Pequeno"), SEDANCOMPACTO ("Sedan Compacto"), SEDANMEDIO("Sedan M�dio"),
	SEDANGRANDE ("Sedan Grande"), SWMEDIO("SW M�dio"), SWGRANDE ("SW Grande"),
	MONOCAB ("Monocab"), GRANDCAB ("Grandcab"), SPORT("Sport"),
	PICKUPPEPEQUENA("Pick-up Pequena"), PICKUPPEGRANDE("Pick-up"), FURGAO("Furg�o"),
	FURGAOPEQUENO("Furg�o Pequeno"), SUV("SUV");
	
	private String categoria;

	/*Construtor*/
	/**
	 * @param categoria
	 */
	Categorias(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return a categoria
	 */
	public String getCategoria() {
		return categoria;
	}
}
