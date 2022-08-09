package Sistema;

import java.util.*;

public abstract class Agenda {

	// Atributos
	private static ArrayList<Consulta> consultas = new ArrayList<Consulta>();
	
	public static ArrayList<Consulta> getConsultas() {
		
		return new ArrayList<Consulta>(consultas);
	}

	public static double faturamentoTotal() {
		
		double valor = 0.0;
		
		for(Consulta item : consultas)	
			valor += item.valorConsulta();

		return valor;
	} // end faturamentoTotal

	public static double faturamentoTotalMedico(MedicoComissionado m) {
		
		double salario = 0.0;
		
		for(Consulta item : consultas) {
			
			if(item.getMedico().getId() == m.getId())
				salario += item.valorConsulta();
		}
		
		salario = salario*m.getComissionamento();
		
		return salario;
	}
	
	public static int quantidadeConsultas() {
		
		return consultas.size();
	} // end quantidadeConsultas
	
	
	
	public static boolean adicionaConsulta(Consulta c) {
		
		return consultas.add(c);
	}
	
	
	public static boolean removeConsulta(Consulta c) {
		
		return consultas.remove(c);
	}	
	
	
	public static boolean procuraConsulta(Consulta c) {
		
		return consultas.contains(c);
	}
	
	public static double gastoTotalPaciente(Paciente p) {
		
		double gastoTotal = 0.0;
		
		for(Consulta c : consultas) {
			
			if(p.getNome() == c.getPaciente().getNome())
				gastoTotal += c.valorConsulta();
		}
		
		return gastoTotal;
	}
	
} // end class










