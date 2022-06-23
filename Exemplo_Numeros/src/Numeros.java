
public class Numeros {

	
	double Soma;
	double Maximo;
	double Minimo;
	int quantidadeNumeros;
	
	
	
	Numeros(double x){
		
		this.Maximo = x;
		this.Minimo = x;
		this.Soma = x;
		this.quantidadeNumeros++;
	} // end Numeros
	
	void acumula(double x) {
		
		if(x > this.Maximo)
			this.Maximo = x;
		if(x < this.Minimo)
			this.Minimo = x;
		
		this.Soma = this.Soma + x;
		this.quantidadeNumeros++;
	} // end acumula
	
	double getMedia(){
		
		return(this.Soma / this.quantidadeNumeros);
	} // end getMedia
	
	double getMaximo() {
		
		return this.Maximo;
	} // end getMaximo
	
	double getMinimo() {
		
		return this.Minimo;
	} // end getMinimo
	
}
