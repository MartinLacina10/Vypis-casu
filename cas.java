import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime aktualni = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formatted = aktualni.format(formatter);

        System.out.println("Aktualni datum a cas je: " + formatted);
    }
}