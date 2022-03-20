package RegularExpressionsLab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\+359([\\s-])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(line);

        List<String> matchedPhones = new LinkedList<>();
        while (phoneMatcher.find()) {
            matchedPhones.add(phoneMatcher.group());
        }
        System.out.println(String.join(", ", matchedPhones));
    }
}
