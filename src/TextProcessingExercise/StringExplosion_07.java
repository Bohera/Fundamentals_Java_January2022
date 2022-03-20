package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        int strength = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != '>') {
                sb.append(line.charAt(i));
                if (strength > 0) {
                    strength--;
                }
            } else if (line.charAt(i) == '>'){
                sb.append(line.charAt(i));
                if (strength > 0) {
                    strength += Integer.parseInt(String.valueOf(line.charAt(i + 1)));
                    i--;
                } else {
                    strength = Integer.parseInt(String.valueOf(line.charAt(i + 1)));
                }


            }
        }

        System.out.println(sb);
    }
}
