package model.entities;

public class Valor {

	private Double valorBasico;
	private Double taxa;
	
	public Valor() {
		
	}

	public Valor(Double valorBasico, Double taxa) {
		this.valorBasico = valorBasico;
		this.taxa = taxa;
	}

	public Double getValor() {
		return valorBasico;
	}

	public void setValor(Double valor) {
		this.valorBasico = valor;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double getValorTotal() {
		return getValor() + getTaxa();
	}
	
	
	
}
