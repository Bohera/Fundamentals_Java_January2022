package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        double halfN = n * 0.5;
        int targets = 0;
        while (n >= m) {
            n -= m;
            targets++;
            if (n == halfN && y != 0) {
                n /= y;
            }
        }
        System.out.println(n);
        System.out.println(targets);

    }
}
