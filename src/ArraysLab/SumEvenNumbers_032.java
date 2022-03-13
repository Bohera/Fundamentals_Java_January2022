package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

    }
}
