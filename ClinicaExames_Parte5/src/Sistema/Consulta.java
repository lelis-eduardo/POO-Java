package Sistema;
import java.util.*;

public class Consulta {
	
	// Atributos
	private Medico medico;
	private Paciente paciente;
	private ArrayList<Procedimento> procedimentos;
	
	//Métodos
	public Consulta(Medico medico, Paciente paciente, ArrayList<Procedimento> procedimentos){
		
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

	public ArrayList<Procedimento> getProcedimentos() {
		
		return new ArrayList<Procedimento>(this.procedimentos);
	}

	public double valorConsulta() {
		
		double valor = 0.0;
		
		for(Procedimento item : this.procedimentos) 
				valor += item.getValor();
		
		return valor;
	} // end valorConsulta
	
	
	public boolean adicionaProcedimento(Procedimento p) {
		
		return this.procedimentos.add(p);
	}
	
	
	public boolean removeProcedimento(Procedimento p) {
		
		return this.procedimentos.remove(p);
	}
	
	
	public boolean procuraProcedimento(Procedimento p) {
		
		return this.procedimentos.contains(p);
	}
	
} // end class






