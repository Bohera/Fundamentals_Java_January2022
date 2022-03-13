package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char stop = scanner.nextLine().charAt(0);

        printCharactersInRange(start, stop);

    }

    private static void printCharactersInRange(char start, char stop) {
        if (start > stop) {
            char temp = start;
            start = stop;
            stop = temp;
        }
        for (int i = start + 1; i < stop ; i++) {
            System.out.printf("%c ", i);
        }
    }
}
