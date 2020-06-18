package exerciciosPOO;

public class Retangulo {

	
	public int largura ;
	public int altura ;
	
	public int area(int x, int y) {
		return x * y;
	}
	
	public int perimetro(int x, int y) {
		return (2*x) + (2*y);
	}
	
	public double diagonal (int x, int y) {
		return Math.sqrt((x*x) + (y*y));
	}
}
