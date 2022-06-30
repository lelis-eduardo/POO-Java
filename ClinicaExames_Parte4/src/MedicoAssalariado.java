
public class MedicoAssalariado extends Medico{
	
	private double salario;
	
	public MedicoAssalariado(String nome, String email, String crm, double salario) {
		
		super(nome, email, crm);
		this.salario = salario;
	}
	
	public MedicoAssalariado(MedicoAssalariado m) {
		
		super(m);
		this.salario = m.valorSalario();		
	}
	
	@Override
	public double valorSalario() {
		
		return this.salario;
	}
}
