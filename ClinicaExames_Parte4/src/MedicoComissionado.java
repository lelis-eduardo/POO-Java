
public class MedicoComissionado extends Medico {

	private double comissionamento;

	public MedicoComissionado(String nome, String email, String crm, double comissionamento) {

		super(nome, email, crm);
		this.comissionamento = comissionamento;
	}
	
	public double getComissionamento() {

		return this.comissionamento;
	}
	
	public double getSalario() {
		
		return Agenda.faturamentoTotalMedico(this);
	}
	
	@Override
	public String getTipoMedico() {
		
		return "Médico comissionado";
	}

}
