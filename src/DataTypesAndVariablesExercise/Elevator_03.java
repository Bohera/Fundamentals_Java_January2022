package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int courses = n / p;

        if (n % p != 0) {
            courses++;
        }
        System.out.println(courses);
    }
}
