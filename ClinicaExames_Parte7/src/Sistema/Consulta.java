package Sistema;
import java.util.*;

public class Consulta {
	
	// Atributos
	private Medico medico;
	private Paciente paciente;
	private Agrupamento<Procedimento> procedimentos;
	
	//M�todos
	public Consulta(Medico medico, Paciente paciente, Agrupamento<Procedimento> procedimentos){
		
		this.medico = medico;
		this.paciente = paciente;
		this.procedimentos = procedimentos;
	} //end construtor
	
	
	public Medico getMedico() {
		
		return this.medico;
	}

	public Paciente getPaciente() {
		
		return new Paciente(this.paciente);
	}

	public Agrupamento<Procedimento> getProcedimentos() {
		
		Agrupamento<Procedimento> aux = new Agrupamento<Procedimento>();
		aux = this.procedimentos;
		
		return aux;
	}

	public double valorConsulta() {
		
		double valor = 0.0;
		
		for(Procedimento item : procedimentos.getLista()) 
				valor += item.getValor();
		
		return valor;
	} // end valorConsulta
	
	public double faturamentoMedicoPorConsulta() {
		
		return (this.valorConsulta() * this.medico.getComissionamento());
	}
	
	public double faturamentoClinicaoPorConsulta() {
		
		return (this.valorConsulta() * (1 - this.medico.getComissionamento()));
	}
	
} // end class






