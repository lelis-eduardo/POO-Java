package Testes;

import java.util.*;
import Sistema.*;

public class TesteAgrupamentos {

	public static void main(String[] args) {
	
// Preparação do teste e teste dos agrupamentos e funcionalidades
// #####################################################################################
		MedicoAssalariado m1 = new MedicoAssalariado("Eduardo", "Lelis", "M", "eduardo@gmail.com", "222", 15000);
		MedicoAssalariado m2 = new MedicoAssalariado("Liana", "Sena", "f", "liana@gmail.com", "777", 25000);
		MedicoComissionado m3;
		MedicoComissionado m4;		
		
		// Instanciando pacientes
		Paciente p1 = new Paciente("Abigail",  "Couves", "f", "couve@gmail.com", "10/10/1950");
		Paciente p2 = new Paciente("Bernardo", "Tomates", "M", "tomates@gmail.com", "16/11/1945");
		Paciente p3 = new Paciente("Cezar", "Cebolas", "M", "cebolas@gmail.com", "18/01/1960");
		Paciente p4 = new Paciente("Daiane",  "Couves", "f", "couve@gmail.com", "10/10/1950");
		Paciente p5 = new Paciente("Eduarda", "Tomates", "f", "tomates@gmail.com", "16/11/1945");
		Paciente p6 = new Paciente("Felipe", "Cebolas", "M", "cebolas@gmail.com", "18/01/1960");
		Paciente p7 = new Paciente("Gabriel",  "Couves", "M", "couve@gmail.com", "10/10/1950");
		Paciente p8 = new Paciente("Henrique", "Tomates", "M", "tomates@gmail.com", "16/11/1945");
		Paciente p9 = new Paciente("Ingrid", "Cebolas", "M", "cebolas@gmail.com", "18/01/1960");
		Paciente p10 = new Paciente("Jose", "Cebolas", "M", "cebolas@gmail.com", "18/01/1960");
		// Instanciando procedimentos
		Procedimento pr1 = new Procedimento("Cirurgia Joelho", 10000.0);
		Procedimento pr2 = new Procedimento("Cirurgia Cotovelo", 2000.0);
		Procedimento pr3 = new Procedimento("Cirurgia Cabeça", 12000.0);
		Procedimento pr4 = new Procedimento("Cirurgia Pé", 1000.0);
		Procedimento pr5 = new Procedimento("Cirurgia Canela", 1000.0);
		Procedimento pr6 = new Procedimento("Cirurgia Olho", 2000.0);
		Procedimento pr7 = new Procedimento("Cirurgia Ouvido", 10000.0);
		Procedimento pr8 = new Procedimento("Cirurgia Boca", 2000.0);
	
		// Criando Agrupamento de procedimentos
		Agrupamento<Procedimento> ar1 = new Agrupamento<Procedimento>();
		Agrupamento<Procedimento> ar2 = new Agrupamento<Procedimento>();
		Agrupamento<Procedimento> ar3 = new Agrupamento<Procedimento>();
		// Adicionando os procedimentos nos arrays
		ar1.adiciona(pr1);
		ar1.adiciona(pr5);
		ar1.adiciona(pr3);
		ar1.adiciona(pr7);
		ar2.adiciona(pr3);
		ar2.adiciona(pr6);
		ar2.adiciona(pr4);
		ar2.adiciona(pr5);
		ar3.adiciona(pr2);
		ar3.adiciona(pr8);
		ar3.adiciona(pr8);
		ar3.adiciona(pr2);
		
		try {
			
			m3 = new MedicoComissionado("Henrique", "Clemente", "m", "clemente@gmail.com", "777", 0.4);
			Consulta c4 = new Consulta(m3, p8, ar3);
			Consulta c5 = new Consulta(m3, p10, ar2);
			Consulta c6 = new Consulta(m3, p1, ar1);
			
			Agenda.adicionaConsulta(c4);
			Agenda.adicionaConsulta(c5);
			Agenda.adicionaConsulta(c6);
		}
		catch(comissionamentoInvalidoException e) {
		
			e.printStackTrace();
		}
		
		try {
			
			m4 = new MedicoComissionado("Ana", "Lemos", "f", "lemos@gmail.com", "777", 0.45);
			Consulta c1 = new Consulta(m4, p2, ar1);
			Consulta c2 = new Consulta(m4, p4, ar2);
			Consulta c3 = new Consulta(m4, p6, ar3);
			
			Agenda.adicionaConsulta(c1);
			Agenda.adicionaConsulta(c2);
			Agenda.adicionaConsulta(c3);
		}
		catch(comissionamentoInvalidoException e) {
			
			e.printStackTrace();
		}
	
		// Instanciando consultas médicos assalariados
		Consulta c7 = new Consulta(m2, p3, ar1);
		Consulta c8 = new Consulta(m2, p5, ar2);
		Consulta c9 = new Consulta(m1, p7, ar3);
		Consulta c10 = new Consulta(m1, p9, ar2);
		Consulta c11 = new Consulta(m1, p8, ar3);
		Consulta c12 = new Consulta(m1, p8, ar3);
		Consulta c13 = new Consulta(m2, p8, ar3);
		Consulta c14 = new Consulta(m1, p8, ar3);
		
		// Adicionando consultas de médicos assalariados
		Agenda.adicionaConsulta(c7);
		Agenda.adicionaConsulta(c8);
		Agenda.adicionaConsulta(c9);
		Agenda.adicionaConsulta(c10);

// Teste dos métodos da classe agrupamento
// #####################################################################################
		
		//Adiciona
		System.out.println("Adicionando consultas na agenda.");
		System.out.print("Lista antes: ");
		for(Consulta c : Agenda.getConsultas().getLista())
			System.out.print(c.getId() + " ");
		System.out.println();
		
		Agenda.adicionaConsulta(c11);
		System.out.println("Consulta adicionada à agenda.");
		
		System.out.print("Lista depois: ");
		for(Consulta c : Agenda.getConsultas().getLista())
			System.out.print(c.getId() + " ");
		System.out.println();
		System.out.println();
		
		
		//Retira
		System.out.println("Retirando consulta da agenda.");
		System.out.print("Lista antes: ");
		for(Consulta c : Agenda.getConsultas().getLista())
			System.out.print(c.getId() + " ");
		System.out.println();
		
		System.out.println("Consulta retirada da agenda: " + Agenda.removeConsulta(c11));
		
		System.out.print("Lista depois: ");
		for(Consulta c : Agenda.getConsultas().getLista())
			System.out.print(c.getId() + " ");
		System.out.println();
		System.out.println();
		
		//Verifica existencia de itens
		System.out.println("Verificando a existencia de consultas na agenda.");
		if(Agenda.getConsultas().temItens())
			System.out.println("A agenda possui consultas.");
		else
			System.out.println("A agenda não possui consultas.");
		System.out.println();
		
		//Procura itens
		System.out.println("Procurando uma consulta na agenda.");
		if(Agenda.getConsultas().procura(c10))
			System.out.println("Consulta " + c10.getId() + " encontrada");
		else
			System.out.println("Consulta não encontrada.");
		System.out.println();
		
		
		//Quantidade de itens
		System.out.println("Descobrindo a quantidade de consultas na agenda.");
		System.out.println("A agenda possui " + Agenda.getConsultas().quantidade() + " consultas.");
		System.out.println();
		
		
		//Adiciona em grupo
		System.out.println("Adicionando lista de consultas: ");
		System.out.print("Lista antes: ");
		for(Consulta c : Agenda.getConsultas().getLista())
			System.out.print(c.getId() + " ");
		System.out.println();
	
		ArrayList<Consulta> grupoConsultas = new ArrayList<Consulta>();
		grupoConsultas.add(c11);
		grupoConsultas.add(c12);
		grupoConsultas.add(c13);
		grupoConsultas.add(c14);
		Agenda.adicionaConsultaEmGrupo(grupoConsultas);
		
		System.out.print("Lista depois: ");
		for(Consulta c : Agenda.getConsultas().getLista())
			System.out.print(c.getId() + " ");
		System.out.println();
		System.out.println();
		
		
		//Pegando a lista de consultas e listando os médicos
		System.out.println("Listando médicos responsáveis pelas consultas.");
		for(Consulta c : Agenda.getConsultas().getLista())
			System.out.println(c.getId() + ": " + c.getMedico().getFormataNome());
		
	}
}















