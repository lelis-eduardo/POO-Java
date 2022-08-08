package Sistema;

public class Procedimento {

	// Atributos
	private String descricao;
	private double valor;
	private String id;
	private static int numId;
	
	// Métodos
	//Construtor
	public Procedimento(String descricao, double valor){
		
		this.descricao = descricao;
		this.valor = valor;
		this.id = montaIdentificador();
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
	
	private static String montaIdentificador() {
		
		numId++;
		
		return "PO" + numId;
	} // end montaIdentificador
	
	} // end class
