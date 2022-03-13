package DataTypesAndVariables;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String output = "";
        String reversed = "";

        for (int i = 0; i < 3; i++) {
            char input = scanner.nextLine().charAt(0);
            output += input;
        }
        for (int j = output.length() - 1; j >= 0 ; j--) {
            reversed += output.charAt(j) + " ";
        }

        System.out.println(reversed);
    }
}
