package Task_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindMinMaxElementMethod {
    public static void main(String[] args) {
        int[] data = readFIle("src/main/java/Task_3/config");

        int min = IntStream.of(data).min().getAsInt();
        int max = IntStream.of(data).max().getAsInt();
        System.out.println("Minimum element is : " + min);
        System.out.println("Maximum element is : " + max);
    }

    // Reading integers from file
    public static int[] readFIle(String file) {
        try {
            File f = new File(file);
            Scanner s = new Scanner(f);
            int a = 0;
            while (s.hasNextInt()) {
                a++;
                s.nextInt();
            }
            int[] arr = new int[a];
            Scanner s1 = new Scanner(f);
            for (int i = 0; i < arr.length; i++)
                arr[i] = s1.nextInt();
            return arr;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new int[0];
    }
}




