import java.time.LocalDate;

public class Exercicio_04 {
//    Subtraia 3 meses de uma data.
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDate menos3Meses = data.minusMonths(3);

        System.out.println(data);
        System.out.println("Menos 3 meses: " + menos3Meses);

    }
}
