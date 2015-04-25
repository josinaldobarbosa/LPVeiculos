package lpveiculos.model.veiculos;

import lpveiculos.model.veiculos.caracteristicas.Cor;
import lpveiculos.model.veiculos.caracteristicas.carro.Modelos;
import lpveiculos.model.veiculos.caracteristicas.carro.Montadora;
import lpveiculos.model.veiculos.caracteristicas.carro.Tipo;

/**
 * Classe que representa um carro da loja e todas as suas informa��es.
 * 
 * @author Carlos Renato
 * @version 23-04-2015
 * 
 */
public class Carro extends Veiculo {

	/* Vari�veis de inst�ncia */
	private Montadora montadora;
	private Modelos modelo;
	private Tipo tipo;
	private float motorizacao;
	private String cambio;

	/* Construtor */
	/**
	 * Construtor para o cadastro de carros
	 * 
	 * @param chassi
	 *            N�mero do chassi do carro
	 * @param cor
	 *            Nome da cor do carro
	 * @param preco
	 *            Valor do carro
	 * @param montadora
	 *            Nome da montadora do carro
	 * @param modelo
	 *            Nome do modelo do carro
	 * @param tipo
	 *            Nome da categoria do carro
	 * @param motorizacao
	 *            Motoriza��o do carro
	 * @param cambio
	 *            Tipo de c�mbio do carro
	 */
	public Carro(String chassi, Cor cor, float preco, Montadora montadora,
			Modelos modelo, Tipo tipo, float motorizacao, String cambio) {
		super(chassi, cor, preco);
		this.montadora = montadora;
		this.modelo = modelo;
		this.tipo = tipo;
		this.motorizacao = motorizacao;
		this.cambio = cambio;
	}

	/* Getters e Setters */
	/**
	 * Retorna a montadora do carro
	 * 
	 * @return montadora do carro
	 */
	public Montadora getMontadora() {
		return montadora;
	}

	/**
	 * Substitui a montadora do carro
	 * 
	 * @param montadora
	 *            a nova montadora
	 */
	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}

	/**
	 * Retorna o modelo do carro
	 * 
	 * @return modelo do carro
	 */
	public Modelos getModelo() {
		return modelo;
	}

	/**
	 * Substitui o modelo do carro
	 * 
	 * @param modelo
	 *            o novo modelo
	 */
	public void setModelo(Modelos modelo) {
		this.modelo = modelo;
	}

	/**
	 * Retorna o tipo do carro
	 * 
	 * @return tipo do carro
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * Substitui o tipo do carro
	 * 
	 * @param tipo
	 *            o novo tipo
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * Retorna o cambio do carro
	 * 
	 * @return cambio do carro
	 */
	public String getCambio() {
		return cambio;
	}

	/**
	 * Substitui o cambio do carro
	 * 
	 * @param cambio
	 *            o novo cambio
	 */
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	/**
	 * Retorna a motoriza��o do carro
	 * 
	 * @return motoriza��o do carro
	 */
	public float getMotorizacao() {
		return motorizacao;
	}

	/**
	 * Substitui a motoriza��o do carro
	 * 
	 * @param motorizacao
	 *            a nova motoriza��o
	 */
	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}

}
