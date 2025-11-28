import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exercicio_05 {
//    Calcule quantos dias faltam para o fim do ano.
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate fimDoAnoAtual = LocalDate.of(dataAtual.getYear(), 12, 31 );
        long diasAteFimDoAno = ChronoUnit.DAYS.between(dataAtual, fimDoAnoAtual);

        System.out.println(diasAteFimDoAno);



    }
}
