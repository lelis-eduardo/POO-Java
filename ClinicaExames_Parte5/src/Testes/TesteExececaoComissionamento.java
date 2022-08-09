package Testes;

import Sistema.*;

public class TesteExececaoComissionamento {
	
	public static void main(String[] args) {
	
		System.out.println("Começa o programa e tenta criar um médico comissionado.");
		try {
			
			MedicoComissionado m1 = new MedicoComissionado("Henrique", "Clemente", "m",
			"clemente@gmail.com", "777", 0.4);
			System.out.println("Não houve exceção, médico m1 criado!");
			System.out.println();
		}
		catch(comissionamentoInvalidoException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Continua o programa e tenta criar outro médico comissionado.");
		System.out.println();
		try {
		
			MedicoComissionado m2 = new MedicoComissionado("Ana", "Lemos", "f",
			"lemos@gmail.com", "777", 0.6);
			System.out.println("Esta mensagem não irá aparecer.");
		}
		catch(comissionamentoInvalidoException e) {
			
			e.printStackTrace();
			System.out.println();
			System.out.println("O programa pegou a exceção, médico m2 não criado!");
			System.out.println();
		}
		
		System.out.println("Programa finalizado com uma excessão no último try.");
		
	}
	
}
