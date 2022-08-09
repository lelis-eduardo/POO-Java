package Sistema;

import java.util.*;

public abstract class ClassificaPacientes {

	private static DivisaoCategoria divisao = new DivisaoCategoria();
	private static Categoria categoriaA = new Categoria("Categoria A", "Total de consultas acima de R$30.000,00");
	private static Categoria categoriaB = new Categoria("Categoria B", "Total de consultas entre R$10.000,00 e R$30.000,00");
	private static Categoria categoriaC = new Categoria("Categoria C", "Total de consultas abaixo de R$10.000,00");
	
	public static void classificaPacientes(ArrayList<Consulta> listaConsultas) {
		
		for(Consulta c : listaConsultas) {
			
			if(Agenda.gastoTotalPaciente(c.getPaciente()) > 30000)
				divisao.distribuiCategoria(c.getPaciente(), categoriaA);
			else if(Agenda.gastoTotalPaciente(c.getPaciente()) < 10000)
				divisao.distribuiCategoria(c.getPaciente(), categoriaC);
			else
				divisao.distribuiCategoria(c.getPaciente(), categoriaB);
		}
	}
	
	public static DivisaoCategoria getDivisao() {
		
		return divisao;
	}
	
}
