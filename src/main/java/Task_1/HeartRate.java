package Task_1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HeartRate {


    public static void main(String[] args) throws FileNotFoundException {


        System.out.print( "Working zone 90% - 100% is " );
        formula( 0.9, 1, 70 );

        System.out.print( "Working zone 80% - 90% is  " );
        formula( 0.8, 0.9, 70 );

        System.out.print( "Working zone 70% - 80% is  " );
        formula( 0.7, 0.8, 70 );

        System.out.print( "Working zone 60% - 70% is  " );
        formula( 0.6, 0.7, 70 );

        System.out.print( "Working zone 50% - 60% is  " );
        formula( 0.5, 0.6, 70 );

    }

    public static void formula(double percent, double percent1, int calmRate) throws FileNotFoundException {

        //Add age from file
        File file = new File( "src/main/java/Task_1/age" );

        Scanner scanner1 = new Scanner( file );
        while (scanner1.hasNextLine()) {
            int age = Integer.parseInt( scanner1.nextLine() );

            int rate = 220;


            int a = rate - age - calmRate;
            double b = a * percent;
            double zone1 = b + calmRate;

            int a1 = rate - age - calmRate;
            double c = a1 * percent1;
            double zone2 = c + calmRate;

            System.out.println( " " + zone1 + " - " + zone2 );

        }

    }
}
