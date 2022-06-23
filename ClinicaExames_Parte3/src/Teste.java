/* 

	Curso: Linguagem de programação I

	Projeto: Clínica médica - Parte 3
	
	Autor: Eduardo Lelis

*/

import java.util.*;

public class Teste {

	public static void main(String[] args) {
		
//		// TESTES PARTE 2
//		// ==========================================================================================
		// Instanciando médicos
		Medico m1 = new Medico("Eduardo Lelis", "lelisco@gmail.com", "123456");
		Medico m2 = new Medico("Eduardo Clemente", "clemente@gmail.com", "123456");
		Medico m3 = new Medico("Eduardo Oliveira", "Oliveirao@gmail.com", "123456");
		// Instanciando pacientes
		Paciente p1 = new Paciente("Zé das Couves", "couve@gmail.com", "10/10/1950");
		Paciente p2 = new Paciente("Zé dos Tomates", "tomates@gmail.com", "16/11/1945");
		Paciente p3 = new Paciente("Zé das Cebolas", "cebolas@gmail.com", "18/01/1960");
		// Instanciando procedimentos
		Procedimento pr1 = new Procedimento("Cirurgia Joelho", 500.0);
		Procedimento pr2 = new Procedimento("Cirurgia Cotovelo", 700.0);
		Procedimento pr3 = new Procedimento("Cirurgia Cabeça", 850.0);
		Procedimento pr4 = new Procedimento("Cirurgia Pé", 1000.0);
		Procedimento pr5 = new Procedimento("Cirurgia Canela", 100.0);
		Procedimento pr6 = new Procedimento("Cirurgia Olho", 1700.0);
		Procedimento pr7 = new Procedimento("Cirurgia Ouvido", 2850.0);
		Procedimento pr8 = new Procedimento("Cirurgia Boca", 4000.0);
		
		
		// Criando ArrayList de procedimentos
		ArrayList<Procedimento> ar1 = new ArrayList<Procedimento>();
		ArrayList<Procedimento> ar2 = new ArrayList<Procedimento>();
		ArrayList<Procedimento> ar3 = new ArrayList<Procedimento>();
		// Adicionando os procedimentos nos arrays
		ar1.add(pr1);
		ar1.add(pr5);
		ar1.add(pr3);
		ar1.add(pr7);
		ar2.add(pr3);
		ar2.add(pr2);
		ar2.add(pr4);
		ar2.add(pr5);
		ar3.add(pr6);
		ar3.add(pr7);
		ar3.add(pr3);
		ar3.add(pr4);
		
		// Instanciando consultas
		Consulta c1 = new Consulta(m1, p1, ar1);
		Consulta c2 = new Consulta(m2, p2, ar2);
		Consulta c3 = new Consulta(m3, p3, ar3);
		// Criando ArrayList de consultas
		ArrayList<Consulta> co1 = new ArrayList<Consulta>();
		// Adicionando consultas no ArrayList
		co1.add(c1);
		co1.add(c2);
		co1.add(c3);
		
		// Instanciando agenda
		Agenda a1 = new Agenda(co1);

		
		// Testes Consulta
		Procedimento pr9 = new Procedimento("Cirurgia X", 340.0);
		c1.adicionaProcedimento(pr9);
		
		if(c1.procuraProcedimento(pr9))
			System.out.println("Procedimento encontrado.");
		else
			System.out.println("Não foi encontrado este procedimento");
		
		c1.removeProcedimento(pr9);
		
		System.out.println();
		if(c1.procuraProcedimento(pr9))
			System.out.println("Procedimento encontrado.");
		else
			System.out.println("Não foi encontrado este procedimento");
		
		
		// Testes Agenda
		Consulta c4 = new Consulta(m1, p2, ar3);
		a1.adicionaConsulta(c4);
		
		System.out.println();
		if(a1.procuraConsulta(c4))
			System.out.println("Consulta encontrada.");
		else
			System.out.println("Não foi encontrado esta consulta");
		
		a1.removeConsulta(c4);
		
		System.out.println();
		if(a1.procuraConsulta(c4))
			System.out.println("Consulta encontrada.");
		else
			System.out.println("Não foi encontrado esta consulta");
		
//		// ==========================================================================================
		
	} // end main
} // end class
