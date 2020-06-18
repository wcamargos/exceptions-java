package exerciciosPOO;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;


public class ProgramPensao {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quarto[] vetor = new Quarto[10];
		
		System.out.println("Quantos quartos serão reservados? ");
		int quantidade = sc.nextInt();
		if(quantidade > 9) {
			System.out.println("Quantidade de quartos inválidas");
		}else {
		
		for (int i = 1; i < vetor.length; i++) {
			System.out.println("Quarto #: " + i + ":");
			System.out.println("Digite o nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite o email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Quarto(name, email);
		
		
		System.out.println("Quartos ocupados: ");
			
			for (i=0; i<10; i++) {
				if (vetor[i]!=null) {
					System.out.println(i + ":" + vetor[i]);
			}
		}
	}
		
		

		}
		sc.close();
	}
}
