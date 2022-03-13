package ArraysLab;

import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[] {1,1,1,2,3,1,1,1,2,1,1,2,3,4,1,1,2};

        int longestLength = 0;
        int currentLength = 1;


        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                currentLength++;
            } else {
                if (longestLength < currentLength) {
                    longestLength = currentLength;
                }
                currentLength = 1;
            }
        }
        System.out.println(longestLength);

    }
}
