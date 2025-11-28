import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercicio_09 {
//   Formate uma data no padrão brasileiro (“dd/MM/yyyy”).
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje.format(dtf));

    }
}
