package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class TriangleOfNumbers_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int nWritten = 1;

        System.out.println(1);
        while (nWritten<n) {
            nWritten++;
            for (int i = 1; i <= nWritten; i++) {
                System.out.printf("%d ", nWritten);
            }
            System.out.println();
        }
    }
}
