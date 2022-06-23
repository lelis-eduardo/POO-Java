/* 

	Curso: Linguagem de programa��o I

	Projeto: Cl�nica m�dica - Parte 1
	
	Autor: Eduardo Lelis

*/

public class Teste {

	public static void main(String[] args) {
		
		// Teste m�dico
		Medico m = new Medico("Eduardo Lelis", "lelisco@gmail.com", "123456");
		System.out.println("Nome m�dico: " + m.getNome());
		System.out.println("Email m�dico: " + m.getEmail());
		System.out.println("CRM m�dico: " + m.getCrm());
		System.out.println("");
		
		// Teste paciente
		Paciente p = new Paciente("Z� das Couves", "couve@gmail.com", "10/10/1950");
		System.out.println("Nome paciente: " + p.getNome());
		System.out.println("Email paciente: " + p.getEmail());
		System.out.println("Data de nascimento do paciente: " + p.getDataNascimento());
		System.out.println("");
		
		// Teste procedimento	
		Procedimento c = new Procedimento("Cirurgia catarata", 1000);
		System.out.println("Descricao procedimento: " + c.getDescricao());
		System.out.println("Valor procedimento: R$" + c.getValor());
		System.out.println("");
		System.out.println("");
		
		// Teste dos m�todos "toString"
		// M�dico
		System.out.println(m.toString());
		System.out.println("");
		// Paciente
		System.out.println(p.toString());
		System.out.println("");
		// Procedimento
		System.out.println(c.toString());
		System.out.println("");
		
	} // end main
} // end class
