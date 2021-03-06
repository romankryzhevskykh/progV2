package Task_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindMinMaxElementManually {
    public static void main(String[] args) {
        int[] data = readFIle("src/main/java/Task_3/config");

        int max = data[0];
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println("Minimum element is :" + min);
        System.out.println("Maximum element is :" + max);
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

