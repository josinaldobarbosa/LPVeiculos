package lpveiculos.view.criaveiculo;

import java.util.ArrayList;
import java.util.List;

import lpveiculos.model.veiculos.Carro;
import lpveiculos.model.veiculos.caracteristicas.Cor;
import lpveiculos.model.veiculos.caracteristicas.carro.Cambio;
import lpveiculos.model.veiculos.caracteristicas.carro.Montadora;
import lpveiculos.model.veiculos.caracteristicas.carro.Tipo;
import lpveiculos.view.Utilidades;

public class CriaCarro {
	
	// Bloqueia criação de objetos
	private CriaCarro() {
	}

	// Cria Carro
	public static Carro cria() {
		int contador;

		System.out.println("\n[------------ ADICIONA CARRO ------------]\n");

		System.out.print(" Chassi: ");
		String chassi = Utilidades.in.nextLine();

		// Enum Montadora
		Montadora montadora = null;
		do {
			System.out.println("\n[---------- MONTADORA DO CARRO ----------]\n");
			List<Montadora> montadoras = new ArrayList<>();
			contador = 0;
			for (Montadora montadoraE : Montadora.values()) {
				System.out.println(" " + (contador + 1) + ": " + montadoraE.getMontadora());
				montadoras.add(montadoraE);
				contador++;
			}
			int indice = Utilidades.entradaDeInteiro("\n Montadora: ") - 1;

			if (Utilidades.validaEnumEscolhido(indice, montadoras)) {
				montadora = montadoras.get(indice);
			} else {
				System.err.println("\nErro: Montadora inválida");
			}
		} while (montadora == null);
		//

		System.out.print(" Modelo: ");
		String modelo = Utilidades.in.nextLine();

		// Enum Tipo
		Tipo tipo = null;
		do {
			System.out.println("\n[------------ TIPO DO CARRO -------------]\n");
			List<Tipo> tipos = new ArrayList<>();
			contador = 0;
			for (Tipo tipoE : Tipo.values()) {
				System.out.println(" " + (contador + 1) + ": " + tipoE.getTipo());
				tipos.add(tipoE);
				contador++;
			}
			int indice = Utilidades.entradaDeInteiro("\n Tipo: ") - 1;

			if (Utilidades.validaEnumEscolhido(indice, tipos)) {
				tipo = tipos.get(indice);
			} else {
				System.out.println("\nErro: Tipo inválido");
			}
		} while (tipo == null);
		//

		// Enum Cor
		Cor cor = null;
		do {
			System.out.println("\n[------------ COR DO CARRO --------------]\n");
			List<Cor> cores = new ArrayList<>();
			contador = 0;
			for (Cor corE : Cor.values()) {
				System.out.println(" " + (contador + 1) + ": " + corE.getCor());
				cores.add(corE);
				contador++;
			}
			int indice = Utilidades.entradaDeInteiro("\n Cor: ") - 1;

			if (Utilidades.validaEnumEscolhido(indice, cores)) {
				cor = cores.get(indice);
			} else {
				System.out.println("\nErro: Cor inválido");
			}
		} while (cor == null);
		//
		
		float preco = Utilidades.entradaDeFloat(" Preço: ");

		float motorizacao = Utilidades.entradaDeFloat(" Motorização: ");

		// Enum Cambio
		Cambio cambio = null;
		do {
			System.out.println("\n[----------- CAMBIO DO CARRO ------------]\n");
			List<Cambio> cambios = new ArrayList<>();
			contador = 0;
			for (Cambio cambioE : Cambio.values()) {
				System.out.println(" " + (contador + 1) + ": " + cambioE.getCambio());
				cambios.add(cambioE);
				contador++;
			}
			int indice = Utilidades.entradaDeInteiro("\n Câmbio: ") - 1;

			if (Utilidades.validaEnumEscolhido(indice, cambios)) {
				cambio = cambios.get(indice);
			} else {
				System.out.println("\nErro: Cambio inválido");
			}
		} while (cambio == null);
		//

		System.out.println("\n[----------------------------------------]");

		return new Carro(chassi, modelo, cor, preco, montadora, tipo,
				motorizacao, cambio);
	}

}
