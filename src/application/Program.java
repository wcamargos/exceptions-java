package application;

import java.util.Locale;
import java.util.Scanner;

import desafio.Produtos;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantidade = sc.nextInt();
		System.out.println();
		Produtos produto = new Produtos(name, price, quantidade);

		System.out.println("Product data: " + produto);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		
		int quantity = sc.nextInt();
		produto.Adicionar(quantity);
		System.out.println();
		System.out.println("Updated data: " + produto);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		produto.Remover(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		sc.close();
	}
}