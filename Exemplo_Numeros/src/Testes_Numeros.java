
public class Testes_Numeros {

	public static void main(String[] args) {
		
		Numeros n1 = new Numeros(10);
		
		n1.acumula(16);
		n1.acumula(-5);
		
		System.out.println("Media: " + n1.getMedia());
		System.out.println("Maximo: " + n1.getMaximo());
		System.out.println("Minimo: " + n1.getMinimo());
	}

}
