package Task_5;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindSubstring {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/java/Task_5/word");

        Scanner scanner1 = new Scanner(file);
        while (scanner1.hasNextLine()) {
            String word = scanner1.nextLine();

            File file1 = new File("src/main/java/Task_5/sentence");

            Scanner scanner2 = new Scanner(file1);
            while (scanner2.hasNextLine()) {
                String text = scanner2.nextLine();


                System.out.println("Number of occurrences : "+ ((text + "\0").split(word).length - 1));
            }

        }
    }
}
