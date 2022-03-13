package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList2 = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> namesList = new ArrayList<>();
        String[] names = scanner.nextLine().split("\\s+");
        for (int i = 0; i < names.length; i++) {
            namesList.add(names[i]);
        }

        numbersList.replaceAll(el-> {
            if(el.equals(30)){
                return 40;
            } else {
                return el;
            }
        });
        int index = 0;
        while (index < numbersList.size()) {
            System.out.println(numbersList.get(index));
            index++;
        }
    }
}
