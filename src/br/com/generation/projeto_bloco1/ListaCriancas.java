package br.com.generation.projeto_bloco1;

public class ListaCriancas {
	
	public Crianca[] listaCriancas = new Crianca[10];

	
	public Crianca[] ListarCriancas() {
		Crianca c1 = new Crianca(1,"Ana", 'B', "12943586", 10, "Tênis", 50, "Rua Mariano Gonçalves, n° 83");		
		listaCriancas[0] = c1;		
		
		Crianca c2 = new Crianca(2,"Bruno", 'A', "84756947", 9, "Bola", 20, "Rua Florêncio Magalhães, n° 42");
		listaCriancas[1] = c2;
		
		Crianca c3 = new Crianca(3,"Julia", 'C', "73645739", 8, "Vestido", 50, "Rua Joselino Bismarck, n° 55");
		listaCriancas[2] = c3;
		
		Crianca c4 = new Crianca(4,"Henrique", 'A', "33459084", 5, "Legos", 90, "Rua Amaral Bueno, n° 11");
		listaCriancas[3] = c4;
		
		Crianca c5 = new Crianca(5,"Paula", 'D', "99876543", 12, "Boneca", 60, "Rua dos Estudantes, n° 100");
		listaCriancas[4] = c5;
		
		Crianca c6 = new Crianca(6,"Marcelo", 'E', "76453896", 16, "Skate", 100, "Rua Francisco Penteado, n° 98");
		listaCriancas[5] = c6;
		
		Crianca c7 = new Crianca(7,"Gabriela", 'E', "12345678", 11, "Bicicleta", 120, "Rua Tomás Aquino, n° 30");
		listaCriancas[6] = c7;
		
		Crianca c8 = new Crianca(8,"Leonardo", 'B',"18273486", 13, "Jaqueta", 60, "Rua das Graças, n° 5");
		listaCriancas[7] = c8;
		
		Crianca c9 = new Crianca(9,"Fernanda", 'C', "98234502", 3, "Barbie", 50, "Rua Doutor Armando, n° 60");
		listaCriancas[8] = c9;
		
		Crianca c10 = new Crianca(10,"David", 'D', "92734581", 10, "Tamagochi", 80, "Rua Leandro Leal, n° 30");
		listaCriancas[9] = c10;
		
	
		
		return listaCriancas;
		
	}
	
	
}
