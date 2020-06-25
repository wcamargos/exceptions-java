package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.service.AluguelService;
import model.service.TaxaBrasilService;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.print("Entrega (dd/MM/yyyy HH:mm): ");
		Date fim = sdf.parse(sc.nextLine());
		
		AluguelCarro aluguel = new AluguelCarro(inicio, fim, new Veiculo(modelo));
		
		System.out.print("Preço por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Preço por dia: ");
		double precoPorDia = sc.nextDouble();
		
		AluguelService aluguelService = new AluguelService(precoPorDia, precoPorHora, new TaxaBrasilService());
		aluguelService.processaPagamento(aluguel);
		
		System.out.println("VALORES: ");
		System.out.println("Pagamento básico :" + String.format("%.2f", aluguel.getValor().getValor()));
		System.out.println("Taxa :" + String.format("%.2f", aluguel.getValor().getTaxa()));
		System.out.println("PAGAMENTO TOTAL :" + String.format("%.2f", aluguel.getValor().getValorTotal()));
		
		
		sc.close();
		

	}

}
