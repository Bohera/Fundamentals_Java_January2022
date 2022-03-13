package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int capacity = 0;

        for (int i = 0; i < n; i++) {
            int litersPouring = scanner.nextInt();
            capacity += litersPouring;
            if (capacity > 255) {
                System.out.println("Insufficient capacity!");
                capacity -= litersPouring;
            }
        }
        System.out.println(capacity);
    }
}
