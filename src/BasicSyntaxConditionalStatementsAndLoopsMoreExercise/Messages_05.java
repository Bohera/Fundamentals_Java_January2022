package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lettersCount = Integer.parseInt(scanner.nextLine());

        String message = "";

        for (int i = 0; i < lettersCount; i++) {
            String digit = scanner.nextLine();
            int digitLength = digit.length();
            char numberChar = digit.charAt(0);
            int number = Character.getNumericValue(numberChar);
            int offset = (number - 2) * 3;
            if (number == 8 || number == 9) {
                offset++;
            }
            int letterIndex = offset + digitLength - 1;
            int letterASCII = letterIndex + 97;

            char letter = (char)letterASCII;
            if (number == 0){
                letter = (char) (number + 32);
            }
            message += letter;

        }
        System.out.println(message);
    }
}
