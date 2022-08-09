package Sistema;

import java.util.Comparator;

public class CriterioNomeMedico implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Consulta c1 = (Consulta) o1;
		Consulta c2 = (Consulta) o2;
		
		return c1.getMedico().getNome().compareTo(c2.getMedico().getNome()) * -1;
	}
	
}
