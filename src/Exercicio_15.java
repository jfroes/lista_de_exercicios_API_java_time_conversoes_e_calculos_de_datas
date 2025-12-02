
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio_15 {
//   Calcule a idade de uma pessoa a partir da data de nascimento
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Digite seu aniversario EX:\"07/06/1996\": ");
        String[] data = sc.next().split("/");

        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);

        LocalDate aniversario = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        Period idade = Period.between(aniversario, hoje);

        System.out.println("Voce tem: " +idade.getYears() + " anos, " + idade.getMonths() + " meses e " + idade.getDays() + " dias de vida.");
    }
}
