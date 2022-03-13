package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int tank = 0;

        for (int i = 0; i < n; i++) {
            int litersPouring = scanner.nextInt();
            if (tank + litersPouring > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            tank += litersPouring;
        }
        System.out.println(tank);
    }
}
