
public class Procedimento {

	// Atributos
	private String descricao;
	private double valor;
	private String id;
	private static int sequencial = 0;
	
	// Métodos
	//Construtor
	public Procedimento(String descricao, double valor){
		
		this.descricao = descricao;
		this.valor = valor;
		sequencial++;
		this.id = "PO" + sequencial;  
	} // end construtor

	
	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public String getId() {
		return id;
	}
	

	public String toString() {
			
			String apresentacao = "Procedimento " + this.descricao + " - R$" + this.valor;
			
			return apresentacao;
		} // end toString
	
	} // end class
