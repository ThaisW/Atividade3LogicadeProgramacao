package br.com.thaisaraujo.acidentedetransito.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.thaisaraujo.acidentedetransito.model.Cidade;

public class Teste {

	public static List<Cidade> cidades = new ArrayList<>();

	public static void adicionarCidadesAoCadastro() {
		String resultado = "N";

		do {

			Cidade cidade = new Cidade();
			cidade.setCodigoCidade(JOptionPane.showInputDialog("Digite o codigo da cidade: "));
			cidade.setNumeroDeAcidentesDeTransitoComVitimas(
					Integer.parseInt(JOptionPane.showInputDialog("Digite o número de veiculos de passeio: ")));
			cidade.setNumeroVeiculosDePasseio(Integer
					.parseInt(JOptionPane.showInputDialog("Digite o número de acidentes de trânsito com vítimas:")));

			cidades.add(cidade);

			resultado = JOptionPane.showInputDialog("Deseja adicionar outra cidade?(S/N):  ");
		} while (resultado.equals("S"));

	}

	public static Cidade maiorIndiceDeAcidente() {
		Cidade cidade = new Cidade();
		int maiorIndice = 0;
		for (Cidade c : cidades) {
			if (c.getNumeroDeAcidentesDeTransitoComVitimas() > maiorIndice) {
				maiorIndice = c.getNumeroDeAcidentesDeTransitoComVitimas();
				cidade = c;

			}

		}
		JOptionPane.showMessageDialog(null, "Codido da cidade: " + cidade.getCodigoCidade());
		JOptionPane.showMessageDialog(null,
				"Numero de acidentes: " + cidade.getNumeroDeAcidentesDeTransitoComVitimas());
		return cidade;

	}

	public static Cidade menorIndiceDeAcidente() {
		Cidade cidade = new Cidade();
		int menorIndice = 0;
		for (Cidade c : cidades) {
			if (c.getNumeroDeAcidentesDeTransitoComVitimas() < menorIndice) {
				menorIndice = c.getNumeroDeAcidentesDeTransitoComVitimas();
				cidade = c;

			}

		}
		JOptionPane.showMessageDialog(null, "Codido da cidade: " + cidade.getCodigoCidade());
		JOptionPane.showMessageDialog(null,
				"Numero de acidentes: " + cidade.getNumeroDeAcidentesDeTransitoComVitimas());
		return cidade;

	}

	public static void mediaDeVeiculos() {

		int somaVeiculos = 0;
		int mediaVeiculos = 0;

		for (Cidade c : cidades) {
			somaVeiculos = somaVeiculos + c.getNumeroVeiculosDePasseio();
		}

		mediaVeiculos = somaVeiculos / cidades.size();
		JOptionPane.showMessageDialog(null,
				"A média de veiculos das cidades cadastradas(" + cidades.size() + ") é de: " + mediaVeiculos);
	}

	public static void mediaDeAcidentesEmCidadesComMenosDe2000Veiculos() {
		Cidade cidade = new Cidade();
		int somaVeiculos = 0;
		int mediaVeiculos = 0;

		if (cidade.getNumeroVeiculosDePasseio() < 2000) {
			for (Cidade c : cidades) {
				somaVeiculos = somaVeiculos + c.getNumeroVeiculosDePasseio();
			}

			mediaVeiculos = somaVeiculos / cidades.size();
			JOptionPane.showMessageDialog(null,
					"A média de veiculos das cidades cadastradas(" + cidades.size() + ") é de: " + mediaVeiculos);

		}
	}

	public static void main(String[] args) {

		adicionarCidadesAoCadastro();
		maiorIndiceDeAcidente();
		menorIndiceDeAcidente();
		mediaDeVeiculos();

	}
}
