import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio_12 {
//   Calcule o tempo entre dois horários (Duration.between).
    public static void main(String[] args) {
        LocalDateTime hora1 = LocalDateTime.now();
        LocalDateTime hora2 = hora1.plus(Duration.ofHours(1).plusMinutes(45));

        Duration diferenca = Duration.between(hora1, hora2);
        long horas = diferenca.toHours();
        long minutos = diferenca.toMinutesPart();
        String diferencaFormatada = String.format("%d:%02d", horas, minutos);


        System.out.println(String.format("Inicio " + hora1.format(DateTimeFormatter.ofPattern("HH:mm")) + " Final:" + hora2.format(DateTimeFormatter.ofPattern("HH:mm")) + " Duração: " + diferencaFormatada));

    }
}
