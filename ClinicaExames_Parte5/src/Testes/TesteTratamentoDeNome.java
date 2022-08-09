package Testes;

import Sistema.MedicoAssalariado;
import Sistema.Paciente;

public class TesteTratamentoDeNome {

	public static void main(String[] args) {
		
		MedicoAssalariado m1 = new MedicoAssalariado("Eduardo", "Lelis", "M", "eduardo@gmail.com", "222", 15000);
		MedicoAssalariado m2 = new MedicoAssalariado("Liana", "Sena", "f", "liana@gmail.com", "777", 25000);
		Paciente p1 = new Paciente("Zé",  "Couves", "M", "couve@gmail.com", "10/10/1950");
		Paciente p2 = new Paciente("Maria", "Flores", "f", "tomates@gmail.com", "16/11/1945");
		
		System.out.println("Medico m1: " + m1.getFormataNome());
		System.out.println();
		System.out.println("Medico m2: " + m2.getFormataNome());
		System.out.println();
		System.out.println("Paciente p1: " + p1.getFormataNome());
		System.out.println();
		System.out.println("Paciente p2: " + p2.getFormataNome());
		System.out.println();
	
	}

}
