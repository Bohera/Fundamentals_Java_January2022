package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int lastChar = number % 10;
        String charName = "";

        switch (lastChar) {
            case 1:
                charName = "one";
                break;
            case 2:
                charName = "two";
                break;
            case 3:
                charName = "three";
                break;
            case 4:
                charName = "four";
                break;
            case 5:
                charName = "five";
                break;
            case 6:
                charName = "six";
                break;
            case 7:
                charName = "seven";
                break;
            case 8:
                charName = "eight";
                break;
            case 9:
                charName = "nine";
                break;
            case 0:
                charName = "zero";
                break;
        }

        System.out.println(charName);

    }
}
