package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder newLine = new StringBuilder();
        char previewsChar = '\0';
        for (int i = 0; i < line.length(); i++) {
            if (!(previewsChar == line.charAt(i))) {
                newLine.append(line.charAt(i));
                previewsChar = line.charAt(i);
            }
        }
        System.out.println(newLine);
    }
}
