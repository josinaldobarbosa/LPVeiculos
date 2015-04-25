package lpveiculos.model.veiculos;

import lpveiculos.model.veiculos.caracteristicas.Cor;

/**
 * Super classe abstrata que cont�m caracteristicas em comum em todos os
 * veiculos.
 *
 * @author Josinaldo A.Barbosa
 * @version 23-04-2015
 * 
 */
public abstract class Veiculo {

	/* Vari�veis de instancia */
	private String chassi;
	private Cor cor;
	private float preco;

	/* Construtores */
	/**
	 * Construtor que recebe obrigatoriamente todas as suas vari�veis de
	 * instancia.
	 * 
	 * @param chassi
	 *            Chassi do veiculo
	 * @param cor
	 *            Cor do veiculo
	 * @param preco
	 *            Pre�o do veiculo
	 */
	public Veiculo(String chassi, Cor cor, float preco) {
		this.chassi = chassi;
		this.cor = cor;
		this.preco = preco;
	}

	/* M�todos */
	// Veiculos s�o iguais se possuirem o mesmo chassi
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
	 * Retorna a cor do veiculo.
	 * 
	 * @return cor do veiculo
	 */
	public String getCor() {
		return cor.getCor();
	}

	/**
	 * Retorna o pre�o do veiculo.
	 * 
	 * @return pre�o do veiculo
	 */
	public float getPreco() {
		return preco;
	}

	/**
	 * Substitui o pre�o do veiculo.
	 * 
	 * @param preco
	 *            o novo pre�o
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
