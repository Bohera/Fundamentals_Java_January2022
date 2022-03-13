package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int characterCount = Integer.parseInt(scanner.nextLine());

        String decryptedMessage = "";

        for (int i = 0; i < characterCount; i++) {
            String input = scanner.nextLine();
            char letter = input.charAt(0);
            int decryptLetter = ((int)letter) + key;
            decryptedMessage += (char) decryptLetter;
        }
        System.out.println(decryptedMessage);
    }
}
