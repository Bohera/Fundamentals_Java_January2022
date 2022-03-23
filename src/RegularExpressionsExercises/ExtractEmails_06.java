package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String regexEmail = "(?<email>[A-Za-z0-9._-]+@[A-Za-z-.]*[A-Za-z]+)";  //[^._ -]+ \b(?<email>[A-Za-z0-9._-]+@[A-Za-z-.]+[A-Za-z]+)\b
        Pattern emailPattern = Pattern.compile(regexEmail);
        Matcher emailMatcher = emailPattern.matcher(line);

        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group("email"));
        }

    }
}
