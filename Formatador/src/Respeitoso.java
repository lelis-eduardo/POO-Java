
public class Respeitoso implements FormatadorNome{
	
	private String tratamento;
	
	public Respeitoso(boolean s) {
		
		if(s)
			this.tratamento = "Sr.";
		else
			this.tratamento = "Sra.";
	}
	
	public String formatarNome(String nome, String sobrenome) {
		
		return this.tratamento + " " + sobrenome;
	}
	
}
