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
	
	public static String relatorioOrdemCrescenteNomePaciente() {
		
		String relatorio = "";
		double valorTotalMedicos = 0.0, valorTotalClinica = 0.0;
		
		for(Consulta item : consultas) {
		
				valorTotalMedicos += item.getMedico().faturamentoMedicoPorConsulta(item);
				valorTotalClinica += (item.valorConsulta() - item.getMedico().faturamentoMedicoPorConsulta(item));
				
				relatorio += "\n" + item.getPaciente().getFormataNome() + "\nFaturamento médico: "
				+ item.getMedico().faturamentoMedicoPorConsulta(item) + " ("
				+ item.getMedico().getTipoMedico() + ")" + "\nFaturamento clínica: "
				+ (item.valorConsulta() - item.getMedico().faturamentoMedicoPorConsulta(item)) + "\n";
		}
		
		relatorio += "\nFaturamento total medicos: " + valorTotalMedicos + "\n";
		relatorio += "Faturamento total clinica: " + valorTotalClinica + "\n";
		relatorio += "Faturamento total: " + faturamentoTotal() + "\n";
	
		return relatorio;
	}
	
	public static String relatorioOrdemDecrescenteNomeMedico() {
		
		String relatorio = "";
		ArrayList<Consulta> c = new ArrayList<Consulta>();
		double valorTotalMedicos = 0.0, valorTotalClinica = 0.0;
		
		for(Consulta item : consultas) {
			
			c.add(0, item);
		}
		
		for(Consulta item : c) {
			
			valorTotalMedicos += item.getMedico().faturamentoMedicoPorConsulta(item);
			valorTotalClinica += (item.valorConsulta() - item.getMedico().faturamentoMedicoPorConsulta(item));
			
			relatorio += "\n" + item.getMedico().getFormataNome() + "\nFaturamento médico: "
			+ item.getMedico().faturamentoMedicoPorConsulta(item) + " ("
			+ item.getMedico().getTipoMedico() + ")" + "\nFaturamento clínica: "
			+ (item.valorConsulta() - item.getMedico().faturamentoMedicoPorConsulta(item)) + "\n";
			
		}
		
		relatorio += "\nFaturamento total medicos: " + valorTotalMedicos + "\n";
		relatorio += "Faturamento total clinica: " + valorTotalClinica + "\n";
		relatorio += "Faturamento total: " + faturamentoTotal() + "\n";
	
		return relatorio;
	}
	
} // end class










