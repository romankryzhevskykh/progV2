package Task_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindSameElementsMethod {
    public static void main(String[] args) {
        int[] a = readFIle("src/main/java/Task_4/date1");
        int[] b = readFIle("src/main/java/Task_4/date2");

        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        aList.retainAll(Arrays.stream(b).boxed().collect(Collectors.toList()));
        System.out.println("The same element :" + aList);
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
