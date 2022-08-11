package Sistema;

import java.util.*;

public abstract class Agenda {

	// Atributos
	private static Agrupamento<Consulta> consultas = new Agrupamento<Consulta>();
	
	public static Agrupamento<Consulta> getConsultas() {
		
		return new Agrupamento<Consulta>(consultas);
	}

	public static double faturamentoTotal() {
		
		double valor = 0.0;
		
		for(Consulta item : consultas.getLista())	
			valor += item.valorConsulta();

		return valor;
	} // end faturamentoTotal

	public static double faturamentoTotalMedico(MedicoComissionado m) {
		
		double salario = 0.0;
		
		for(Consulta item : consultas.getLista()) {
			
			if(item.getMedico().getId() == m.getId())
				salario += item.valorConsulta();
		}
		
		salario = salario*m.getComissionamento();
		
		return salario;
	}
	
	public static double gastoTotalPaciente(Paciente p) {
		
		double gastoTotal = 0.0;
		
		for(Consulta c : consultas.getLista()) {
			
			if(p.getNome() == c.getPaciente().getNome())
				gastoTotal += c.valorConsulta();
		}
		
		return gastoTotal;
	}
	
	public static void adicionaConsulta(Consulta c) {
		
		consultas.adiciona(c);
	}
	
	public static void adicionaConsultaEmGrupo(ArrayList<Consulta> lista) {
		
		consultas.adicionaEmGrupo(lista);
	}
	
	
	public static Consulta removeConsulta(Consulta c) {
		
		return consultas.retira(c);
	}	
	
} // end class










