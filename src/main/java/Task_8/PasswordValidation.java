package Task_8;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File( "src/main/java/Task_8/password" );

        Scanner scanner1 = new Scanner( file );
        while (scanner1.hasNextLine()) {
            String passwd = scanner1.nextLine();

            String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_])(?=\\S+$).{8,}";
            System.out.println( passwd.matches( pattern ) );
        }
    }
}
