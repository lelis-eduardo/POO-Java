import java.util.ArrayList;

public class Cofre {

	// Atributos
	ArrayList<Moeda> listaMoedas;
	String proprietario;
	
	// Métodos
	Cofre(String proprietario){
		
		this.proprietario = proprietario;
		listaMoedas = new ArrayList<Moeda>();
	} // end cofre
	
	
	void depositaMoeda(Moeda moeda) {
		
			listaMoedas.add(moeda);
	} // end depositaMoeda
	
	
	int quantidadeDeUmaMoeda(Moeda moeda) {
		
		int cont = 0;
		
		for(Moeda m : listaMoedas) {
			
			if(m.descricao == moeda.descricao)
				cont+=1;
		} // end for
		
		return cont;
	}// end quantidadeDeUmaMoeda
	
	
	
	double valor() {
		
		double valor = 0.0;
		
		for(Moeda m : listaMoedas)
			valor += m.valor;
		
		return valor;
		
	} // end valor
	
	
	
	double valorDeUmaMoeda(Moeda moeda) {
		
		double valor = 0.0;
		
		for(Moeda m : listaMoedas) {
			
			if(m.valor == moeda.valor)
				valor += moeda.valor;
		} // end for
		
		return valor;
		
	} // end valorDeUmaMoeda
	
	
} // end class




















