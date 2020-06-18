package aplication;

	public class Conta{
		private int numero;
		private String titular;
		private int saldo;
		
		
		public Conta(int numero, String titular, int depositoInicial) {
			
			this.numero = numero;
			this.titular = titular;
			deposito(depositoInicial);
		}

		public Conta(int numero, String titular) {
			this.numero = numero;
			this.titular = titular;
		}

		public int getConta() {
			return numero;
		}

		public String getTitular() {
			return titular;
		}


		public void setTitular(String titular) {
			this.titular = titular;
		}


		public int getSaldo() {
			return saldo;
		}

		
		public void deposito(int valor) {
			saldo = saldo + valor; 
		}
		
		public void saque(int valor) {
			saldo = saldo - (valor + 5); 
		}
		
		public String toString() {
			return "Conta:  " + numero + " Titular: " + titular + " Saldo: R$ " + saldo;
		}

		
		
	}


