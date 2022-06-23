
public class Medico {

	// Atributos
	private String nome;
	private String email;
	private String crm;
	
	// Métodos
	//Construtor
	public Medico(String nome, String email, String crm){
		
		this.nome = nome;
		this.email = email;
		this.crm = crm;	
	} // end contrutor
	
	
	
	public String getNome() {
		
		return nome;
	}



	public String getEmail() {
		
		return email;
	}



	public String getCrm() {
		
		return crm;
	}


	public String toString() {
		
		String apresentacao = "Dr(a) " + this.nome + " - CRM:" + this.crm + "\n(" + this.email + ")";
		
		return apresentacao;
	} // end toString
	
	
} // end class
