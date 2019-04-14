
public abstract class Poligono extends Figura {

	private double largura, altura;
	
	
	public Poligono(double altura, double largura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
		
}
