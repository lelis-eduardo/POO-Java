import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente extends Pessoa{
	
	// Atributos
	private LocalDate dataNascimento;
	private DateTimeFormatter formatter;
	private static int numId;
	
	//Métodos
	//Construtor
	public Paciente(String nome, String email, String dataNascimento){
		
		super(nome, email);		
		this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataNascimento = LocalDate.parse(dataNascimento, this.formatter);
		numId++;
	} // end construtor

	public Paciente(Paciente p) {
		
		super(p);
		this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataNascimento = LocalDate.parse(p.getDataNascimento(), this.formatter);
		numId++;
	}

	public String getDataNascimento() {
		return this.dataNascimento.format(this.formatter);
	}
	
	@Override
	public String getId() {
		
		return "PA" + numId;
	}
	
} // end class
