
public class Teste {

	public static void main(String[] args) {
		
		Informal tratamentoInformal = new Informal();
		Autoridade a1 = new Autoridade("João", "Silveira", tratamentoInformal);
		System.out.println(a1.getTratamento());
		Respeitoso tratamentoRespeitosoMasculino = new Respeitoso(true);
		Autoridade a2 = new Autoridade("João", "Silveira", tratamentoRespeitosoMasculino);
		System.out.println(a2.getTratamento());
		Respeitoso tratamentoRespeitosoFeminino = new Respeitoso(false);
		Autoridade a3 = new Autoridade("Joana", "Silveira", tratamentoRespeitosoFeminino);
		System.out.println(a3.getTratamento());
		ComTitulo tratamentoComTitutlo = new ComTitulo("Majestade");
		Autoridade a4 = new Autoridade("João", "Silveira", tratamentoComTitutlo);
		System.out.println(a4.getTratamento());
	}

}
