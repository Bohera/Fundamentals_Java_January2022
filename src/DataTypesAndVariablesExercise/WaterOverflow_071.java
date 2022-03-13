package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int capacity = 0;

        for (int i = 0; i < n; i++) {
            int litersPouring = scanner.nextInt();
            if (capacity + litersPouring <= 255) {
                capacity += litersPouring;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(capacity);
    }
}
