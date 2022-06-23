import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente {
	
	// Atributos
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private String id;
	private static int numId;
	private DateTimeFormatter formatter;
	
	//Métodos
	//Construtor
	public Paciente(String nome, String email, String dataNascimento){
		
		this.nome = nome;
		this.email = email;
		this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataNascimento = LocalDate.parse(dataNascimento, this.formatter);
		this.id = montaIdentificador();
	} // end construtor

	
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

	private static String montaIdentificador() {
		
		numId++;
		
		return "PA" + numId;
	} // end montaIdentificador
	
	} // end class
