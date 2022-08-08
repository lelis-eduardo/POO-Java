package Sistema;

public class MedicoComissionado extends Medico {

	private double comissionamento;

	public MedicoComissionado(String nome, String sobrenome, String sexo, String email, String crm, double comissionamento) throws comissionamentoInvalidoException {

		super(nome, sobrenome, sexo, email, crm);
		this.setComissionamento(comissionamento);
	}
	
	public double getComissionamento() {

		return this.comissionamento;
	}
	
	public void setComissionamento(double comissionamento) throws comissionamentoInvalidoException {
		
		if(comissionamento > 0.5)
			throw new comissionamentoInvalidoException("Comissionamento inválido!");
		
		this.comissionamento = comissionamento;
	}
	
	public double getSalario() {
		
		return Agenda.faturamentoTotalMedico(this);
	}
	
	@Override
	public String getTipoMedico() {
		
		return "Médico comissionado";
	}

}
