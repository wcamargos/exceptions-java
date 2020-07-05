package model.service;

import model.entities.AluguelCarro;
import model.entities.Valor;

public class AluguelService {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	private TaxaService taxaService;

	public AluguelService(Double precoPorDia, Double precoPorHora, TaxaService taxaService) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaService = taxaService;
	}
	public void processaPagamento(AluguelCarro aluguelCarro) {
		long t1 = aluguelCarro.getInicio().getTime();
		long t2 = aluguelCarro.getFim().getTime();
		double horas = (double)(t2 - t1) / 1000 / 60 / 60; //cast em double. obriga
		
		double valor;
		if(horas <= 12) {
			valor = Math.ceil(horas) * precoPorHora;
		}
		else {
			valor = Math.ceil(horas /24) * precoPorDia;
		}
		
		double taxa = taxaService.taxa(valor);
		
		aluguelCarro.setValor(new Valor(valor, taxa));
	}
	
}
