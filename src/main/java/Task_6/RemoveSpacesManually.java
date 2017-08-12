package Task_6;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class RemoveSpacesManually {
    static int i;

    public static void removeSpaces(String word) {
        for (i = 0; i < word.length(); i++) {
            char b = word.charAt(i);
            if (b != ' ')
                System.out.print(b);
        }
    }

    public static void main(String args[]) {
        File file = new File("src/main/java/Task_6/config");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                removeSpaces("Text without spaces : " + line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}