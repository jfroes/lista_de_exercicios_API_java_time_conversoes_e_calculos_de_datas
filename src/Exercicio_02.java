import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercicio_02 {
//    Mostre o dia da semana de uma data.
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        DayOfWeek diaDaSemana = data.getDayOfWeek();
        int dataDiaDaSemana = data.getDayOfMonth();



        System.out.println(dataDiaDaSemana + ", "+ diaDaSemana );
    }
}
