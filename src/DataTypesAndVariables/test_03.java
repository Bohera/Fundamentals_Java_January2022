package DataTypesAndVariables;

import java.util.Scanner;

public class test_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte b;
        int y = Integer.parseInt(scanner.nextLine());

        b = (byte) y;

        System.out.println(b);
    }
}
