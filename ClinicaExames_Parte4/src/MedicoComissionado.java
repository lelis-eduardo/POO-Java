
public class MedicoComissionado extends Medico {

	private double comissionamento;

	public MedicoComissionado(String nome, String email, String crm, double comissionamento) {

		super(nome, email, crm);
		this.comissionamento = comissionamento;
	}
	
	public double getComissionamento() {

		return this.comissionamento;
	}
	
	@Override
	public double getSalario(Agenda a) {
		
		return a.faturamentoTotalMedico(this);
	}
	
	@Override
	public String getTipoMedico() {
		
		return "Médico comissionado";
	}

}
