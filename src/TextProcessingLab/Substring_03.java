package TextProcessingLab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        while (secondText.contains(firstText)){
            secondText = secondText.replace(firstText, "");
        }

        System.out.println(secondText);

    }
}
