package Sistema;

public class Categoria {

	private String nome;
	private String descricao;
	
	public Categoria(String nome, String descricao) {
		
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public String getDescricao() {
		
		return this.descricao;
	}
	
}
