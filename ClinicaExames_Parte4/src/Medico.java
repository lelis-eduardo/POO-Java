
public abstract class Medico extends Pessoa{

	// Atributos
	private String crm;
	private static int sequencial = 0;
	private String id;
	
	// Métodos
	//Construtor
	public Medico(String nome, String email, String crm){
		
		super(nome, email);
		this.crm = crm;	
		sequencial++;
		this.id = "ME"+sequencial;
	} // end contrutor

	public String getCrm() {
		return this.crm;
	}
	
	@Override
	public String getId() {
		
		return this.id;
	}
	
	public abstract double getSalario();
	
	public abstract String getTipoMedico();
	
	@Override
	public String toString() {
		
		String apresentacao = "Dr(a) " + super.getNome() + " - CRM:" + this.crm + "\n("
		+ super.getEmail() + ")";
		
		return apresentacao;
	} // end toString
	
} // end class
