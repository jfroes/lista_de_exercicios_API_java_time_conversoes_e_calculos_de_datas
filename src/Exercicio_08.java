import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Exercicio_08 {
//    Calcule a diferença entre duas datas (ChronoUnit.DAYS.between).
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2025, 6 ,7);
        LocalDate data2 = LocalDate.of(2025, 7, 8);


        long totalDias = ChronoUnit.DAYS.between(data1, data2);

        System.out.println(totalDias);

    }
}
