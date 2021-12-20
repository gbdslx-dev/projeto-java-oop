package br.com.generation.projeto_bloco1;

public class Doacao {
	
	Beneficiador Doador;
	Crianca Beneficiado;
	
	public Doacao(Beneficiador doador,Crianca beneficiado) {
		Doador = doador;
		Beneficiado = beneficiado;
	}
	
	public void Relatorio() {
		Doador.Imprimir();
		Beneficiado.Imprimir();
	}
}
