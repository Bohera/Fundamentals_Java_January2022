package TextProcessingLab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedList = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedList.length; i++) {
            int length = bannedList[i].length();
            String censor = "*";

            text = text.replaceAll(bannedList[i], censor.repeat(length));
        }
        System.out.println(text);
    }
}
