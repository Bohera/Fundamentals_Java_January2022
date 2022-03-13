package MethodsExercise;

import java.util.Scanner;

public class test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 25;
        int b = 25;

        System.out.println(sumNumbers(3, 3, 5, 5,7));;
    }

    private static int sumNumbers(int...nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
