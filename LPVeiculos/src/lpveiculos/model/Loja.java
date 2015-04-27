package lpveiculos.model;

import java.util.ArrayList;
import java.util.Collections;

import lpveiculos.model.veiculos.*;

/**
 * Classe que representa uma Loja de automóveis que contém todas as informações
 * sobre a mesma.
 *
 * @author Josinaldo A.Barbosa
 * @version 19-04-2015
 * 
 */
public class Loja {

	/* Variáveis de instancia */
	private String endereco;
	private String nome;
	private ArrayList<Carro> estoqueDeCarros = new ArrayList<>();
	private ArrayList<Motocicleta> estoqueDeMotocicletas = new ArrayList<>();

	/* Construtores */
	/**
	 * Construtor que recebe o endereço e nome da loja.
	 * 
	 * @param endereco
	 *            Endereço da loja
	 * @param nome
	 *            Nome da loja
	 */
	public Loja(String endereco, String nome) {
		this.endereco = endereco;
		this.nome = nome;
	}

	/* Métodos */
	/**
	 * Adiciona um Carro a uma lista de Carro.
	 * 
	 * @param carro
	 *            O Carro a ser adicionado
	 */
	public void adicionaVeiculo(Carro carro) {
		// Verifica se não contém o mesmo carro no estoque
		if (Collections.frequency(estoqueDeCarros, carro) == 0) {
			estoqueDeCarros.add(carro);
		}
	}

	/**
	 * Adiciona uma Motocicleta a uma lista de Motocicleta.
	 * 
	 * @param motocicleta
	 *            A Motocicleta a ser adicionado
	 */
	public void adicionaVeiculo(Motocicleta motocicleta) {
		// Verifica se não contém a mesma motocicleta no estoque
		if (Collections.frequency(estoqueDeMotocicletas, motocicleta) == 0) {
			estoqueDeMotocicletas.add(motocicleta);
		}
	}

	/**
	 * Remove um Carro
	 * 
	 * @param carro
	 *            carro a ser removido
	 */
	public void removeVeiculo(Carro carro) {
		estoqueDeCarros.remove(carro);
	}

	/**
	 * Remove uma motocicleta
	 * 
	 * @param motocicleta
	 *            motocicleta a ser removida
	 */
	public void removeVeiculo(Motocicleta motocicleta) {
		estoqueDeMotocicletas.remove(motocicleta);
	}

	/* Get's e Set's */
	/**
	 * Retona o endereço da loja.
	 * 
	 * @return endereço da loja
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Substitui o endereço da loja.
	 * 
	 * @param endereco
	 *            o novo endereço
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * Retorna o nome da loja.
	 * 
	 * @return nome da loja
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Substitui o nome da loja.
	 * 
	 * @param nome
	 *            o novo nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a lista de Carro.
	 * 
	 * @return ArrayList de Carro
	 */
	public ArrayList<Carro> getEstoqueDeCarros() {
		return estoqueDeCarros;
	}

	/**
	 * Substitui a lista de Carro.
	 * 
	 * @param estoqueDeCarros
	 *            a nova lista
	 */
	public void setEstoqueDeCarros(ArrayList<Carro> estoqueDeCarros) {
		this.estoqueDeCarros = estoqueDeCarros;
	}

	/**
	 * Retorna a lista de Motocicleta.
	 * 
	 * @return ArrayList de Motocicleta
	 */
	public ArrayList<Motocicleta> getEstoqueDeMotocicleta() {
		return estoqueDeMotocicletas;
	}

	/**
	 * Substitui a lista de Motocicleta.
	 * 
	 * @param estoqueDeMotocicleta
	 *            a nova lista
	 */
	public void setEstoqueDeMotocicleta(ArrayList<Motocicleta> estoqueDeMotocicleta) {
		this.estoqueDeMotocicletas = estoqueDeMotocicleta;
	}

}
