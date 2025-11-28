import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercicio_07 {
//    Converta LocalDate para LocalDateTime.
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDateTime dataHora = LocalDateTime.of(data, LocalTime.now());

        System.out.println(dataHora);

    }
}
