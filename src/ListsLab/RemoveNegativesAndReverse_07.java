package ListsLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int initialListSize = numbers.size();
        int indexCounter = 0;
        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) < 0) {
                numbers.remove(index);
                index--;
                indexCounter++;
            }
        }
        if (indexCounter == initialListSize) {
            System.out.println("empty");
            return;
        }
        Collections.reverse(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() -1) {
                System.out.print(" ");
            }
        }

    }
}
