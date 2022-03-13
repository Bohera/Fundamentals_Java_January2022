package ArraysLab;

import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] items = inputLine.split(" "); //"\\s+" - за повече от един спейс

        int[] arr = new int[items.length];

        int sum = 0;

        for (int i = 0; i < items.length;i++) {
                arr[i] = Integer.parseInt(items[i]);
        }

        for (int i = 0; i < arr.length;i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }

        }
        System.out.println(sum);

    }
}
