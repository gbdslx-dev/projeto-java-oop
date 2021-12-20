package br.com.generation.projeto_bloco1;

public class Beneficiador extends Pessoa {

	public String email;
	public int idadeMin;
	public int idadeMax;
	public String regiaoPref;
	public int valorPref;
	
	public Beneficiador(String n, char r, String t, String e, char ip, char rp, char vp) {
		super(n, r, t);
		email = e;
		switch(ip) 
		{
			case 'A': 
				idadeMin = 0;
				idadeMax=5;
				break;
			case 'B': 
				idadeMin = 5;
				idadeMax=10;
				break;
			case 'C': 
				idadeMin = 10;
				idadeMax=15;
				break;
			case 'D': 
				idadeMin=15;
				idadeMax=18;
				break;
		}
		switch(rp) 
		{
			case 'A': 
				regiaoPref ="Zona Norte";
				break;
			case 'B': 
				regiaoPref ="Zona Leste";
				break;
			case 'C': 
				regiaoPref ="Zona Sul";
				break;
			case 'D': 
				regiaoPref ="Zona Oeste";
				break;
			case 'E': 
				regiaoPref ="Centro";
				break;
		}
		switch(vp) 
		{
			case 'A': 
				valorPref =20;
				break;
			case 'B': 
				valorPref =50;
				break;
			case 'C': 
				valorPref =100;
				break;
			case 'D': 
				valorPref =101;
				break;
		}
	}
		public void Imprimir() {
			System.out.println("============== DADOS DA DOAÇÃO ==============");
			System.out.println("\nNome: " + nome);
			System.out.println("\nRegião: "+regiao);
			System.out.println("\nTelefone: "+telefone);		
			System.out.println("\nEmail: "+email);
			System.out.println("\n============== DADOS DA CRIANÇA ==============\n");
		}
	
}
