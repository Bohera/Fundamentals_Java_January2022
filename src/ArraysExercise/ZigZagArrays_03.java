package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        String[] arrayOne = new String[lines];
        String[] arrayTwo = new String[lines];


        for (int i = 0; i < lines; i++) {
            String[] arrayLine = scanner.nextLine().split("\\s+");

            if (i % 2 != 0) {
                arrayOne[i] = arrayLine[1];
                arrayTwo[i] = arrayLine[0];
            } else {
                arrayOne[i] = arrayLine[0];
                arrayTwo[i] = arrayLine[1];
            }
        }
        for (int i = 0; i < lines; i++) {
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < lines; i++) {
            System.out.print(arrayTwo[i] + " ");
        }

    }
}
