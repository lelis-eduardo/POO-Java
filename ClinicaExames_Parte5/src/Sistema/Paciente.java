package Sistema;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente extends Pessoa{
	
	// Atributos
	private LocalDate dataNascimento;
	private DateTimeFormatter formatter;
	private static int sequencial = 0;
	private String id;
	
	//Métodos
	//Construtor
	public Paciente(String nome, String sobrenome, String sexo, String email, String dataNascimento){
		
		super(nome, sobrenome, sexo, email);		
		this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataNascimento = LocalDate.parse(dataNascimento, this.formatter);
		sequencial++;
		id = "PA" + sequencial;
	} // end construtor

	public Paciente(Paciente p) {
		
		super(p.getNome(), p.getSobrenome(), p.getSexo(), p.getEmail());
		this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataNascimento = LocalDate.parse(p.getDataNascimento(), this.formatter);
		sequencial++;
		this.id = "PA" + sequencial;
	}

	public String getDataNascimento() {
		return this.dataNascimento.format(this.formatter);
	}
	
	@Override
	public String getId() {
		
		return this.id;
	}
	
	@Override
	public String getTratamento() {
		
		if(this.getNome() == "Masculino")
			return "Sr." + this.getSobrenome();
		else
			return "Sra." + this.getSobrenome();
	}
	
} // end class
