package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(checkPalindrome(input));

            input = scanner.nextLine();
        }

    }

    private static boolean checkPalindrome(String input) {
        long[] arrayInput = Arrays.stream(input.split(""))
                .mapToLong(e -> Long.parseLong(e))
                .toArray();
        boolean isPalindrome = false;
        if (arrayInput.length == 1) {
            return true;
        } else {
            for (int i = 0; i < arrayInput.length / 2; i++) {
                if (arrayInput[i] == arrayInput[arrayInput.length - 1 - i]) {
                    isPalindrome = true;
                } else {
                    return false;
                }
            }
        }
        return isPalindrome;
    }
}
