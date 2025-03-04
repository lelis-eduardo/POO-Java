
public abstract class Pessoa {
	
	// Atributos
	private String nome;
	private String email;
	
	//M�todos
	//Construtor
	public Pessoa(String nome, String email){
		
		this.nome = nome;
		this.email = email;
	} // end construtor
	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		
			String apresentacao = "Sr(a) " + this.nome + "\n(" + this.email + ")";
		
			return apresentacao;
		} // end toString
	
	public abstract String getId();
	
	} // end class
