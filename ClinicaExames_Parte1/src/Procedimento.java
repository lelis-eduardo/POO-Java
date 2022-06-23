
public class Procedimento {

	// Atributos
	private String descricao;
	private double valor;
	
	// Métodos
	//Construtor
	public Procedimento(String descricao, double valor){
		
		this.descricao = descricao;
		this.valor = valor;
	} // end construtor
	
	public String getDescricao() {
		
		return descricao;
	}

	public double getValor() {
		
		return valor;
	}


	public String toString() {
		
		String apresentacao = "Procedimento " + this.descricao + " - R$" + this.valor;
		
		return apresentacao;
	} // end toString


} // end class
