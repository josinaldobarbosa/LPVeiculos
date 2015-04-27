package lpveiculos.model.veiculos;

import lpveiculos.model.veiculos.caracteristicas.Cor;
import lpveiculos.model.veiculos.caracteristicas.motocicleta.Montadora;
import lpveiculos.model.veiculos.caracteristicas.motocicleta.Tipo;

/**
 * Classe que representa uma motocicleta da loja.
 * 
 * @author Wallace Jonathan
 * @version 19-04-2015
 *
 */
public class Motocicleta extends Veiculo {

	/* Vari�veis de inst�ncia */
	private Montadora montadora;
	private Tipo tipo;
	private int cilindrada;
	private float capacidadeDoTanque;

	/* Construtores */
	/**
	 * Construtor que cadastra um ve�culo.
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
	 *            Pre�o da moto
	 * @param cilindrada
	 * 
	 * @param cilindrada
	 *            Cilindrada da moto
	 * @param capacidadeDoTanque
	 * 
	 * @param capacidadeDoTanque
	 *            Capacidade do tanque da moto
	 */
	public Motocicleta(String chassi, String modelo, Montadora montadora,
			Tipo tipo, Cor cor, float preco, int cilindrada,
			float capacidadeDoTanque) {
		super(chassi, modelo, cor, preco);
		this.montadora = montadora;
		this.tipo = tipo;
		this.cilindrada = cilindrada;
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

	/* Get's e Set's */
	/**
	 * Retorna a cilindrada da moto.
	 * 
	 * @return cilindrada da moto
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * Substitui a cilindrada da moto.
	 * 
	 * @param cilindrada
	 *            a nova cilindrada
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * Retorna a capacidade do tanque
	 * 
	 * @return capacidade do tanque
	 */
	public float getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}

	/**
	 * Substitui a capacidade do tanque
	 * 
	 * @param capacidadeDoTanque
	 *            a nova capacidade
	 */
	public void setCapacidadeDoTanque(float capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

	/**
	 * Retorna a montadora da motocicleta
	 * 
	 * @return a montadora
	 */
	public String getMontadora() {
		return montadora.getMontadora();
	}

	/**
	 * Substitui a montadora da motocicleta
	 * 
	 * @param montadora
	 *            a nova montadora
	 */
	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}

	/**
	 * Retorna o tipo de motocicleta
	 * 
	 * @return o tipo
	 */
	public String getTipo() {
		return tipo.getTipo();
	}

	/**
	 * Substitui o tipo da motocicleta
	 * 
	 * @param tipo
	 *            o novo tipo
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
