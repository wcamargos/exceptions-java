package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;
import model.exceptions.DominioException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do Quarto: ");
			int nr = sc.nextInt();
			System.out.println("Data check-in (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Data check-out (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
		
			Reserva reserva = new Reserva(nr, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.print("Entre com a data para atualizar a reserva: ");
			System.out.print("Data check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
		
			reserva.updateDatas(checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
		}
		catch (ParseException e) {
			System.out.println("Formato de data incorreto");
		}
		catch (DominioException e) {
			System.out.println("Erro na reserva : " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		sc.close();
		
	}

}
