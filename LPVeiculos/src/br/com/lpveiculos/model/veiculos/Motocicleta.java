package br.com.lpveiculos.model.veiculos;

/**
 * Classe que representa uma motocicleta da loja.
 * 
 * @author Wallace Jonathan
 * @version 19-04-2015
 *
 */

public class Motocicleta {
	
	/* Variáveis de instância */
	private int cilindrada;
	private float capacidadeDoTanque;
	
	/* Construtores */
	/**
	 * Construtor que cadastra um veículo.
	 * 
	 * @param chass
	 * 			Chassi da moto
	 * 
	 * @param montadora
	 * 			Montadora da moto
	 * 
	 * @param modelo
	 * 			Modelo da moto
	 * 
	 * @param tipo
	 * 			Tipo da moto
	 * 
	 * @param cor
	 * 			Cor da moto
	 * 
	 * @param preco
	 * 			Preço da moto
	 * 
	 * @param cilindrada
	 * 			Cilindrada da moto
	 * 
	 * @param capacidadeDoTanque
	 * 			Capacidade do tanque da moto
	 * @return 
	 * 
	 * 
	 */
	
	public void Carro(String chassi, String montadora, String modelo, String tipo, String cor, String preco,
						int cilindrada, float capacidadeDoTanque) {
		
		this.cilindrada = cilindrada;
		this.capacidadeDoTanque = capacidadeDoTanque;
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
