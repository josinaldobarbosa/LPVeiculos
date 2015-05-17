package lpveiculos.model.veiculos;

import lpveiculos.model.veiculos.caracteristicas.Cor;
import lpveiculos.model.veiculos.caracteristicas.carro.Cambio;
import lpveiculos.model.veiculos.caracteristicas.carro.Montadora;
import lpveiculos.model.veiculos.caracteristicas.carro.Tipo;

/**
 * Classe que representa um carro da loja e todas as suas informações.
 * 
 * @author Carlos Renato
 * @version 23-04-2015
 * 
 */
public final class Carro extends Veiculo {

	/* Variáveis de instância */
	private Montadora montadora;
	private Tipo tipo;
	private float motorizacao;
	private Cambio cambio;

	/* Construtor */
	/**
	 * Construtor para o cadastro de carros
	 * 
	 * @param chassi
	 *            Número do chassi do carro
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
	 *            Motorização do carro
	 * @param cambio
	 *            Tipo de câmbio do carro
	 */
	public Carro(String chassi, String modelo, Cor cor, float preco,
			Montadora montadora, Tipo tipo, float motorizacao, Cambio cambio) {
		super(chassi, modelo, cor, preco);
		this.montadora = montadora;
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
	public String getMontadora() {
		return montadora.getMontadora();
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
	 * Retorna o tipo do carro
	 * 
	 * @return tipo do carro
	 */
	public String getTipo() {
		return tipo.getTipo();
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
		return cambio.getCambio();
	}

	/**
	 * Substitui o cambio do carro
	 * 
	 * @param cambio
	 *            o novo cambio
	 */
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}

	/**
	 * Retorna a motorização do carro
	 * 
	 * @return motorização do carro
	 */
	public float getMotorizacao() {
		return motorizacao;
	}

	/**
	 * Substitui a motorização do carro
	 * 
	 * @param motorizacao
	 *            a nova motorização
	 */
	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}

}
