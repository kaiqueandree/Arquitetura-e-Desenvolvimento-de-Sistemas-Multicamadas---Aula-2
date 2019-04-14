import java.util.ArrayList;
import java.util.Random;

public class Geometria {
	
	public static void main(String[] args) {
		Random gerador = new Random();
		ArrayList<Figura> Figuras = new ArrayList<>();
		Figuras.add(new Circulo(25 * gerador.nextDouble() + 5 ));
		Figuras.add(new Retangulo(5 * gerador.nextDouble() + 5 , 15 + gerador.nextDouble()* 32));
		
		
		//enhanced for
		//for each
		for (Figura f : Figuras) {
			System.out.println(f.area());
		}
	}
}
