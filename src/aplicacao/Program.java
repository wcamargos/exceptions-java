package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Número do Quarto: ");
		int nr = sc.nextInt();
		System.out.println("Data check-in (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Data check-out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.print("Erro na reserva: Check-out deve ter a data depois do check-in");
		}
		else {
			Reserva reserva = new Reserva(nr, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.print("Entre com a data para atualizar a reserva: ");
			System.out.print("Data check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
		
			String erro = reserva.updateDatas(checkIn, checkOut);
			if (erro != null) {
				System.out.println("Erro na reserva : " + erro);
			}
			else {
			System.out.println("Reserva: " + reserva);
			}
		}

		sc.close();
		
	}

}
