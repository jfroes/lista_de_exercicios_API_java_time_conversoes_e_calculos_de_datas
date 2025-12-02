
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Exercicio_13 {
//   Crie um calendário que mostre o próximo domingo.
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate agora = LocalDate.now();

        LocalDate proximoDomingo = agora.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

        System.out.println("Hoje: " + agora.format(dtf));
        System.out.println("Póximo domingo: " + proximoDomingo.format(dtf));


    }
}
