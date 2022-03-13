package TextProcessingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char[] input = scanner.nextLine().toCharArray();
        List<Character> output = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            char newChar = (char) (input[i] + 3);
            output.add(newChar);
        }

        output.forEach(System.out::print);
    }
}
