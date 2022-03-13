package DataTypesAndVariables;

import java.util.Scanner;

public class test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = 3.7F;

        double b = 0.1;
        double a = 0.2;
        double z = 0.3;

        double sum = a + b;
        System.out.println(sum);

        if (a + b == z) {
            System.out.println("correct");
        } else {
            System.out.println("Incorrect, the actual answer is: " + sum);
        }

    }
}
