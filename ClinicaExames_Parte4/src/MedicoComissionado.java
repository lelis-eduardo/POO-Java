import java.util.*;

public class MedicoComissionado extends Medico {

	private ArrayList<Consulta> consultas;
	private double comissionamento;

	public MedicoComissionado(String nome, String email, String crm, double comissionamento) {

		super(nome, email, crm);
		this.comissionamento = comissionamento;
		this.consultas = new ArrayList<Consulta>();
	}

	public MedicoComissionado(MedicoComissionado m) {

		super(m.getNome(), m.getEmail(), m.getCrm());
		this.comissionamento = m.getComissionamento();
		this.consultas = m.getConsultas();
	}
	
	
	public double getComissionamento() {

		return this.comissionamento;
	}
	

	public void adicionaConsulta(Consulta c) {

		this.consultas.add(c);
	}

	public void removeConsulta(Consulta c) {

		this.consultas.remove(c);
	}

	public ArrayList<Consulta> getConsultas() {

		return new ArrayList<Consulta>(this.consultas);
	}

	
	@Override
	public double getSalario() {

		double salario = 0.0;

		for (Consulta item : consultas)
			salario += item.valorConsulta();

		return salario*this.comissionamento;
	}
	
	@Override
	public String getNomeClasse() {
		
		return "Médico comissionado";
	}

}
