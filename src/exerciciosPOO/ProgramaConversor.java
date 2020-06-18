package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaConversor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais de cada dólar: R$ ");
		double valorReais = sc.nextDouble();
		
		System.out.println("Quantos dolares deseja comprar? : U$ ");
		double dolares = sc.nextDouble();
		
		double valorTotal = calcula(dolares, valorReais);
		System.out.println("Valor total com IOF em reais: R$ "+ valorTotal);
		
		sc.close();
	}
	public static double calcula(double dolares, double reais) {
		return ((dolares*reais*1.06) + reais);
	}
}
