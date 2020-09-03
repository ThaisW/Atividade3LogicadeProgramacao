package br.com.thaisaraujo.acidentedetransito.model;

public class Cidade {
	
	private String codigoCidade;
	private int numeroVeiculosDePasseio;
	private int numeroDeAcidentesDeTransitoComVitimas;
	
	public String getCodigoCidade() {
		return codigoCidade;
	}
	public void setCodigoCidade(String codigoCidade) {
		this.codigoCidade = codigoCidade;
	}
	public int getNumeroVeiculosDePasseio() {
		return numeroVeiculosDePasseio;
	}
	public void setNumeroVeiculosDePasseio(int numeroVeiculosDePasseio) {
		this.numeroVeiculosDePasseio = numeroVeiculosDePasseio;
	}
	public int getNumeroDeAcidentesDeTransitoComVitimas() {
		return numeroDeAcidentesDeTransitoComVitimas;
	}
	public void setNumeroDeAcidentesDeTransitoComVitimas(int numeroDeAcidentesDeTransitoComVitimas) {
		this.numeroDeAcidentesDeTransitoComVitimas = numeroDeAcidentesDeTransitoComVitimas;
	}

}

