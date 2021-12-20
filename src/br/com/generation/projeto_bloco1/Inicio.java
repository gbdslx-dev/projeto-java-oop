package br.com.generation.projeto_bloco1;

import java.util.Scanner;

public class Inicio {

	static Scanner read = new Scanner(System.in);
	
	public static void iniciar() {
		System.out.println("Bem-Vindo!");
		
		System.out.println("Digite seu nome: ");
		String nome = read.nextLine();
		
		System.out.println("Escolha a sua região: " + 
				"\nA. Zona Norte" + "\nB. Zona Leste" + "\nC. Zona Sul" + "\nD. Zona Oeste" + "\nE. Centro");
		char regiaoBeneficiador = read.next().charAt(0);
		
		System.out.println("Digite seu telefone: ");
		String telefone = read.next();
		
		System.out.println("Digite seu email: ");
		String email = read.next();
		
		System.out.println("Escolha a região de preferência pra criança que deseja apadrinhar: " + 
							"\nA. Zona Norte" + "\nB. Zona Leste" + "\nC. Zona Sul" + "\nD. Zona Oeste" + "\nE. Centro");
		char regiaoP = read.next().charAt(0);
		
		System.out.println("Escolha a idade de preferência pra criança que deseja apadrinhar: " + 
							"\nA. 0 a 5" + "\nB.5 a 10 " + "\nC.10 a 15" + "\nD.Mais de 15");
		char idadeP = read.next().charAt(0);
		
		System.out.println("Escolha o valor que está disposto a gastar no presente da criança: " +
							"\nA. Até R$ 20" + "\nB. Até R$ 50" + "\nC. Até R$ 100" + "\nD. Mais de R$ 100");
		char valorP = read.next().charAt(0);
		
			
					
		Beneficiador doador = new Beneficiador(nome, regiaoBeneficiador, telefone, email, regiaoP, idadeP, valorP);
		
		ListaCriancas l = new ListaCriancas(); 
		l.listaCriancas = l.ListarCriancas();
		
		System.out.println("Deseja realizar sua escolha por: " + 
				"\nA. Região" + "\nB. Idade" + "\nC. Valor");
			char tipoFiltro = read.next().charAt(0);
			
			FiltroDoacao filtro = new FiltroDoacao();
			
			switch(tipoFiltro) {
			case 'A':
				filtro.FiltrarPorRegiao(l.listaCriancas, doador); 
				break;
			case 'B':
				filtro.FiltrarPorIdade(l.listaCriancas, doador); 
				break;
			case 'C':
				filtro.FiltrarPorValor(l.listaCriancas, doador); 
				break;
			}
			System.out.println("Digite o ID da criança que deseja doar o presente: "); 
			int id = read.nextInt();
			Crianca beneficiada = filtro.FiltrarPorID(l.listaCriancas, id);
			Doacao doacao = new Doacao(doador,beneficiada);
			doacao.Relatorio();
	}
	
}
