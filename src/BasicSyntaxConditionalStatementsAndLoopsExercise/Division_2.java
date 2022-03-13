package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Division_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int divider = 0;

        if (number % 10 == 0 ) {
            divider = 10;
        } else if (number % 7 == 0 ){
            divider = 7;
        } else if (number % 6 == 0 ){
            divider = 6;
        } else if (number % 3 == 0 ){
            divider = 3;
        } else if (number % 2 == 0 ){
            divider = 2;
        }

        if (divider == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", divider);
        }

    }

}

//import java.util.Scanner;
//
//public class Division_2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int number = scanner.nextInt();
//
//
//        if (number % 10 == 0 ) {
//            System.out.println("The number is divisible by 10");
//        } else if (number % 7 == 0 ){
//            System.out.println("The number is divisible by 7");
//        } else if (number % 6 == 0 ){
//            System.out.println("The number is divisible by 6");
//        } else if (number % 3 == 0 ){
//            System.out.println("The number is divisible by 3");
//        } else if (number % 2 == 0 ){
//            System.out.println("The number is divisible by 2");
//        } else {
//        System.out.println("Not divisible");
//            }
//    }
//
//}