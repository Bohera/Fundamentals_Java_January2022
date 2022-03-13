package ArraysLab;

import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String[] firstInputSeparate = firstInput.split("\\s+");
        String[] secondInputSeparate = secondInput.split("\\s+");

        int[] firstNumbersInt = new int[firstInputSeparate.length];
        int[] secondNumbersInt = new int[secondInputSeparate.length];

        for (int i = 0; i < firstInputSeparate.length; i++) {
            firstNumbersInt[i] = Integer.parseInt(firstInputSeparate[i]);
        }

        for (int i = 0; i < secondInputSeparate.length; i++) {
            secondNumbersInt[i] = Integer.parseInt(secondInputSeparate[i]);
        }

        int sum = 0;
        int differentIndex = 0;
        boolean arraysAreEquals;
        if (firstNumbersInt.length != secondNumbersInt.length) {
            arraysAreEquals = false;
        } else {
            arraysAreEquals = true;
            for (int i = 0; i < firstNumbersInt.length; i++) {
                sum += firstNumbersInt[i];
                if (firstNumbersInt[i] != secondNumbersInt[i]) {
                    arraysAreEquals = false;
                    differentIndex = i;
                    break;
                }
            }
        }
        if (arraysAreEquals) {
            System.out.printf("Arrays are identical. Sum: %s", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", differentIndex);
        }

    }
}
