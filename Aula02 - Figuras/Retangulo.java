
public class Retangulo extends Quadrilatero implements Diagonal{

	public Retangulo(double altura, double largura) {
		// TODO Auto-generated constructor stub
		super(altura,largura);
	}

	@Override
	public double calculaDiagonal() {
		return Math.sqrt(Math.pow(getAltura(), 2)+Math.pow(getLargura(), 2));
	}

		// TODO Auto-generated method stub
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return super.getLargura()*super.getAltura();
	}

}

