package Testes;

import Sistema.*;

public class TesteExececaoComissionamento {
	
	public static void main(String[] args) {
	
		System.out.println("Come�a o programa e tenta criar um m�dico comissionado.");
		try {
			
			MedicoComissionado m1 = new MedicoComissionado("Henrique", "Clemente", "m",
			"clemente@gmail.com", "777", 0.4);
			System.out.println("N�o houve exce��o, m�dico m1 criado!");
			System.out.println();
		}
		catch(comissionamentoInvalidoException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Continua o programa e tenta criar outro m�dico comissionado.");
		System.out.println();
		try {
		
			MedicoComissionado m2 = new MedicoComissionado("Ana", "Lemos", "f",
			"lemos@gmail.com", "777", 0.6);
			System.out.println("Esta mensagem n�o ir� aparecer.");
		}
		catch(comissionamentoInvalidoException e) {
			
			e.printStackTrace();
			System.out.println();
			System.out.println("O programa pegou a exce��o, m�dico m2 n�o criado!");
			System.out.println();
		}
		
		System.out.println("Programa finalizado com uma excess�o no �ltimo try.");
		
	}
	
}
