
public class Pessoa {

	// Atributos
	double peso;
	double altura;
	
	// M�todos
	Pessoa(double p, double a){
		
		this.peso = p;
		this.altura = a;
	}
	
	double imc() {
		
		return (this.peso / (this.altura * this.altura));
	}
	
	void diagn�stico() {
		
		double i = this.imc();
		
		if(i < 19)
			System.out.println("Baixo peso");
		if((i > 19) && (i < 25))
			System.out.println("Peso normal");
		if(i > 25)
			System.out.println("Sobrepeso");
	}
}
