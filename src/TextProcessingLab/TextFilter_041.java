package TextProcessingLab;

import java.util.Scanner;

public class TextFilter_041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedList = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedList) {
            String censor = repeatStr("*", bannedWord.length());
            text = text.replaceAll(bannedWord, censor);
        }
        System.out.println(text);
    }

    private static String repeatStr(String censorSymbol, int length) {
        String repeated = "";
        for (int i = 0; i < length; i++) {
            repeated += censorSymbol;
        }
        return repeated;
    }
}
