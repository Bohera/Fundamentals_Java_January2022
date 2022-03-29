package FinalExamPreparationMoreProblems28March2022;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("([@#])(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1");
        Matcher pairsMatcher = pattern.matcher(line);

        Map<StringBuilder, StringBuilder> pairs = new LinkedHashMap<>();

        int pairCounter = 0;
        while (pairsMatcher.find()) {
            StringBuilder wordOne = new StringBuilder().append(pairsMatcher.group("word1"));
            StringBuilder wordTwo = new StringBuilder().append(pairsMatcher.group("word2"));
            StringBuilder reverseCheck = wordTwo.reverse();
            if (wordOne.toString().equals(reverseCheck.toString())) {
                pairs.put(wordOne, wordTwo.reverse());
            }
            pairCounter++;
        }
        if (pairCounter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", pairCounter);
        }
        if (pairs.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            int[] counter = {1};
            pairs.forEach((k,v) -> {
                System.out.printf("%s <=> %s", k, v);
                if (counter[0] < pairs.size()) {
                    System.out.print(", ");
                }
                counter[0]++;
            });

        }
    }
}
