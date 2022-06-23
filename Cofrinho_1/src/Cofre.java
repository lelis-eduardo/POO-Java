
public class Cofre {

	// Atributos
	Moeda[] listaMoedas;
	String proprietario;
	int tamanho = 0;
	
	// Métodos
	Cofre(String proprietario){
		
		this.proprietario = proprietario;
		listaMoedas = new Moeda[1000];
	} // end cofre
	
	
	void depositaMoeda(Moeda moeda) {
		
		if(tamanho < 100) {
			listaMoedas[tamanho] = moeda;
			tamanho++;
		}
		else
			System.out.println("Cofre cheio. Moeda não depositada!");
	} // end depositaMoeda
	
	
	int quantidadeDeUmaMoeda(Moeda moeda) {
		
		int cont = 0;
		
		for(int i = 0; i < tamanho; i++) {
			
			if(listaMoedas[i].descricao == moeda.descricao)
				cont+=1;
		} // end for
		
		return cont;
	}// end quantidadeDeUmaMoeda
	
	
	
	double valor() {
		
		double valor = 0.0;
		
		for(int i = 0; i < tamanho; i++)
			valor += listaMoedas[i].valor;
		
		return valor;
		
	} // end valor
	
	
	
	double valorDeUmaMoeda(Moeda moeda) {
		
		double valor = 0.0;
		
		for(int i = 0; i < tamanho; i++) {
			
			if(listaMoedas[i].valor == moeda.valor)
				valor += moeda.valor;
		} // end for
		
		return valor;
		
	} // end valorDeUmaMoeda
	
	
} // end class




















