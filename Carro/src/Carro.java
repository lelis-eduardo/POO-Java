
public class Carro {

	// Atributos
	float consumo;
	float nivel;
	float distancia;
	
	
	// Métodos
	Carro(float c, float n, float d){
		
		this.consumo = c;
		this.nivel = n;
		this.distancia = d;
	}
	
	boolean movimenta(float d) {
		
		if(nivel > 0) {
			
			this.distancia += d;
			this.nivel -= this.consumo * d;
			
			return true;
		}
		else
			return false;
	}
	
	float getNivel() {
		
		return this.nivel;
	}
	
	void abastecer(float n) {
		
		this.nivel += n;
	}
	
	float getDistancia() {
		
		return distancia;
	}
	
}
