package br.com.generation.projeto_bloco1;

public class Crianca extends Pessoa{

	public int id;
	public int idade;
	public String pedido;
	public double valor;
	public String endereco;
	
	public Crianca() {}
	public Crianca(int iD,String n, char r, String t, int i, String p, double v, String e) {
		super(n, r, t);
		idade = i;
		pedido = p;
		valor = v;
		endereco = e;	
		id= iD;
	}
	

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void Imprimir() {
		System.out.println("\nID: " + id);
		System.out.println("\nNome: " + nome);
		System.out.println("\nRegião: "+regiao);
		System.out.println("\nTelefone: "+telefone);
		System.out.println("\nIdade: "+idade);
		System.out.println("\nPedido: "+pedido);
		System.out.println("\nValor: "+valor);
		System.out.println("\nEndereço: "+endereco);
	}
	
}
