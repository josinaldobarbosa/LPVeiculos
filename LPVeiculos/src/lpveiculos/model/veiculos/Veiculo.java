package lpveiculos.model.veiculos;

import lpveiculos.model.veiculos.caracteristicas.Cor;

/**
 * Super classe abstrata que contém caracteristicas em comum em todos os
 * veiculos.
 *
 * @author Josinaldo A.Barbosa
 * @version 26-04-2015
 * 
 */
public abstract class Veiculo {

	/* Variáveis de instância */
	private String chassi;
	private String modelo;
	private Cor cor;
	private float preco;

	/* Construtores */
	/**
	 * Construtor que recebe obrigatoriamente todas as suas variáveis de
	 * instancia.
	 * 
	 * @param chassi
	 *            Chassi do veiculo
	 * @param cor
	 *            Cor do veiculo
	 * @param preco
	 *            Preço do veiculo
	 */
	protected Veiculo(String chassi, String modelo, Cor cor, float preco) {
		this.chassi = chassi;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
	}

	/* Métodos */
	// Veiculos são iguais se possuirem o mesmo chassi
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (chassi == null) {
			if (other.chassi != null)
				return false;
		} else if (!chassi.equals(other.chassi))
			return false;
		return true;
	}

	/* Getters e Setters */
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
	 * Retorna a cor do veiculo.
	 * 
	 * @return cor do veiculo
	 */
	public String getCor() {
		return cor.getCor();
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
