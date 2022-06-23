
public class Moeda {

	// Atributos
	double valor;
	String descricao;
	
	// Métodos
	Moeda(double valor){
		
		this.valor = valor;
		
		if(valor == 0.05)
			this.descricao = "Moeda de 5 centavos";
		else if(valor == 0.1)
			this.descricao = "Moeda de 10 centavos";
		else if(valor == 0.25)
			this.descricao = "Moeda de 25 centavos";
		else if(valor == 0.5)
			this.descricao = "Moeda de 50 centavos";
		else if(valor == 1)
			this.descricao = "Moeda de 1 real";
		else {
		    this.descricao = "Moeda de valor inválido";
		    this.valor = 0.0;
		}
	}
}
