
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio_14 {
//   Gere lista com todas as datas de um mês.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite um mes e ano ex:\"07/1996\"");
        String[] mesAno = sc.next().split("/");
        int mes = Integer.parseInt(mesAno[0]);
        int ano = Integer.parseInt(mesAno[1]);

        LocalDate data = LocalDate.of(ano, mes, 1);

        LocalDate inicio = data.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate fim = data.with(TemporalAdjusters.lastDayOfMonth()).plusDays(1);

        List<LocalDate> calendario = inicio.datesUntil(fim).toList();

        String datas = calendario.stream().map(LocalDate::toString).collect(Collectors.joining(",", "[","]"));
        System.out.println(datas);
        sc.close();
    }
}
