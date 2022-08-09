package Sistema;

public class MedicoAssalariado extends Medico{
	
	private double salario;
	
	public MedicoAssalariado(String nome, String sobrenome, String sexo, String email, String crm, double salario) {
		
		super(nome, sobrenome, sexo, email, crm);
		this.salario = salario;
	}
	
	@Override
	public double getComissionamento() {

		return 0.0;
	}
	
	@Override
	public double getSalario() {
		
		return this.salario;
	}
	
	@Override
	public String getTipoMedico() {
		
		return "Médico assalariado";
	}
	
}
