package br.com.lpveiculos.model.veiculos;

/**
 * Classe que representa uma motocicleta da loja.
 * 
 * @author Wallace Jonathan
 * @version 19-04-2015
 *
 */

public class Motocicleta extends Veiculo {

	/* Variáveis de instância */
	private int cilindrada;
	private float capacidadeDoTanque;

	/* Construtores */
	/**
	 * Construtor que cadastra um veículo.
	 * 
	 * @param chass
	 *            Chassi da moto
	 * 
	 * @param montadora
	 *            Montadora da moto
	 * 
	 * @param modelo
	 *            Modelo da moto
	 * 
	 * @param tipo
	 *            Tipo da moto
	 * 
	 * @param cor
	 *            Cor da moto
	 * 
	 * @param preco
	 *            Preço da moto
	 * 
	 * @param cilindrada
	 *            Cilindrada da moto
	 * 
	 * @param capacidadeDoTanque
	 *            Capacidade do tanque da moto
	 * 
	 * 
	 * 
	 */

	protected Motocicleta(String chassi, String montadora, String modelo,
			String tipo, String cor, float preco) {
		super(chassi, montadora, modelo, tipo, cor, preco);
	}

	/* Get's e Set's */

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public float getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}

	public void setCapacidadeDoTanque(float capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

}
