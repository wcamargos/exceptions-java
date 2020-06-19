package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DominioException;

public class Reserva {
	
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		if (!checkOut.after(checkIn)) {
			throw new DominioException( "Erro na reserva: Check-out deve ter a data depois do check-in");
		}
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}
	
	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duracao() {
		long dif = checkOut.getTime() - checkIn.getTime();
		return	TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
	}
	
	public void updateDatas(Date in, Date out)  {
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DominioException( "Erro na reserva: Data de atualização deve ser futura");
		}
		if (!checkOut.after(checkIn)) {
			throw new DominioException( "Erro na reserva: Check-out deve ter a data depois do check-in");
		}
		this.checkIn = in;
		this.checkOut = out;
		;
	}

	@Override
	public String toString() {
		return "Quarto " + numeroQuarto + ", check-in : " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) 
		+ ", " + duracao() + " noites";
	}
	
}
