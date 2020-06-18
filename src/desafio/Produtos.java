package desafio;

public class Produtos {
	public String name;
	public double price;
	public int quantidade;
	
	public Produtos(String name, double price, int quantidade) {
		this.name = name;
		this.price= price;
		this.quantidade = quantidade;
	}
	
	public double totalEstoque() {
		return price * quantidade;
	}
	
	public void Adicionar(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void Remover(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return name + ", $" + price + ", " + quantidade + " units, Total: " + totalEstoque();
	}
}
