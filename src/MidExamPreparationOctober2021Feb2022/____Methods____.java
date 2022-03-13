package MidExamPreparationOctober2021Feb2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ____Methods____ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] test = nextIntArray(scanner, "@");
        double[] test2 = nextDoubleArray(scanner, "\\s+");
        List<Integer> test3 =nextIntegerList(scanner);


        int index = 0;
        boolean isValidIndex = isValidIndex(test, index);

        printIntArray(test, " ");
        printDoubleArray(test2, " ");

    }
    private static void printDoubleArray(double[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }
    private static void printIntArray(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }

    private static boolean isValidIndex(int[] targets, int index) {
        return index >= 0 && index < targets.length;
    }

    private static int[] nextIntArray(Scanner scanner, String separator) {
        int[] tempArray = Arrays.stream(scanner.nextLine().split(separator))
                .mapToInt(Integer::parseInt)
                .toArray();

        return tempArray;

    }

    private static double[] nextDoubleArray(Scanner scanner, String separator) {
        double[] tempArray = Arrays.stream(scanner.nextLine().split(separator))
                .mapToDouble(Double::parseDouble)
                .toArray();

        return tempArray;

    }
    private static List<Integer> nextIntegerList(Scanner scanner) {
        List<Integer> tempList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());
        return tempList;
    }
}
