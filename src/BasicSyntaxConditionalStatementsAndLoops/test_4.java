package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class test_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 17;
        int friendAge = 24;
        boolean haveGreenCertificate = true;

        if (!haveGreenCertificate && (age >= 18 || friendAge >= 18)) { //&&- и ||- или
            System.out.println("You can enter");
        } else {
                System.out.println("NOT allowed in");
            }

        }

}

