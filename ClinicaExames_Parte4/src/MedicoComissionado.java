import java.util.*;

public class MedicoComissionado extends Medico{

	ArrayList<Consulta> consultas;
	
	public MedicoComissionado(String nome, String email, String crm, ArrayList<Consulta> c) {
		
		super(nome, email, crm);
		this.consultas = c;
	}
	
	public MedicoComissionado(MedicoComissionado m) {
		
		super(m);
		this.consultas = m.getConsultas();		
	}
	
	public ArrayList<Consulta> getConsultas(){
		
		return new ArrayList<Consulta>(this.consultas);
	}
	
	@Override
	public double valorSalario() {
		
		double salario = 0.0;
		
		for(Consulta item : consultas)
			salario += item.valorConsulta();
			
		return salario; 
	}
	
}
