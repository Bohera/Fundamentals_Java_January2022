package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");
        int[] arr = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

    }
}
