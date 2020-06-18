package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		System.out.println("Entre com a largura e altura do retângulo:");
		ret.largura = sc.nextInt();
		ret.altura = sc.nextInt();

		int area = ret.area(ret.largura, ret.altura);
		int perimetro = ret.perimetro(ret.largura, ret.altura);
		double diagonal = ret.diagonal(ret.largura, ret.altura);
		
		System.out.println("AREA: " + area);

		System.out.println("PERIMETRO: " + perimetro);
		

		System.out.println("DIAGONAL: " + diagonal);
		sc.close();
	}

}
