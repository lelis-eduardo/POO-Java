
public class MedicoAssalariado extends Medico{
	
	private double salario;
	
	public MedicoAssalariado(String nome, String email, String crm, double salario) {
		
		super(nome, email, crm);
		this.salario = salario;
	}
	
	@Override
	public double getSalario(Agenda a) {
		
		return this.salario;
	}
	
	@Override
	public String getTipoMedico() {
		
		return "Médico assalariado";
	}
}
