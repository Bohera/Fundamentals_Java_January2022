package MethodsLab;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOne = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double numTwo = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", calculate(numOne, operator, numTwo));
    }

    private static double calculate (double numOne,char operator, double numTwo) {
        double result = 0.0;
        switch (operator) {
            case '/':
                result = numOne / numTwo;
                break;
            case '*':
                result = numOne * numTwo;
                break;
            case '+':
                result = numOne + numTwo;
                break;
            case '-':
                result = numOne - numTwo;
                break;
        }
        return result;
    }
}
