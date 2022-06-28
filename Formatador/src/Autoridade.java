
public class Autoridade{
	
	private String nome;
	private String sobrenome;
	private FormatadorNome titulo;
	
	public Autoridade(String nome, String sobrenome, FormatadorNome titulo) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.titulo = titulo;
	}
	
	public String getTratamento() {
		
		return titulo.formatarNome(this.nome, this.sobrenome);
	}
		
}
