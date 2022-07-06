
public class MedicoAssalariado extends Medico{
	
	private double salario;
	
	public MedicoAssalariado(String nome, String email, String crm, double salario) {
		
		super(nome, email, crm);
		this.salario = salario;
	}
	
	public MedicoAssalariado(MedicoAssalariado m) {
		
		super(m.getNome(), m.getEmail(), m.getCrm());
		this.salario = m.getSalario();		
	}
	
	@Override
	public double getSalario() {
		
		return this.salario;
	}
	
	@Override
	public String getNomeClasse() {
		
		return "Médico assalariado";
	}
}
