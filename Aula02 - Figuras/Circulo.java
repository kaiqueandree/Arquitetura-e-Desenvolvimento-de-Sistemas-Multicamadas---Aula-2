
public class Circulo extends Figura {
	
	private double raio;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(raio,2);
	}
	
	public Circulo () {
		super();
	}
	
	public Circulo (double raio) {
		super();
		this.raio = raio;
	}
	
}
