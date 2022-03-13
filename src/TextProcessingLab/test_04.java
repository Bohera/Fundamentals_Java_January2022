package TextProcessingLab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class test_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Character> letters = new TreeSet<>();
        String text = "the quick brown fox jumps over the lazy dog";

        for (int i = 0; i < text.length(); i++) {
            letters.add(text.charAt(i));
        }

        for (Character letter : letters) {
            System.out.println(letter);
        }

    }
}
