package FinalExamPreparationMoreProblems28March2022;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        long coolThreshold = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i)) && coolThreshold == 0) {
                coolThreshold = input.charAt(i) - '0';
            } else if (Character.isDigit(input.charAt(i))) {
                coolThreshold *= input.charAt(i) - '0';
            }
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);
        Map<String, Long> coolEmojiList = new LinkedHashMap<>();
        int emojiCounter = 0;
        Pattern emojiPattern = Pattern.compile("([:*])\\1(?<emoji>[A-Z][a-z]{2,})\\1\\1");
        Matcher emojiMatcher = emojiPattern.matcher(input);

        while (emojiMatcher.find()) {
            emojiCounter++;
            long currentEmojiCoolness = 0;
            for (int i = 0; i < emojiMatcher.group("emoji").length(); i++) {
                currentEmojiCoolness += emojiMatcher.group("emoji").charAt(i);
            }
            if (currentEmojiCoolness > coolThreshold) {
                coolEmojiList.put(emojiMatcher.group(), currentEmojiCoolness);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiCounter);
        coolEmojiList.forEach((k,v) -> System.out.println(k));
    }
}
