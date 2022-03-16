package RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("regex$");
        String userEmail = scanner.nextLine();
        Matcher matcher = pattern.matcher(userEmail);

        boolean isValid = matcher.find();
        if (isValid) {
            System.out.println(matcher.group(0));

        } else {
            System.out.println("Not found");
        }
    }


}
