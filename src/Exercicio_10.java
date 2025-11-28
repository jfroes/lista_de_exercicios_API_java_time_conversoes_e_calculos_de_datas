import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio_10 {
//   Parseie uma string “2025-05-20” para LocalDate.
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = "20/11/2025";

        System.out.println(LocalDate.parse(data, dtf));

    }
}
