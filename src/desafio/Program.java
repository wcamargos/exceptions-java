package desafio;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos Tv = new Produtos();
		Tv.name = "TV";
		Tv.price= 1200;
		Tv.quantidade=5;

		System.out.println("Produto " + Tv.name + " Preço : " + "R$" + Tv.price);
		
		System.out.println("Digite a nova quantidade: ");
		int quantidade = sc.nextInt();
		Tv.Adicionar(quantidade);
		System.out.println("Nova quantidade: " + Tv);
		
		System.out.println("Digite a quantidade removida: ");
		quantidade = sc.nextInt();
		Tv.Remover(quantidade);
		System.out.println("Nova quantidade: " + Tv);
		sc.close();
	}

}
