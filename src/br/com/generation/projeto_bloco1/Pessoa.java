package br.com.generation.projeto_bloco1;

public class Pessoa {
	public String nome;
	public String regiao;
	public String telefone;
	public Pessoa() {}
	public Pessoa(String n, char r, String t) {
		nome = n;
		switch(r) 
		{
			case 'A': 
				regiao ="Zona Norte";
				break;
			case 'B': 
				regiao ="Zona Leste";
				break;
			case 'C': 
				regiao ="Zona Sul";
				break;
			case 'D': 
				regiao ="Zona Oeste";
				break;
			case 'E': 
				regiao ="Centro";
				break;

		}
	
		telefone = t;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
