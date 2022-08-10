package Sistema;

import java.util.*;

public abstract class Agenda {

	// Atributos
	private static Agrupamento<Consulta> consultas = new Agrupamento<Consulta>();
	
	public static Agrupamento<Consulta> getConsultas() {
		
		Agrupamento<Consulta> aux = new Agrupamento<Consulta>();
		aux = consultas;
		
		return aux;
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
	
} // end class










