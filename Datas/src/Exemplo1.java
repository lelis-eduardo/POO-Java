import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Exemplo1 {
	public static void main(String[] args) {
		//apenas data, sem hora
		LocalDate dataAtual = LocalDate.now();
		System.out.println("data atual: "+dataAtual );	
		System.out.println("próximo dia: "+dataAtual.plusDays(1));
		System.out.println("dia anterior: "+dataAtual.minusDays(1));
		System.out.println("próximo mes: "+dataAtual.plusMonths(1));
		System.out.println("mes anterior: "+dataAtual.minusMonths(1));
		System.out.println("próximo ano: "+dataAtual.plusYears(1));
		System.out.println("ano anterior: "+dataAtual.minusYears(1));
		
		LocalDate niver = LocalDate.of(1964, 10, 8);
		System.out.println("Aniversário: "+ niver);
		
		//data e hora
		LocalDateTime dataAtual2 = LocalDateTime.now();
		LocalDateTime reuniao = LocalDateTime.of(2019, 04, 28, 14, 30);
		System.out.println("reunião: "+reuniao);
		System.out.println("data e hora atual: "+dataAtual2);	
	
		//apenas a hora
		LocalTime agora = LocalTime.now();
		System.out.println("hora: "+agora);
		
		//horário determinado: 15:25 hrs
		LocalDateTime encontroDeHoje = LocalDate.now().atTime(15,25);
		System.out.println("hora do encontro: "+encontroDeHoje);
		
		//Unindo data e hora 
		LocalTime hora = LocalTime.now();
		LocalDate data = LocalDate.now();
		LocalDateTime dataEhora = data.atTime(hora);
		System.out.println("data e hora: "+dataEhora);
		
		//Alterando o ano de um LocalDate
		LocalDate dataDoPassado = LocalDate.now().withYear(1988);
		System.out.println(dataDoPassado.getYear());
		
		//verifica se algo ocorre antes, depois ou ao mesmo tempo
		LocalDate hoje = LocalDate.now();
		LocalDate amanha = LocalDate.now().plusDays(1);
		System.out.println(hoje.isBefore(amanha));
		System.out.println(hoje.isAfter(amanha));
		System.out.println(hoje.isEqual(amanha));
 
		//dia de um mes
		System.out.println("hoje é dia: "+ MonthDay.now().getDayOfMonth());
		
		//mes por extenso em protuguês
		Locale pt = new Locale("pt");
		System.out.println(Month.DECEMBER.getDisplayName(TextStyle.FULL, pt));
		System.out.println(Month.DECEMBER.getDisplayName(TextStyle.SHORT, pt));
		
		//Formatando 
		LocalDateTime agora2 = LocalDateTime.now();
		String resultado = agora2.format(DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println(resultado);
		resultado = agora2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(resultado);
		
		//Periodo de tempo
		LocalDate agora3 = LocalDate.now();
		LocalDate outraData = LocalDate.of(2017, Month.DECEMBER, 10);
		long dias = ChronoUnit.DAYS.between(outraData, agora3);
		System.out.println(dias);
		long anos = ChronoUnit.YEARS.between(outraData, agora3);
		System.out.println(anos);
		long meses = ChronoUnit.MONTHS.between(outraData, agora3);
		System.out.println(meses);
		
		//perioso em dias, meses e anos entre datas
		LocalDate agora4 = LocalDate.now();
		LocalDate outraData4 = LocalDate.of(1989, Month.JANUARY, 25);
		Period periodo = Period.between(outraData4, agora4);
		System.out.printf("%s dias, %s meses e %s anos",
		periodo.getDays(),
		periodo.getMonths(), periodo.getYears());
		
	}
}
