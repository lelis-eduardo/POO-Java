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
		
		return new Medico(this.medico);
	}

	public Paciente getPaciente() {
		
		return new Paciente(this.paciente);
	}

	public ArrayList<Procedimento> getProcedimentos() {
		
		ArrayList<Procedimento> p = new ArrayList<Procedimento>(this.procedimentos);
		
		return p;
	}

	public double valorConsulta() {
		
		double valor = 0.0;
		
		for(Procedimento item : this.procedimentos) 
				valor += item.getValor();
		
		return valor;
	} // end valorConsulta
	
	
	public void adicionaProcedimento(Procedimento p) {
		
		this.procedimentos.add(p);
	}
	
	
	public void removeProcedimento(Procedimento p) {
		
		this.procedimentos.remove(p);
	}
	
	
	public boolean procuraProcedimento(Procedimento p) {
		
		return this.procedimentos.contains(p);
	}
	
} // end class






