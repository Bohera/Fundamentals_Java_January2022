package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            if (!(line.charAt(i) == '>')) {
                sb.append(line.charAt(i));
            } else {
                sb.append(line.charAt(i));
                int strength = Integer.parseInt(line.charAt(i + 1) + "");
                if (i + 1 <= line.length() || i + strength <= line.length()) {
                    for (int j = i + 1; j <= i + strength; j++) {
                        if (line.charAt(j) == '>') {
                            strength += Integer.parseInt(line.charAt(j + 1) + "") + 1;
                            sb.append(line.charAt(j));
                        }
                    }
                    i += strength;
                }
            }
        }

        System.out.println(sb);
    }
}
