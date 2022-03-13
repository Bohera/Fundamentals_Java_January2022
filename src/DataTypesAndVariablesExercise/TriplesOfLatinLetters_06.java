package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n;k++){
                    char firstChar = (char) ('a' + i);
                    char secondChar = (char) ('a' + j);
                    char thirdChar = (char) ('a' + k);
                    String triples = String.format("%c%c%c", firstChar, secondChar, thirdChar);
                    //System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                    System.out.println(triples);
                }
            }
        }

    }
}
