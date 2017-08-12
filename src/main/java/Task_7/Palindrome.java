package Task_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/Task_7/config");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();

            if (palindrome(word.toLowerCase())) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }

    public static boolean palindrome(String word) {
        char[] charArray = word.toCharArray();
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (charArray[i] != charArray[j]) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }

}