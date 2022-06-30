
public class Medico {

	// Atributos
	private String nome;
	private String email;
	private String crm;
	private String id;
	private static int numId;
	
	// Métodos
	//Construtor
	public Medico(String nome, String email, String crm){
		
		this.nome = nome;
		this.email = email;
		this.crm = crm;	
		this.id = montaIdentificador();
	} // end contrutor
	
	public Medico(Medico m) {
		
		this.nome = m.getNome();
		this.email = m.getEmail();
		this.crm = m.getCrm();
		this.id = m.getId();
	}
	
	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public String getCrm() {
		return crm;
	}


	public String getId() {
		return id;
	}
	
	public String toString() {
		
		String apresentacao = "Dr(a) " + this.nome + " - CRM:" + this.crm + "\n(" + this.email + ")";
		
		return apresentacao;
	} // end toString
	
	private static String montaIdentificador() {
		
		numId++;
		
		return "ME" + numId;
	} // end montaIdentificador
	
} // end class
