package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFunci {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funci funci1 = new Funci();
		System.out.println("Entre com o nome, sal�rio e imposto:");
		
		funci1.nome = sc.nextLine();
		funci1.salario = sc.nextDouble();
		funci1.imposto = sc.nextDouble();
		
		System.out.println(" NOME : " + funci1.nome + ", SAL�RIO : R$ " + funci1.salario + ", IMPOSTO: R$ " + funci1.imposto);
		
		System.out.println("Entre com a porcentagem de incremento do sal�rio: ");
		double percent = sc.nextDouble();
		System.out.println("Porcentagem = " + percent + "%");
		double novoSalario = funci1.aumento(percent);
		
		
		System.out.println("Novo sal�rio : R$ " + novoSalario);
		sc.close();
	}

}
