package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Train_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] train = new int[wagons];
        int sum = 0;

        for (int i = 0; i < wagons; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
        }
        Arrays.stream(train).forEach(wagon -> System.out.print(wagon + " "));
        System.out.printf("%n%s", sum);

    }
}
