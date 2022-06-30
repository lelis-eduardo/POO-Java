/* 

	Curso: Linguagem de programação I

	Projeto: Clínica médica - Parte 4
	
	Autor: Eduardo Lelis

*/

import java.util.*;

public class Teste {

	public static void main(String[] args) {
		
//		// TESTES PARTE 4
//		// ==========================================================================================
		MedicoAssalariado m = new MedicoAssalariado("DUDU", "DUDU", "UDUD", 1000);
		Medico m2 = new Medico("Eduardo", "Eduardo", "123");
		
		System.out.println(IdentificadorDeMedico.identificaMedico(m));
		System.out.println(IdentificadorDeMedico.identificaMedico(m2));
		
//		// ==========================================================================================
		
	} // end main
} // end class












