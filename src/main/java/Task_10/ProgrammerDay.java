package Task_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ProgrammerDay {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/Task_10/config");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            Integer year = Integer.valueOf(scanner.nextLine());

            Calendar calendar = new GregorianCalendar(year, Calendar.JANUARY, 1);
            calendar.add(Calendar.DAY_OF_YEAR, 255);
            System.out.println(calendar.getTime());
        }
    }

}
