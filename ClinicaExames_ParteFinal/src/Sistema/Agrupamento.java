package Sistema;

import java.util.*;

public class Agrupamento<E> {

	private ArrayList<E> lista = new ArrayList<E>();
	
	public Agrupamento() {}
	
	public Agrupamento(Agrupamento<E> elementos) {
		
		for(E elemento : elementos.getLista())
			lista.add(elemento);
	}
	
	public void adiciona(E elemento) {
		
		lista.add(elemento);
	}
	
	public E retira(E elemento) {
		
		lista.remove(elemento);
		
		return elemento;
	}
	
	public boolean temItens() {
		
		return !lista.isEmpty();
	}
	
	public boolean procura(E elemento) {
		
		return lista.contains(elemento);
	}
	
	public int quantidade() {
		
		return lista.size();
	}
	
	public void adicionaEmGrupo(List<E> elementos) {
		
		for(E e : elementos)
			this.adiciona(e);
	}
	
	public ArrayList<E> getLista(){
		
		return lista;
	}
	
}






