
public class Medico extends Pessoa implements CalculaSalario{

	// Atributos
	private String crm;
	private static int numId;
	
	// Métodos
	//Construtor
	public Medico(String nome, String email, String crm){
		
		super(nome, email);
		this.crm = crm;	
		numId++;
	} // end contrutor
	
	public Medico(Medico m) {
		
		super(m);
		this.crm = m.getCrm();
		numId++;		
	}

	public String getCrm() {
		return this.crm;
	}

	@Override
	public String toString() {
		
		String apresentacao = "Dr(a) " + super.getNome() + " - CRM:" + this.crm + "\n("
		+ super.getEmail() + ")";
		
		return apresentacao;
	} // end toString
	
	@Override
	public String getId() {
		
		return "ME" + numId;
	}
	
	@Override
	public double valorSalario() {
		
		return 0.0;
	}
} // end class
