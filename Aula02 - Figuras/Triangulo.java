
public class Triangulo extends Poligono {

	public Triangulo(double altura, double largura) {
		super(altura, largura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (getAltura() * getLargura())/2;
	}

}
