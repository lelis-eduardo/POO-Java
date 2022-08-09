package Sistema;

public abstract class Medico extends Pessoa{

	// Atributos
	private String crm;
	private static int sequencial = 0;
	private String id;
	
	// Métodos
	//Construtor
	public Medico(String nome, String sobrenome, String sexo, String email, String crm){
		
		super(nome, sobrenome, sexo, email);
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
	
	public abstract double getComissionamento();
	
	@Override
	public String toString() {
		
		String apresentacao = this.getFormataNome() + " - CRM:" + this.crm + "\n("
		+ super.getEmail() + ")";
		
		return apresentacao;
	} // end toString
	
	@Override
	public String getFormataNome() {
		
		if(this.getSexo() == "Masculino")
			return "Dr. " + this.getNome() + " " + this.getSobrenome();
		else
			return "Dra. " + this.getNome() + " " + this.getSobrenome();
	}
	
} // end class
