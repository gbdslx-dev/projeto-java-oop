package br.com.generation.projeto_bloco1;

import java.util.Scanner;

public class Inicio {

	static Scanner read = new Scanner(System.in);
	
	public static void iniciar() {
		System.out.println("Bem-Vindo!");
		
		System.out.println("Digite seu nome: ");
		String nome = read.nextLine();
		
		System.out.println("Escolha a sua regi�o: " + 
				"\nA. Zona Norte" + "\nB. Zona Leste" + "\nC. Zona Sul" + "\nD. Zona Oeste" + "\nE. Centro");
		char regiaoBeneficiador = read.next().charAt(0);
		
		System.out.println("Digite seu telefone: ");
		String telefone = read.next();
		
		System.out.println("Digite seu email: ");
		String email = read.next();
		
		System.out.println("Escolha a regi�o de prefer�ncia pra crian�a que deseja apadrinhar: " + 
							"\nA. Zona Norte" + "\nB. Zona Leste" + "\nC. Zona Sul" + "\nD. Zona Oeste" + "\nE. Centro");
		char regiaoP = read.next().charAt(0);
		
		System.out.println("Escolha a idade de prefer�ncia pra crian�a que deseja apadrinhar: " + 
							"\nA. 0 a 5" + "\nB.5 a 10 " + "\nC.10 a 15" + "\nD.Mais de 15");
		char idadeP = read.next().charAt(0);
		
		System.out.println("Escolha o valor que est� disposto a gastar no presente da crian�a: " +
							"\nA. At� R$ 20" + "\nB. At� R$ 50" + "\nC. At� R$ 100" + "\nD. Mais de R$ 100");
		char valorP = read.next().charAt(0);
		
			
					
		Beneficiador doador = new Beneficiador(nome, regiaoBeneficiador, telefone, email, regiaoP, idadeP, valorP);
		
		ListaCriancas l = new ListaCriancas(); 
		l.listaCriancas = l.ListarCriancas();
		
		System.out.println("Deseja realizar sua escolha por: " + 
				"\nA. Regi�o" + "\nB. Idade" + "\nC. Valor");
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
			System.out.println("Digite o ID da crian�a que deseja doar o presente: "); 
			int id = read.nextInt();
			Crianca beneficiada = filtro.FiltrarPorID(l.listaCriancas, id);
			Doacao doacao = new Doacao(doador,beneficiada);
			doacao.Relatorio();
	}
	
}
