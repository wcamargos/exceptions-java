import java.util.Locale;
import java.util.Scanner;

import aplication.Conta;

public class ProgramConta {

	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			Conta conta;
			
			System.out.println("Entre com o número da conta:  ");
			int numero = sc.nextInt();
			
			System.out.print("Entre com o titular da conta:  ");
			sc.nextLine();
			String titular = sc.nextLine();
			
			System.out.println("Haverá depósito inicial (S/N)? ");
			char inicial = sc.next().charAt(0);
			
			if(inicial == 's') {
				System.out.println("Valor de depósito inicial ");
				int depositoInicial = sc.nextInt();
				conta = new Conta(numero, titular, depositoInicial);
			}
			else {
				conta = new Conta(numero, titular);
			}
			
			System.out.println("Dados da conta: " + conta);
			//System.out.println("Número: " + conta + ", titular: " + titular + "Saldo: R$ "  );//+ depositoInicial);
			System.out.println("Entre com o valor do depósito: R$ ");
			int deposito = sc.nextInt();
			conta.deposito(deposito);
			
			System.out.println("Atualização " + conta);
			
			System.out.println("Dados da conta: " + conta);
			
			System.out.println("Entre com o valor do saque: R$");
			int saque = sc.nextInt();
			conta.saque(saque);
			System.out.println("Atualização " + conta);
			
			sc.close();

	}

}
