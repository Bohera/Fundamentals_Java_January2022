package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder otherChar = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                digit.append(line.charAt(i));
            } else if (Character.isLetter(line.charAt(i))) {
                letter.append(line.charAt(i));
            } else {
                otherChar.append(line.charAt(i));
            }
        }

        System.out.println(digit);
        System.out.println(letter);
        System.out.println(otherChar);

    }
}
