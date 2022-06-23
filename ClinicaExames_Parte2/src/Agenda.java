
public class Agenda {

	// Atributos
	private Consulta[] consultas;
	
	
	// Métodos
	public Agenda(Consulta[] consultas){
		
		this.consultas = consultas;
	} // end construtor
	
	
	public Consulta[] getConsultas() {
		return consultas;
	}
	

	public double faturamentoTotal() {
		
		double valor = 0.0;
		
		for(Consulta item : this.consultas)	
			valor += item.valorConsulta();

		return valor;
	} // end faturamentoTotal
	
	public int quantidadeConsultas() {
		
		return this.consultas.length;
	} // end quantidadeConsultas
	
	
} // end class
