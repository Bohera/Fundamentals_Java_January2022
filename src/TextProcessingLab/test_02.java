package TextProcessingLab;

import java.util.Scanner;

public class test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();


        if (a == b) { //== сравнява дали са на един и същ адрес, equals сравнява съдържанието
            System.out.println("equal");
        } else {
            System.out.println("NOT equal");
        }

        a = "text";
        b = "text";

        if (a == b) {
            System.out.println("equal");
        } else {
            System.out.println("NOT equal");
        }
    }
}
