import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio_11 {
//   Mostre a hora atual em outro fuso (ZoneId.of("America/New_York"))
    public static void main(String[] args) {
        ZonedDateTime aqui = ZonedDateTime.now();
        ZoneId londres = ZoneId.of("Europe/London");

        ZonedDateTime horaEmLondres = aqui.withZoneSameInstant(londres);

        System.out.println("Hora aqui: " + aqui);
        System.out.println("Hora em Londres: " + horaEmLondres);

    }
}
