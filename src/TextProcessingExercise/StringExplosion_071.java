package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion_071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line =  scanner.nextLine();

        StringBuilder sb = new StringBuilder(line);

        int indexOf = sb.indexOf(">");


        System.out.println(sb);
    }
}
