package MethodsLab;

import java.util.Scanner;

public class test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = readLineOfWords(scanner, " ");

        for (String word: words) {
            System.out.println(word);
        }

    }

    private static String[] readLineOfWords(Scanner scanner) {
        return readLineOfWords(scanner, " ");
    }

    private static String[] readLineOfWords(Scanner scanner, String splitByRegex) {
    String line = scanner.nextLine();
    return line.split(splitByRegex);
    }
}
