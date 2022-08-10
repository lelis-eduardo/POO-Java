package Sistema;
import java.util.*;

public class Consulta {
	
	// Atributos
	private Medico medico;
	private Paciente paciente;
	private Agrupamento<Procedimento> procedimentos;
	private static int sequencial = 0;
	private String id;
	
	//Métodos
	public Consulta(Medico medico, Paciente paciente, Agrupamento<Procedimento> procedimentos){
		
		this.medico = medico;
		this.paciente = paciente;
		this.procedimentos = procedimentos;
		sequencial++;
		this.id = String.valueOf(sequencial);
	} //end construtor
	
	
	public Medico getMedico() {
		
		return this.medico;
	}

	public Paciente getPaciente() {
		
		return new Paciente(this.paciente);
	}

	public Agrupamento<Procedimento> getProcedimentos() {
		
		return procedimentos;
	}
	
	public String getId() {
		
		return "CO" + id;
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
	
	public String toString() {
		
		return "Consulta " + this.id;
	}
	
} // end class






