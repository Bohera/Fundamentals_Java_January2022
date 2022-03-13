package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_071_Greshna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\|+"))
                .collect(Collectors.toList());

        List<Integer> output = new ArrayList<>();

        for (int i = input.size() - 1; i >= 0 ; i--) {
            List<Integer> tempList = Arrays.stream(input.get(i).trim().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            for (int j = 0; j < tempList.size(); j++) {
                output.add(tempList.get(j));
            }
        }
        for (Integer integer : output) {
            System.out.print(integer + " ");
        }

    }
}
