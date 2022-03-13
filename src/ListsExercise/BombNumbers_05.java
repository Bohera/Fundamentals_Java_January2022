package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer ::parseInt)
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(data[0]);
        int power = Integer.parseInt(data[1]);

        while (numbers.contains(bomb)) {
            int bombIndex = numbers.indexOf(bomb);
            int start = bombIndex - power; // int start = Math.max(bombIndex - power, 0);
            int end = bombIndex + power;  // int start = Math.max(bombIndex + power, numbers.size() - 1);
            if (start < 0) {
                start = 0;
            }
            if (end >= numbers.size()) {
                end = numbers.size() - 1;
            }
            for (int i = end; i >= start; i--) {
                numbers.remove(i);
            }

            //for (int i = start; i <= start; i--) {
            //    numbers.remove(start);
            //}
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
