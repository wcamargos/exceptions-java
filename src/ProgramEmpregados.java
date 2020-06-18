import java.util.Locale;
import java.util.Scanner;


public class ProgramEmpregados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos funcionários deseja registrar:  ");
		int quantidade = sc.nextInt();
		Empregados[] empregado = new Empregados[quantidade];
		
		for (int i=1; i<=quantidade; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			System.out.print("Digite o Id do funcionário que terá o salário acrescido: ");
			int altera = sc.nextInt();
			System.out.println("Digite o percentual do aumento: ");
			int aumento = sc.nextInt();
			if(altera == id) {
				//alteraSalario(salario, aumento);
			}
			
			
			}
		System.out.println();
		System.out.println("Busy rooms:");
		
		sc.close();
		
		
	}

	

}
