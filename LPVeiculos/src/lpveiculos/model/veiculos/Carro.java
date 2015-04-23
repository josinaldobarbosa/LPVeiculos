package lpveiculos.model.veiculos;

/**
 * Classe que representa um carro da loja e todas as suas informa��es.
 * 
 * @author Carlos Renato
 * @version 23-04-2015
 */

public class Carro extends Veiculo{
	
	/*Vari�veis de inst�ncia*/
	private float motorizacao;
	private String cambio;
	
	/*Construtor*/
	/**
	 * Construtor para o cadastro de carros
	 * 
	 * @param chassi
	 * 				N�mero do chassi do carro
	 * @param montadora
	 * 				Nome da montadora do carro
	 * @param modelo
	 * 				Nome do modelo do carro
	 * @param tipo
	 * 				Nome da categoria do carro
	 * @param cor
	 * 				Nome da cor do carro
	 * @param preco
	 * 				Valor do carro em reais (R$)
	 */
	
	protected Carro(String chassi, String montadora, String modelo,
			String tipo, String cor, float preco) {
		super(chassi, montadora, modelo, tipo, cor, preco);
	}

	/**
	 * @return a motorizacao
	 */
	public float getMotorizacao() {
		return motorizacao;
	}

	/**
	 * @param motorizacao the motorizacao to set
	 */
	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}

	/**
	 * @return the cambio
	 */
	public String getCambio() {
		return cambio;
	}

	/**
	 * @param cambio the cambio to set
	 */
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	
	
	
	
	

}
