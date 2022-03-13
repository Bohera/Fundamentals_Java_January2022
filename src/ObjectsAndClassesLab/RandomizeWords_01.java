package ObjectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());
        Random random = new Random();

        for (int i = 0; i < words.size(); i++) {
            int randomIndexA = random.nextInt(words.size());
            int randomIndexB = random.nextInt(words.size());

            String randomWordA = words.get(randomIndexA);
            String randomWordB = words.get(randomIndexB);

            words.set(randomIndexA, randomWordB);
            words.set(randomIndexB, randomWordA);
        }

        for (String word : words) {
            System.out.println(word);
        }
    }

    //private static int random(int wordsSize) {
    //    Random random = new Random(wordsSize);

     //   return random.nextInt();
    //}
}
