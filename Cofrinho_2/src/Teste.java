
public class Teste {

	public static void main(String[] args) {
		
		Moeda m1 = new Moeda(0.05);
		Moeda m2 = new Moeda(0.10);
		Moeda m3 = new Moeda(0.25);
		Moeda m4 = new Moeda(0.5);
		Moeda m5 = new Moeda(1);
		Moeda m6 = new Moeda(0.07);
		
		Cofre c1 = new Cofre("Eduardo");
		
		c1.depositaMoeda(m1);
		c1.depositaMoeda(m2);
		c1.depositaMoeda(m6);
		c1.depositaMoeda(m4);
		c1.depositaMoeda(m4);
		c1.depositaMoeda(m4);
		c1.depositaMoeda(m4);
		
		System.out.println(c1.quantidadeDeUmaMoeda(m2));
		System.out.println(c1.valor());
		System.out.println(c1.valorDeUmaMoeda(m4));
		
	}

}
