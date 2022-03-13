package DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input = scanner.nextLine().charAt(0);

        if ('A'<= input  && input <= 'Z') {
            System.out.println("upper-case");
        } else if ('a' <= input && input <= 'z') {
            System.out.println("lower-case");
        }

    }
}
