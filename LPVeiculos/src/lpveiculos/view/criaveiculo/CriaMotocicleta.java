package lpveiculos.view.criaveiculo;

import java.util.ArrayList;
import java.util.List;

import lpveiculos.model.veiculos.Motocicleta;
import lpveiculos.model.veiculos.caracteristicas.Cor;
import lpveiculos.model.veiculos.caracteristicas.motocicleta.Montadora;
import lpveiculos.model.veiculos.caracteristicas.motocicleta.Tipo;
import lpveiculos.view.Utilidades;

public class CriaMotocicleta {

	// Bloqueia criação de objetos
	private CriaMotocicleta() {
	}

	// Cria Motocicleta
	public static Motocicleta cria() {
		int contador;

		System.out.println("\n[--------- ADICIONA MOTOCICLETA ---------]\n");

		System.out.print(" Chassi: ");
		String chassi = Utilidades.in.next();

		// Enum Montadora
		Montadora montadora = null;
		do {
			System.out
					.println("\n[------ MONTADORA DA MOTOCICLETA --------]\n");
			List<Montadora> montadoras = new ArrayList<>();
			contador = 0;
			for (Montadora montadoraE : Montadora.values()) {
				System.out.println(" " + (contador + 1) + ": "
						+ montadoraE.getMontadora());
				montadoras.add(montadoraE);
				contador++;
			}
			System.out.print("\n Montadora: ");
			int indice = Utilidades.in.nextInt() - 1;

			if (Utilidades.validaEnumEscolhido(indice, montadoras)) {
				montadora = montadoras.get(indice);
			} else {
				System.out.println("\nErro: Montadora inválida");
			}
		} while (montadora == null);
		//

		System.out.print(" Modelo: ");
		String modelo = Utilidades.in.next();

		// Enum Tipo
		Tipo tipo = null;
		do {
			System.out
					.println("\n[-------- TIPO DA MOTOCICLETA -----------]\n");
			List<Tipo> tipos = new ArrayList<>();
			contador = 0;
			for (Tipo tipoE : Tipo.values()) {
				System.out.println(" " + (contador + 1) + ": "
						+ tipoE.getTipo());
				tipos.add(tipoE);
				contador++;
			}
			System.out.print("\n Tipo: ");
			int indice = Utilidades.in.nextInt() - 1;

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
			System.out
					.println("\n[---------- COR DA MOTOCICLETA ----------]\n");
			List<Cor> cores = new ArrayList<>();
			contador = 0;
			for (Cor corE : Cor.values()) {
				System.out.println(" " + (contador + 1) + ": " + corE.getCor());
				cores.add(corE);
				contador++;
			}
			System.out.print("\n Cor: ");
			int indice = Utilidades.in.nextInt() - 1;

			if (Utilidades.validaEnumEscolhido(indice, cores)) {
				cor = cores.get(indice);
			} else {
				System.out.println("\nErro: Cor inválida");
			}
		} while (cor == null);
		//

		System.out.print(" Preço: ");
		float preco = Utilidades.in.nextFloat();

		System.out.print(" Cilindrada: ");
		int cilindrada = Utilidades.in.nextInt();

		System.out.print(" Capacidade do tanque: ");
		float capacidadeDoTanque = Utilidades.in.nextFloat();

		System.out.println("\n[----------------------------------------]");

		return new Motocicleta(chassi, modelo, montadora, tipo, cor, preco,
				cilindrada, capacidadeDoTanque);
	}

}
