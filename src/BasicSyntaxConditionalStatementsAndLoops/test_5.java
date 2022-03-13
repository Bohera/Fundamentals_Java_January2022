package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class test_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 18;
        System.out.println(age);
        age++;
        while (age < 18) {
            System.out.println(age);
            age++;
        }
        System.out.println(age);

    }
}
