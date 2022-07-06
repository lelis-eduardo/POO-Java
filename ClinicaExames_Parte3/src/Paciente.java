import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente {
	
	// Atributos
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private DateTimeFormatter formatter;
	private String id;
	private static int sequencial = 0;
	
	//Métodos
	//Construtor
	public Paciente(String nome, String email, String dataNascimento){
		
		this.nome = nome;
		this.email = email;
		this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataNascimento = LocalDate.parse(dataNascimento, this.formatter);
		sequencial++;
		this.id = "PA" + sequencial;
	} // end construtor

	public Paciente(Paciente p) {
		
		this.nome = p.getNome();
		this.email = p.getEmail();
		this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataNascimento = LocalDate.parse(p.getDataNascimento(), this.formatter);
		this.id = p.getId();
	}
	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getDataNascimento() {
		return this.dataNascimento.format(this.formatter);
	}

	public String getId() {
		return id;
	}


	public String toString() {
		
			String apresentacao = "Sr(a) " + this.nome + "\n(" + this.email + ")";
		
			return apresentacao;
		} // end toString

	
	} // end class
