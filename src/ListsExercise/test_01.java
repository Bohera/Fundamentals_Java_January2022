package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Peter", "Nikolay", "Kaloyan"};
        String[] names2 = new String[3];

        List<String> namesList = new ArrayList<>();
        namesList.add("Peter");
        namesList.add("Nikolay");
        namesList.add("Kaloyan");

        List<Integer> numbers = new ArrayList<>();
        numbers.set(0, 123);

        List<String> namesList2 = new ArrayList<>(Arrays.asList("Kaloyan", "Peter", "Nikolay", "Kaloyan"));
        namesList2.remove(2); //маха по индекс
        namesList2.remove("Kaloyan"); // маха по обект, като маха първия срещнат такъв
        namesList2.set(3, "Sofia");
        System.out.println();

    }
}
