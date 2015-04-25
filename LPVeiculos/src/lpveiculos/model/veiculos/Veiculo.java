package lpveiculos.model.veiculos;

import lpveiculos.model.veiculos.caracteristicas.Cor;

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
	public Veiculo(String chassi, Cor cor, float preco) {
		this.chassi = chassi;
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
