package br.com.lpveiculos.model.veiculos;

public class Veiculo {

	/* Variáveis de instancia */
	private String chassi;
	private String montadora;
	private String modelo;
	private String tipo;
	private String cor;
	private float preco;

	/* Construtor */
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
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
