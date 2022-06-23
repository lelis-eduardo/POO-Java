import java.util.*;

public class Agenda {

	// Atributos
	private ArrayList<Consulta> consultas;
	
	
	// Métodos
	public Agenda(ArrayList<Consulta> consultas){
		
		this.consultas = consultas;
	} // end construtor
	
	
	public ArrayList<Consulta> getConsultas() {
		
		ArrayList<Consulta> c = new ArrayList<Consulta>(this.consultas);
		
		return c;
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
	
	
	
	public void adicionaConsulta(Consulta c) {
		
		this.consultas.add(c);
	}
	
	
	public void removeConsulta(Consulta c) {
		
		this.consultas.remove(c);
	}	
	
	
	public boolean procuraConsulta(Consulta c) {
		
		return this.consultas.contains(c);
	}
	
} // end class










