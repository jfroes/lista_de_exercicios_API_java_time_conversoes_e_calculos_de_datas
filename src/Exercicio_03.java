import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;

public class Exercicio_03 {
//    Adicione 10 dias a uma data.
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDate daqui10Dias = data.plusDays(10);

        System.out.println(data);
        System.out.println("Daqui 10 dias: " + daqui10Dias);

    }
}
