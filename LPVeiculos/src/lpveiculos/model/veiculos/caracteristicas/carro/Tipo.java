package lpveiculos.model.veiculos.caracteristicas.carro;

/**
 * Nesta enumeração está contida todas as categorias dos carros disponibilizados
 * pela loja.
 * 
 * @author Carlos Renato
 * @version 26-04-2015
 *
 */
public enum Tipo {

	ENTRADA         ("Entrada"),
	HATCHPEQUENO    ("Hatch Pequeno"),
	HATCHMEDIO      ("Hatch Médio"),
	SEDANPEQUENO    ("Sedan Pequeno"),
	SEDANCOMPACTO   ("Sedan Compacto"),
	SEDANMEDIO      ("Sedan Médio"),
	SEDANGRANDE     ("Sedan Grande"),
	SWMEDIO         ("SW Médio"),
	SWGRANDE        ("SW Grande"),
	MONOCAB         ("Monocab"),
	GRANDCAB        ("Grandcab"),
	SPORT           ("Sport"),
	PICKUPPEPEQUENA ("Pick-up Pequena"),
	PICKUPPEGRANDE  ("Pick-up"),
	FURGAO          ("Furgão"),
	FURGAOPEQUENO   ("Furgão Pequeno"),
	SUV             ("SUV");

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
