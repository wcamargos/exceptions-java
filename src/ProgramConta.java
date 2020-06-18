import java.util.Locale;
import java.util.Scanner;

import aplication.Conta;

public class ProgramConta {

	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			Conta conta;
			
			System.out.println("Entre com o n�mero da conta:  ");
			int numero = sc.nextInt();
			
			System.out.print("Entre com o titular da conta:  ");
			sc.nextLine();
			String titular = sc.nextLine();
			
			System.out.println("Haver� dep�sito inicial (S/N)? ");
			char inicial = sc.next().charAt(0);
			
			if(inicial == 's') {
				System.out.println("Valor de dep�sito inicial ");
				int depositoInicial = sc.nextInt();
				conta = new Conta(numero, titular, depositoInicial);
			}
			else {
				conta = new Conta(numero, titular);
			}
			
			System.out.println("Dados da conta: " + conta);
			//System.out.println("N�mero: " + conta + ", titular: " + titular + "Saldo: R$ "  );//+ depositoInicial);
			System.out.println("Entre com o valor do dep�sito: R$ ");
			int deposito = sc.nextInt();
			conta.deposito(deposito);
			
			System.out.println("Atualiza��o " + conta);
			
			System.out.println("Dados da conta: " + conta);
			
			System.out.println("Entre com o valor do saque: R$");
			int saque = sc.nextInt();
			conta.saque(saque);
			System.out.println("Atualiza��o " + conta);
			
			sc.close();

	}

}
