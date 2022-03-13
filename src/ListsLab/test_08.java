package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(-8, 2, -2, 4, 8, -16));

        List<Integer> filtered = filterNegative(numbers);

        for (Integer number : filtered) {
            System.out.print(number + " ");
        }


    }

    private static List<Integer> filterNegative(List<Integer> numbers) {
        List<Integer> nonNegative = new ArrayList<>();
        for (Integer number : numbers) {
            if(number >= 0) {
                nonNegative.add(number);
            }
        }
        return nonNegative;
    }
}
