package Sistema;

import java.util.*;

public class DivisaoCategoria {

	private Map<Paciente, Categoria> divisao = new HashMap();
	
	public boolean estaVazia() {
		
		return divisao.isEmpty();
	}
	
	public void distribuiCategoria(Paciente p, Categoria c) {
		
		this.divisao.put(p, c);
	}	
	
	public Categoria getCategoria(Paciente p) {
		
		return this.divisao.get(p);
	}
	
	public Set<Paciente> getLista() {
		
		Set<Paciente> lista = this.divisao.keySet();
		
		return lista;
	}
}




