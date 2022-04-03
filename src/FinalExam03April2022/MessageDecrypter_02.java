package FinalExam03April2022;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();

            Pattern messagePattern = Pattern.compile("^([$%])(?<tag>[A-Z][a-z]{2,})\\1:\\s\\[(?<char1>[0-9]+)\\]\\|\\[(?<char2>[0-9]+)\\]\\|\\[(?<char3>[0-9]+)\\]\\|$");
            Matcher messageMatcher = messagePattern.matcher(inputLine);

            if (!messageMatcher.find()) {
                System.out.println("Valid message not found!");
            } else {
                String tag = messageMatcher.group("tag");
                char charOne = (char)Integer.parseInt(messageMatcher.group("char1"));
                char charTwo = (char)Integer.parseInt(messageMatcher.group("char2"));
                char charThree = (char)Integer.parseInt(messageMatcher.group("char3"));
                String message = charOne + "" + charTwo + "" + charThree;
                System.out.printf("%s: %s%n", tag, message);
            }
        }
    }
}
