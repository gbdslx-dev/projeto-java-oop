package br.com.generation.projeto_bloco1;

import java.lang.reflect.Array;

public class FiltroDoacao {

	public void FiltrarPorRegiao(Crianca[] listaCriancas, Beneficiador b) {		
		for(int i = 0; i < listaCriancas.length; i++) {
			if(b.regiaoPref ==listaCriancas[i].getRegiao()) {
				System.out.println("-------------");
				listaCriancas[i].Imprimir();
			}
		}
		
	}
	public void FiltrarPorValor(Crianca[] listaCriancas,Beneficiador b) {
		for(int i = 0; i < listaCriancas.length; i++) {
			if(b.valorPref >= listaCriancas[i].getValor()) {
				System.out.println("-------------");
				listaCriancas[i].Imprimir();
			}
		}
	}
	public void FiltrarPorIdade(Crianca[] listaCriancas,Beneficiador b) {
		for(int i = 0; i < listaCriancas.length; i++) {
			if(b.idadeMin <= listaCriancas[i].getIdade() && listaCriancas[i].getIdade() <= b.idadeMax) {
				System.out.println("-------------");
				listaCriancas[i].Imprimir();
			}
		}
	}
	public Crianca FiltrarPorID(Crianca[] listaCriancas, int id) {
		Crianca crianca = new Crianca();
		for(int i = 0; i < listaCriancas.length; i++) {
			if(id == listaCriancas[i].getId()) {
				crianca = listaCriancas[i];
			}
		}
		return crianca;
	}
	
}
