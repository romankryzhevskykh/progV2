package Task_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DifferenceBetweenDates {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/java/Task_9/date1");

        Scanner scanner1 = new Scanner(file);
        while (scanner1.hasNextLine()) {
            String firstDate = scanner1.nextLine();

            File file1 = new File("src/main/java/Task_9/date2");

            Scanner scanner2 = new Scanner(file1);
            while (scanner2.hasNextLine()) {
                String secondDate = scanner2.nextLine();

                try {

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                    Date date1 = dateFormat.parse(firstDate);
                    Date date2 = dateFormat.parse(secondDate);

                    long milliseconds = date2.getTime() - date1.getTime();

                    int minutes = (int) (milliseconds / (60 * 1000)); // 60 000 ms = 60 sec = 1 min
                    System.out.println("Difference in minutes: " + minutes);

                    int hours = minutes / 60;
                    System.out.println("Difference in hours: " + hours);

                    int days = hours / 24;
                    System.out.println("Difference in days: " + days);

                } catch (Exception e) {
                    System.out.println("Error occurred " + e.getMessage());
                }
            }
        }
    }
}





