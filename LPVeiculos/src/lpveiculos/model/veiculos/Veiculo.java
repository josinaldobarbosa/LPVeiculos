package lpveiculos.model.veiculos;

/**
 * Super classe abstrata que contém caracteristicas em comum em todos os
 * veiculos.
 *
 * @author Josinaldo A.Barbosa
 * @version 23-04-2015
 * 
 */
public abstract class Veiculo {

	/* Variáveis de instancia */
	private String chassi;
	private Montadora montadora;
	private Modelo modelo;
	private Tipo tipo;
	private Cor cor;
	private float preco;

	/* Construtores */
	/**
	 * Construtor que recebe obrigatoriamente todas as suas variáveis de
	 * instancia.
	 * 
	 * @param chassi
	 *            Chassi do veiculo
	 * @param montadora
	 *            Montadora do veiculo
	 * @param modelo
	 *            Modelo do veiculo
	 * @param tipo
	 *            Tipo do veiculo
	 * @param cor
	 *            Cor do veiculo
	 * @param preco
	 *            Preço do veiculo
	 */
	protected Veiculo(String chassi, String montadora, String modelo,
			String tipo, String cor, float preco) {
		this.chassi = chassi;
		this.montadora = montadora;
		this.modelo = modelo;
		this.tipo = tipo;
		this.cor = cor;
		this.preco = preco;
	}

	/* Get's e Set's */
	/**
	 * Retorna o chassi do veiculo.
	 * 
	 * @return chassi do veiculo
	 */
	public String getChassi() {
		return chassi;
	}

	/**
	 * Substitui o chassi do veiculo.
	 * 
	 * @param chassi
	 *            o novo chassi
	 */
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	/**
	 * Retorna a montadora do veiculo.
	 * 
	 * @return montadora do veiculo
	 */
	public String getMontadora() {
		return montadora;
	}

	/**
	 * Substitui a montadora do veiculo.
	 * 
	 * @param montadora
	 *            a nova montadora
	 */
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	/**
	 * Retorna o modelo do veiculo.
	 * 
	 * @return modelo do veiculo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Substitui o modelo do veiculo.
	 * 
	 * @param modelo
	 *            o novo modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Retorna o tipo do veiculo.
	 * 
	 * @return tipo do veiculo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Substitui o tipo do veiculo.
	 * 
	 * @param tipo
	 *            o novo tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Retorna a cor do veiculo.
	 * 
	 * @return cor do veiculo
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * Substitui a cor do veiculo.
	 * 
	 * @param cor
	 *            a nova cor
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * Retorna o preço do veiculo.
	 * 
	 * @return preço do veiculo
	 */
	public float getPreco() {
		return preco;
	}

	/**
	 * Substitui o preço do veiculo.
	 * 
	 * @param preco
	 *            o novo preço
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
