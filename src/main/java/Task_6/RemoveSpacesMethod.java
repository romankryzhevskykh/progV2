package Task_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class RemoveSpacesMethod {
    public static void main(String[] args) {
        File file = new File("src/main/java/Task_6/config");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String a = line.replaceAll(" ", "");
                System.out.println("Text without spaces : " + a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}



