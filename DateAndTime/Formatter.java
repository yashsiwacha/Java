package Java.DateAndTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Formatter {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Before Formatting: "+ localDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String date = localDate.format(formatter);
        System.out.println("After Formatting: "+ date);
        LocalTime localTime = LocalTime.now();
        System.out.println("Before Fomatting: " +localTime);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("ss:mm:HH:ms");
        String time = timeFormatter.format(localTime);
        System.out.println("After Formatting: "+ time);
        System.out.println(time);
    }
}
