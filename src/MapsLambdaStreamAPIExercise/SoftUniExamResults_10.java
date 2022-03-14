package MapsLambdaStreamAPIExercise;

import java.util.*;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String, Integer> userResults = new LinkedHashMap<>();
        Map<String, Integer> languageEntries = new LinkedHashMap<>();

        while (!line.equals("exam finished")) {
            String[] data = line.split("-");
            if (data.length == 3) {
                int score = Integer.parseInt(data[2]);
                //"{username}-{language}-{points}"
                userResults.putIfAbsent(data[0], score);
                if (userResults.get(data[0]) < score) {
                    userResults.put(data[0], score);
                }

                if (!languageEntries.containsKey(data[1])) {
                    languageEntries.put(data[1], 1);
                } else {
                    languageEntries.put(data[1], languageEntries.get(data[1]) + 1);
                }
            } else {
                userResults.remove(data[0]);
            }

            line = scanner.nextLine();
        }


        System.out.println("Results:");
        userResults.forEach((k, v) -> System.out.printf("%s | %d%n", k, v));
        System.out.println("Submissions:");
        languageEntries.forEach((k,v) -> System.out.printf("%s - %d%n", k, v));
    }

}
