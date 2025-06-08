import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class main {

    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 6, 9);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dataCompra.format(formato));
        System.out.println(dataPrimeiraParcela.format(formato));
        System.out.println(dataSegundaParcela.format(formato));

        ZonedDateTime dataConclusao = ZonedDateTime.now();
        System.out.println(dataConclusao);

        ZonedDateTime dataNY = dataConclusao.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(dataNY);

        LocalTime inicio = LocalTime.of(9, 0, 0);
        LocalTime fim = LocalTime.of(17, 30, 0);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println(duracao.toHours() + " Horas");
        System.out.println(duracao.toMinutesPart() + " Minutos");

        LocalDate dataPagemento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagemento);
        System.out.println(periodo.getDays() + " " + periodo.getMonths());
    }
}