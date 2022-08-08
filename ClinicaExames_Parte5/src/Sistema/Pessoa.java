package Sistema;

public abstract class Pessoa implements FormatadorNome {
	
	// Atributos
	private String nome;
	private String sobrenome;
	private String sexo;
	private String email;
	
	//Métodos
	//Construtor
	public Pessoa(String nome, String sobrenome, String sexo, String email){
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.email = email;
	} // end construtor
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getSexo() {
		
		if(sexo == "M" || sexo == "m" || sexo == "Masculino" || sexo == "masculino")
			return "Masculino";
		else
			return "Feminino";
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		
			String apresentacao = this.getTratamento() + "\n(" + this.email + ")";
		
			return apresentacao;
		} // end toString
	
	public abstract String getId();
	
	} // end class
