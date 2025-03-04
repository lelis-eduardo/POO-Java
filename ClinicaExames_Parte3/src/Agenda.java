import java.util.*;

public class Agenda {

	// Atributos
	private ArrayList<Consulta> consultas;
	
	
	// M�todos
	public Agenda(ArrayList<Consulta> consultas){
		
		this.consultas = consultas;
	} // end construtor
	
	
	public ArrayList<Consulta> getConsultas() {
		
		return new ArrayList<Consulta>(this.consultas);
	}

	public double faturamentoTotal() {
		
		double valor = 0.0;
		
		for(Consulta item : this.consultas)	
			valor += item.valorConsulta();

		return valor;
	} // end faturamentoTotal
	
	public int quantidadeConsultas() {
		
		return this.consultas.size();
	} // end quantidadeConsultas
	
	
	
	public boolean adicionaConsulta(Consulta c) {
		
		return this.consultas.add(c);
	}
	
	
	public boolean removeConsulta(Consulta c) {
		
		return this.consultas.remove(c);
	}	
	
	
	public boolean procuraConsulta(Consulta c) {
		
		return this.consultas.contains(c);
	}
	
} // end class










